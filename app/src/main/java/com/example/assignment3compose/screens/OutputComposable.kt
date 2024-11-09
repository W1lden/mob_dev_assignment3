package com.example.assignment3compose.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.assignment3compose.ui.sharedviewmodel.SharedViewModel

@Composable
fun OutputComposable(viewModel: SharedViewModel = viewModel()) {
    Text(text = viewModel.text.value)
}
