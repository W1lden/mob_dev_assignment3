// TextViewModel.kt
package com.example.assignment3compose.ui.sharedviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    private val _text = MutableLiveData<String>()
    val text: LiveData<String> get() = _text

    fun setText(newText: String) {
        _text.value = newText
    }
}
