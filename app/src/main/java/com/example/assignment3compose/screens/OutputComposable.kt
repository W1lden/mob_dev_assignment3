package com.example.assignment3compose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.assignment3compose.ui.sharedviewmodel.SharedViewModel
import com.example.assignment3compose.ui.sharedviewmodel.TextViewModel

@Composable
fun OutputComposable(textViewModel: TextViewModel = viewModel()) {
    val text by textViewModel.text.observeAsState("")

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Output:")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = text)  // Display the saved text from ViewModel
    }
}