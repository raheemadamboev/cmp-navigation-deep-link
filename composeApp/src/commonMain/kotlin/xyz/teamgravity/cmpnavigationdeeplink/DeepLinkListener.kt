package xyz.teamgravity.cmpnavigationdeeplink

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.navigation.NavHostController
import androidx.navigation.NavUri

@Composable
fun DeepLinkListener(
    controller: NavHostController
) {
    DisposableEffect(
        key1 = Unit,
        effect = {
            DeepLinkManager.setOnUriChanged { uri ->
                controller.navigate(NavUri(uri))
            }

            onDispose {
                DeepLinkManager.setOnUriChanged(null)
            }
        }
    )
}