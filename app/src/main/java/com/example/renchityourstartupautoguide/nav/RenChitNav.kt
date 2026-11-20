package com.example.renchityourstartupautoguide.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.renchityourstartupautoguide.repository.AuthRepository
import com.example.renchityourstartupautoguide.screens.AddEditSavedRepairScreen
import com.example.renchityourstartupautoguide.screens.HomeScreen
import com.example.renchityourstartupautoguide.screens.LoginScreen
import com.example.renchityourstartupautoguide.screens.ProblemTaskListScreen
import com.example.renchityourstartupautoguide.screens.RegisterScreen
import com.example.renchityourstartupautoguide.screens.RepairCategoriesScreen
import com.example.renchityourstartupautoguide.screens.RepairGuideScreen
import com.example.renchityourstartupautoguide.screens.SavedRepairsScreen
import com.example.renchityourstartupautoguide.screens.SplashScreen
import com.example.renchityourstartupautoguide.screens.VehicleTypeScreen
import com.example.renchityourstartupautoguide.screens.WarningSignsScreen
import com.example.renchityourstartupautoguide.screens.WarningListScreen
import com.example.renchityourstartupautoguide.screens.WarningDetailScreen
import com.example.renchityourstartupautoguide.viewmodel.AuthViewModel
import com.example.renchityourstartupautoguide.model.RenChitApplication
import com.example.renchityourstartupautoguide.model.RenChitFactory
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel
import com.example.renchityourstartupautoguide.viewmodel.ChecklistViewModel
import com.example.renchityourstartupautoguide.screens.ChecklistHubScreen
import com.example.renchityourstartupautoguide.screens.ChecklistScreen
import com.example.renchityourstartupautoguide.screens.ChecklistItemScreen
import com.example.renchityourstartupautoguide.screens.LearnHubScreen
import com.example.renchityourstartupautoguide.screens.LearnSystemScreen
import com.example.renchityourstartupautoguide.screens.LearnPartScreen
import com.example.renchityourstartupautoguide.screens.PartSearchScreen


@Composable
fun RenChitApp() {
    val navController = rememberNavController()

    val context = LocalContext.current.applicationContext
    val application = context as RenChitApplication
    val repository = application.repository
    val authRepo = AuthRepository()

    val factory = RenChitFactory(repository, authRepo)

    val viewModel: RenChitViewModel = viewModel(factory = factory)
    val authViewModel: AuthViewModel = viewModel(factory = factory)
    val checklistViewModel: ChecklistViewModel = viewModel(factory = factory)

    NavHost(navController = navController, startDestination = "splash") {

        composable("splash") {
            SplashScreen(navController, authViewModel)
        }

        composable("login") {
            LoginScreen(navController, authViewModel)
        }

        composable("register") {
            RegisterScreen(navController, authViewModel)
        }

        composable("home") {
            HomeScreen(
                onSelectVehicle = { type -> navController.navigate("repairCategories/$type") },
                username = authViewModel.getLoginUser() ?: "",
                onFindRepair = { navController.navigate("vehicleType") },
                onViewSaved = { navController.navigate("savedRepairs") },
                onWarningSigns = { navController.navigate("warningSigns") },
                onChecklist = { navController.navigate("checklist") },
                onLearn = { navController.navigate("learnHub") },
                onSearchParts = { navController.navigate("partSearch") },
                onLogout = {
                    authViewModel.logout()
                    checklistViewModel.clear()
                    navController.navigate("login") {
                        popUpTo("home") { inclusive = true }
                    }
                }
            )
        }
        composable("checklist") {
            ChecklistHubScreen(
                viewModel = checklistViewModel,
                onSelectCategory = { categoryId: String ->
                    navController.navigate("checklistList/$categoryId")
                },
                onBack = {
                    checklistViewModel.clear()
                    navController.popBackStack()
                }
            )
        }
        composable(
            route = "checklistList/{categoryId}",
            arguments = listOf(
                navArgument("categoryId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val categoryId =
                backStackEntry.arguments?.getString("categoryId") ?: ""

            ChecklistScreen(
                categoryId = categoryId,
                viewModel = checklistViewModel,
                onSelectItem = { itemId ->
                    navController.navigate("checklistDetail/$itemId")
                },
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Checklist Item Details
        composable(
            route = "checklistDetail/{itemId}",
            arguments = listOf(
                navArgument("itemId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->

            val itemId =
                backStackEntry.arguments?.getString("itemId") ?: ""

            ChecklistItemScreen(
                itemId = itemId,
                viewModel = checklistViewModel,
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // Warning Signs Landing Screen
        composable("warningSigns") {
            WarningSignsScreen(
                onSelectCategory = { categoryId ->
                    navController.navigate("warningList/$categoryId")
                },
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        // Warning Signs Category List Screen
        composable(
            route = "warningList/{categoryId}",
            arguments = listOf(
                navArgument("categoryId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val categoryId =
                backStackEntry.arguments?.getString("categoryId") ?: ""

            WarningListScreen(
                categoryId = categoryId,
                onSelectItem = { itemId ->
                    navController.navigate("warningDetail/$itemId")
                },
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        // Warning Signs Detail Screen
        composable(
            route = "warningDetail/{itemId}",
            arguments = listOf(
                navArgument("itemId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val itemId =
                backStackEntry.arguments?.getString("itemId") ?: ""

            WarningDetailScreen(
                itemId = itemId,
                onBack = {
                    navController.popBackStack()
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
                    if (saved != null && viewModel.getGuide(saved.guideId) != null) {
                        navController.navigate("repairGuide/${saved.guideId}")
                    }
                },
                onEdit = { savedId -> navController.navigate("addEditSavedRepair?savedRepairId=$savedId") },
                onBack = { navController.popBackStack("home", inclusive = false) }
            )
        }

        composable(
            route = "addEditSavedRepair?savedRepairId={savedRepairId}",
            arguments = listOf(navArgument("savedRepairId") {
                type = NavType.StringType
                defaultValue = ""
            })
        ) { backStackEntry ->
            val rawId = backStackEntry.arguments?.getString("savedRepairId") ?: ""
            AddEditSavedRepairScreen(
                viewModel = viewModel,
                savedRepairId = rawId.ifEmpty { null },
                onDone = { navController.popBackStack() }
            )
        }
        // ---------- Part Search ----------
        composable("partSearch") {
            PartSearchScreen(
                onSelectPart = { partId ->
                    navController.navigate("learnPart/$partId")
                },
                onBack = {
                    navController.popBackStack()
                }
            )
        }
        // ---------- Learn Your Car ----------
        composable("learnHub") {
            LearnHubScreen(
                onSelectSystem = { systemId ->
                    navController.navigate("learnSystem/$systemId")
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "learnSystem/{systemId}",
            arguments = listOf(navArgument("systemId") { type = NavType.StringType })
        ) { backStackEntry ->
            val systemId = backStackEntry.arguments?.getString("systemId") ?: ""
            LearnSystemScreen(
                systemId = systemId,
                onSelectPart = { partId ->
                    navController.navigate("learnPart/$partId")
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "learnPart/{partId}",
            arguments = listOf(navArgument("partId") { type = NavType.StringType })
        ) { backStackEntry ->
            val partId = backStackEntry.arguments?.getString("partId") ?: ""
            LearnPartScreen(
                partId = partId,
                onSelectPart = { relatedId ->
                    navController.navigate("learnPart/$relatedId")
                },
                onBack = { navController.popBackStack() }
            )
        }
    }
}
