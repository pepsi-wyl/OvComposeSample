package site.ylan.ovcompose

class PlatformInfo {
    private val platform = getPlatform()

    fun info(): String {
        return platform.name
    }
}

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform