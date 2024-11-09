package com.example.assignment3compose.ui.screens

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.assignment3compose.ui.sharedviewmodel.SharedViewModel

@Composable
fun InputComposable(viewModel: SharedViewModel = viewModel()) {
    TextField(
        value = viewModel.text.value,
        onValueChange = { viewModel.text.value = it },
        label = { Text("Enter text") }
    )
}
