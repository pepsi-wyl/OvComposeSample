package site.ylan.ovcompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.UikitImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.withContext
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import platform.Foundation.NSBundle
import platform.UIKit.UIImage

private val emptyImageBitmap: ImageBitmap by lazy { ImageBitmap(1, 1) }

private val imageFolderPath: String by lazy { "${NSBundle.mainBundle().bundlePath}/compose-resources/" }

@OptIn(ExperimentalResourceApi::class)
@Composable
actual fun rememberLocalImage(id: DrawableResource): ImageBitmap {
    var imageBitmap: ImageBitmap by remember { mutableStateOf(emptyImageBitmap) }
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            val imagePath = "$imageFolderPath/${id.resourceItemPath()}"
            val image = UIImage.imageNamed(imagePath) ?: return@withContext
            imageBitmap = UikitImageBitmap(image)
        }
    }
    return imageBitmap
}