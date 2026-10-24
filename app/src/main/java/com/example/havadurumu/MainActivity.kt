package com.example.havadurumu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.havadurumu.ui.theme.HavaDurumuTheme
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        enableEdgeToEdge()
        setContent {
            HavaDurumuTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SayacEkrani(Modifier.padding(innerPadding))
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}


@Composable
fun SayacEkrani (modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }

    Column(modifier = modifier.padding(16.dp)) {
        Text("Sayaç Uygulaması")
        Card(Modifier.fillMaxWidth()) {
            Box(Modifier.padding(16.dp)) {
                Row {
                    Text("Sayaç: $count", Modifier.padding(end = 16.dp))
                    Button(onClick = {count ++}, Modifier.size(width = 120.dp, height = 48.dp)) {Text("Artır") }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SayacEkraniPreview() {
    HavaDurumuTheme {
       SayacEkrani()
    }
}