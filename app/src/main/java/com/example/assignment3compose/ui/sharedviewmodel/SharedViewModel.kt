package com.example.assignment3compose.ui.sharedviewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val text = mutableStateOf("")
}
