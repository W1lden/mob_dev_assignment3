package com.example.assignment3compose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.assignment3compose.ui.screens.InputComposable
import com.example.assignment3compose.ui.screens.OutputComposable
import com.example.assignment3compose.ui.components.MovieListScreen
import com.example.assignment3compose.ui.components.LifecycleLoggingComposable

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = NavItem.Input.route) {
        composable(NavItem.Input.route) { InputComposable() }
        composable(NavItem.Output.route) { OutputComposable() }
        composable(NavItem.MovieList.route) {
            MovieListScreen(listOf("Movie 1", "Movie 2", "Movie 3"))
        }
        composable(NavItem.LifecycleLogging.route) { LifecycleLoggingComposable() }
    }
}
