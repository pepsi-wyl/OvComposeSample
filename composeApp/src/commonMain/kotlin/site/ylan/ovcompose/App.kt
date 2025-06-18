@file:OptIn(ExperimentalResourceApi::class)

package site.ylan.ovcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ylan_ovcompose_sample.composeapp.generated.resources.Res
import ylan_ovcompose_sample.composeapp.generated.resources.logo

@Composable
internal fun App() {
    HomePage()
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomePage() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val info = remember { PlatformInfo().info() }

            Image(
                modifier = Modifier.width(240.dp).size(240.dp),
                bitmap = rememberLocalImage(Res.drawable.logo),
                contentDescription = null
            )

            Text(text = "当前平台: $info")

            Button(
                onClick = {

                }
            ) {
                Text("开始使用")
            }
        }
    }
}