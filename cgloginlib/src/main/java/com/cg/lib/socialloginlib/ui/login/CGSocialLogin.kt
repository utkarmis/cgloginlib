package com.cg.lib.socialloginlib.ui.login

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SocialLogin(eventListener: (Int) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = { eventListener(1) }) {
            Text(
                text = "G",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.button
            )
        }
        Button(onClick = { eventListener(2) }) {
            Text(
                text = "F",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.button
            )
        }
        Button(onClick = { eventListener(3) }) {
            Text(
                text = "T",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.button
            )
        }
    }
}

fun socialLoginClickListener(eventType: Int): Unit {
    when (eventType) {
        0 -> {
            Log.v("TAG", "Login")

        }
        1 -> {
            Log.v("TAG", "Google")
        }
        2 -> {
            Log.v("TAG", "FB")

        }
        3 -> {

            Log.v("TAG", "Twitter")
        }
    }
}