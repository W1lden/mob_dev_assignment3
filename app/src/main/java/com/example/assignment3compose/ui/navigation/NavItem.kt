package com.example.assignment3compose.ui.navigation

sealed class NavItem(val route: String) {
    object Input : NavItem("input")
    object Output : NavItem("output")
    object MovieList : NavItem("movie_list")
    object LifecycleLogging : NavItem("lifecycle_logging")
}
