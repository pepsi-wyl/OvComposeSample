package site.ylan.ovcompose

import androidx.compose.ui.window.ComposeArkUIViewController
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.initMainHandler
import platform.ohos.napi_env
import platform.ohos.napi_value
import kotlin.experimental.ExperimentalNativeApi

@OptIn(ExperimentalNativeApi::class, ExperimentalForeignApi::class)
@CName("MainArkUIViewController")
fun MainArkUIViewController(env: napi_env): napi_value {
    initMainHandler(env)
    return ComposeArkUIViewController(env) {
        App()
    }
}

@OptIn(ExperimentalForeignApi::class)
fun initResourceManager(resourceManager: NativeResourceManager) {
    nativeResourceManager = resourceManager
}