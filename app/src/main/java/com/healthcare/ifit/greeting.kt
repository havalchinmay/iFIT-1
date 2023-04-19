package com.healthcare.ifit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class greeting : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Greeting(drawableResId = R.drawable.greetings,
                onNavigateToLogin = {}
            )
        }
    }
}

@Composable
fun Greeting(
    drawableResId: Int,
    onNavigateToLogin: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val painter: Painter = painterResource(id = drawableResId)
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )

        Button(onClick = onNavigateToLogin,
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(bottom = 64.dp)
        ) {
            Text(text = "Let's Get Started")
        }

    }
}

