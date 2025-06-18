package site.ylan.ovcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.imageResource

@OptIn(ExperimentalResourceApi::class)
@Composable
actual fun rememberLocalImage(id: DrawableResource): ImageBitmap {
    return imageResource(resource = id)
}