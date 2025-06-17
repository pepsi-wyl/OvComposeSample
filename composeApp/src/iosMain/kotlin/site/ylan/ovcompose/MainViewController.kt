package site.ylan.ovcompose

import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.window.ComposeUIViewController
import kotlin.experimental.ExperimentalObjCName

@OptIn(ExperimentalObjCName::class)
@ObjCName("MainViewController")
fun MainViewController() = ComposeUIViewController(
    configure = {
        onFocusBehavior = OnFocusBehavior.DoNothing
    }
) {
    App()
}

//@OptIn(ExperimentalObjCName::class)
//@ObjCName("SkiaRenderViewController")
//fun SkiaRenderMainViewController() = ComposeUIViewController(
//    configure = {
//        onFocusBehavior = OnFocusBehavior.DoNothing
//        renderBackend = RenderBackend.Skia
//    }
//) {
//    App()
//}