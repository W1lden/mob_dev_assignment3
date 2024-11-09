package com.example.assignment3compose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.assignment3compose.ui.sharedviewmodel.SharedViewModel
import com.example.assignment3compose.ui.sharedviewmodel.TextViewModel

@Composable
fun InputComposable(onSave: (String) -> Unit) {
    var text = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Text input field
        TextField(
            value = text.value,
            onValueChange = { text.value = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Enter text") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Save button
        Button(
            onClick = { onSave(text.value) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save")
        }
    }
}

