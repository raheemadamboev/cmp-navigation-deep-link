package xyz.teamgravity.cmpnavigationdeeplink

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform