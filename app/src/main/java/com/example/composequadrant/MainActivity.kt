package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Square()
                }
            }
        }
    }
}

@Composable
fun SmallSquare(
    title: String,
    description: String,
    modifier: Modifier
) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp)
    ) {
        Text(text = title)
        Text(text = description)
    }
}

@Composable
fun Square() {
    Column {
        Row(Modifier.weight(1f)) {
            SmallSquare(
                "Tekst komponowany",
                "Wyświetla tekst i postępuje zgodnie z wytycznymi Material Design.",
                Modifier.weight(1f)
            )
            SmallSquare(
                "Obraz komponowany",
                "Tworzy element do komponowania, który układa i rysuje dany obiekt klasy Painter.",
                Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            SmallSquare(
                "Wiersz komponowany",
                "Układ, który można komponować, umieszcza swoje elementy podrzędne w kolejności poziomej.",
                Modifier.weight(1f)
            )
            SmallSquare(
                "Kolumna komponowana",
                "Układ, który można komponować, umieszcza swoje elementy podrzędne w kolejności pionowej.",
                Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Square()
    }
}