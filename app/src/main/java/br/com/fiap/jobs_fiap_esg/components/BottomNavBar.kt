package br.com.fiap.jobs_fiap_esg.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import br.com.fiap.jobs_fiap_esg.navigation.Screen

@Composable
fun BottomNavBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) },
            label = { Text("Vagas") },
            selected = currentRoute == Screen.Home.route,
            onClick = { 
                if (currentRoute != Screen.Home.route) {
                    navController.navigate(Screen.Home.route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        popUpTo(Screen.Home.route) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                }
            }
        )
        
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Default.BookmarkBorder, contentDescription = null) },
            label = { Text("Minhas vagas") },
            selected = currentRoute == Screen.Saved.route,
            onClick = { 
                if (currentRoute != Screen.Saved.route) {
                    navController.navigate(Screen.Saved.route) {
                        popUpTo(Screen.Home.route) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )
    }
}