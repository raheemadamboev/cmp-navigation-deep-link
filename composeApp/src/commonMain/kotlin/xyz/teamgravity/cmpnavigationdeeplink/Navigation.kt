package xyz.teamgravity.cmpnavigationdeeplink

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navDeepLink
import androidx.navigation.toRoute

@Composable
fun Navigation(
    controller: NavHostController = rememberNavController()
) {
    DeepLinkListener(controller)

    NavHost(
        navController = controller,
        startDestination = Route.List
    ) {
        composable<Route.List> {
            ListScreen(controller)
        }
        composable<Route.Detail>(
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "https://david.goggins/item/{index}"
                },
                navDeepLink {
                    uriPattern = "hard://david.goggins/item/{index}"
                }
            )
        ) { entry ->
            val route = entry.toRoute<Route.Detail>()
            DetailScreen(route.index)
        }
    }
}