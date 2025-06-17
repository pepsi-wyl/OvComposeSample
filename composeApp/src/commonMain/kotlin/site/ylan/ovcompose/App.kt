package site.ylan.ovcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun App() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        val greeting = remember { PlatformInfo().info() }
        Text("CMP: $greeting")
    }
}