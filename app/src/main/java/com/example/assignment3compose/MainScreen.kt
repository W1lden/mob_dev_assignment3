package com.example.assignment3compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment3compose.ui.components.LifecycleLoggingComposable
import com.example.assignment3compose.ui.components.MovieListScreen
import com.example.assignment3compose.ui.navigation.NavigationGraph
import com.example.assignment3compose.ui.screens.InputComposable
import com.example.assignment3compose.ui.screens.OutputComposable
import com.example.assignment3compose.ui.sharedviewmodel.TextViewModel

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val textViewModel: TextViewModel = viewModel()

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        // Navigation Buttons
        Button(onClick = { navController.navigate("input") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text(text = "Input Screen")
        }
        Button(onClick = { navController.navigate("output") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text(text = "Output Screen")
        }
        Button(onClick = { navController.navigate("movie_list") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text(text = "Movie List Screen")
        }
        Button(onClick = { navController.navigate("lifecycle_logging") }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
            Text(text = "Lifecycle Logging Screen")
        }
        NavHost(navController = navController, startDestination = "input") {
            composable("input") {
                InputComposable(
                    onSave = { textViewModel.setText(it) }
                )
            }
            composable("output") {
                OutputComposable(textViewModel = textViewModel)
            }
            composable("movie_list") {
                MovieListScreen(movies = listOf("Movie 1", "Movie 2", "Movie 3"))
            }
            composable("lifecycle_logging") {
                LifecycleLoggingComposable()
            }
        }
    }
}