package com.example.assignment3compose.ui.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun MovieListScreen(movies: List<String>) {
    val context = LocalContext.current

    LazyColumn {
        items(movies) { movie ->
            Text(
                text = movie,
                modifier = Modifier
                    .padding(8.dp)
                    .clickable {
                        Toast.makeText(context, "Clicked on $movie", Toast.LENGTH_SHORT).show()
                    }
            )
        }
    }
}
