package com.example.renchityourstartupautoguide.nav

import androidx.compose.ui.platform.LocalContext
import com.example.renchityourstartupautoguide.viewmodel.RenChitFactory
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.renchityourstartupautoguide.screens.AddEditSavedRepairScreen
import com.example.renchityourstartupautoguide.screens.HomeScreen
import com.example.renchityourstartupautoguide.screens.LoginScreen
import com.example.renchityourstartupautoguide.screens.ProblemTaskListScreen
import com.example.renchityourstartupautoguide.screens.RegisterScreen
import com.example.renchityourstartupautoguide.screens.RepairCategoriesScreen
import com.example.renchityourstartupautoguide.screens.RepairGuideScreen
import com.example.renchityourstartupautoguide.screens.SavedRepairsScreen
import com.example.renchityourstartupautoguide.screens.VehicleTypeScreen
import com.example.renchityourstartupautoguide.viewmodel.AuthViewModel
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel
import com.example.renchityourstartupautoguide.viewmodel.RenChitApplication

@Composable
fun RenChitApp() {
    val navController = rememberNavController()

    val context = LocalContext.current.applicationContext

    val application = context as RenChitApplication
    val repository = application.repository

    val viewModel: RenChitViewModel =
        viewModel(factory = RenChitFactory(repository))

    val authViewModel: AuthViewModel = viewModel()

    NavHost(navController = navController, startDestination = "login") {

        composable("login") {
            LoginScreen(
                authViewModel = authViewModel,
                onLoggedIn = {
                    navController.navigate("home") {
                        popUpTo("login") { inclusive = true }
                    }
                },
                onGoToRegister = { navController.navigate("register") }
            )
        }

        composable("register") {
            RegisterScreen(
                authViewModel = authViewModel,
                onRegistered = {
                    navController.navigate("home") {
                        popUpTo("login") { inclusive = true }
                    }
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable("home") {
            HomeScreen(
                username = authViewModel.currentUser?.username ?: "",
                onFindRepair = { navController.navigate("vehicleType") },
                onViewSaved = { navController.navigate("savedRepairs") },
                onLogout = {
                    authViewModel.logout()
                    navController.navigate("login") {
                        popUpTo("home") { inclusive = true }
                    }
                }
            )
        }

        composable("vehicleType") {
            VehicleTypeScreen(
                onSelect = { vehicleType -> navController.navigate("repairCategories/$vehicleType") },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "repairCategories/{vehicleType}",
            arguments = listOf(navArgument("vehicleType") { type = NavType.StringType })
        ) { backStackEntry ->
            val vehicleType = backStackEntry.arguments?.getString("vehicleType") ?: ""
            RepairCategoriesScreen(
                viewModel = viewModel,
                vehicleType = vehicleType,
                onSelectCategory = { category ->
                    navController.navigate("problemTaskList/$vehicleType/$category")
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "problemTaskList/{vehicleType}/{category}",
            arguments = listOf(
                navArgument("vehicleType") { type = NavType.StringType },
                navArgument("category") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val vehicleType = backStackEntry.arguments?.getString("vehicleType") ?: ""
            val category = backStackEntry.arguments?.getString("category") ?: ""
            ProblemTaskListScreen(
                viewModel = viewModel,
                vehicleType = vehicleType,
                category = category,
                onSelectGuide = { guideId -> navController.navigate("repairGuide/$guideId") },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "repairGuide/{guideId}",
            arguments = listOf(navArgument("guideId") { type = NavType.IntType })
        ) { backStackEntry ->
            val guideId = backStackEntry.arguments?.getInt("guideId") ?: -1
            RepairGuideScreen(
                viewModel = viewModel,
                guideId = guideId,
                onSaved = {
                    navController.navigate("savedRepairs") {
                        popUpTo("home")
                    }
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable("savedRepairs") {
            SavedRepairsScreen(
                viewModel = viewModel,
                onAddRepair = { navController.navigate("addEditSavedRepair") },
                onView = { savedId ->
                    val saved = viewModel.getSavedRepair(savedId)
                    if (saved != null) {
                        navController.navigate("repairGuide/${saved.guideId}")
                    }
                },
                onEdit = { savedId -> navController.navigate("addEditSavedRepair?savedRepairId=$savedId") },
                onBack = { navController.popBackStack("home", inclusive = false) }
            )
        }

        composable(
            route = "addEditSavedRepair?savedRepairId={savedRepairId}",
            arguments = listOf(navArgument("savedRepairId") { type = NavType.IntType; defaultValue = -1 })
        ) { backStackEntry ->
            val rawId = backStackEntry.arguments?.getInt("savedRepairId") ?: -1
            AddEditSavedRepairScreen(
                viewModel = viewModel,
                savedRepairId = if (rawId == -1) null else rawId,
                onDone = { navController.popBackStack() }
            )
        }
    }
}