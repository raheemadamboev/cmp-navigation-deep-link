import SwiftUI
import ComposeApp

@main
struct iOSApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView()
                .onOpenURL { URL in
                    DeepLinkManager.shared.setUri(uri: URL.absoluteString)
                }
        }
    }
}
