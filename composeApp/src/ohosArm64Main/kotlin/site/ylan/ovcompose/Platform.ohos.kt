package site.ylan.ovcompose

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKString
import platform.ohos.OH_GetOSFullName

class OHOSPlatform : Platform {
    @OptIn(ExperimentalForeignApi::class)
    override val name: String = OH_GetOSFullName()?.toKString().orEmpty()
}

actual fun getPlatform(): Platform = OHOSPlatform()