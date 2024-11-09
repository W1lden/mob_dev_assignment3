package com.example.assignment3compose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment3compose.ui.navigation.NavigationGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavigationGraph(navController)
}
