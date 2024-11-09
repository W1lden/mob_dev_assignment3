package com.example.assignment3compose.ui.components

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect

@Composable
fun LifecycleLoggingComposable() {
    DisposableEffect(Unit) {
        Log.d("LifecycleLogging", "Composable onStart")
        onDispose {
            Log.d("LifecycleLogging", "Composable onDispose")
        }
    }
    Text(text = "Hello from Compose!")
}
