package xyz.teamgravity.cmpnavigationdeeplink

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object List : Route

    @Serializable
    data class Detail(
        val index: Int
    ) : Route
}