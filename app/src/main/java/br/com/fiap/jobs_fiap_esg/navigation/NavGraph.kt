 package br.com.fiap.jobs_fiap_esg.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import br.com.fiap.jobs_fiap_esg.screens.JobDetailScreen
import br.com.fiap.jobs_fiap_esg.screens.VagasApp
import br.com.fiap.jobs_fiap_esg.screens.MinhasVagasScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object JobDetail : Screen("job_detail/{jobId}") {
        fun createRoute(jobId: String) = "job_detail/$jobId"
    }
    object Saved : Screen("saved")
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        // Tela principal com listagem de vagas
        composable(route = Screen.Home.route) {
            VagasApp(navController = navController)
        }
        
        // Tela de detalhes da vaga
        composable(
            route = Screen.JobDetail.route,
            arguments = listOf(
                navArgument("jobId") {
                    type = NavType.StringType
                }
            )
        ) {
            JobDetailScreen(navController = navController)
        }
        
        // Tela de vagas salvas/favoritas
        composable(route = Screen.Saved.route) {
             MinhasVagasScreen(navController = navController)
        }
    }
}