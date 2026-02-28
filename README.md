# cmp-navigation-deep-link

<p align="center">
  <img width="296" height="600" src="https://github.com/raheemadamboev/cmp-navigation-deep-link/blob/main/extra/banner_android.gif" />
  <img width="296" height="600" src="https://github.com/raheemadamboev/cmp-navigation-deep-link/blob/main/extra/banner_ios.gif" />
</p>

A simple app that demonstrates handling deep links in Compose Multiplatform (Android + iOS).

Android

```cmd
adb shell am start -W -a android.intent.action.VIEW -d "https://david.goggins/item/45" xyz.teamgravity.cmpnavigationdeeplink
```

iOS

```cmd
xcrun simctl openurl booted "hard://david.goggins/item/32"
```

[Download demo](https://github.com/raheemadamboev/cmp-navigation-deep-link/blob/main/extra/app-debug.apk)
