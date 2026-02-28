package xyz.teamgravity.cmpnavigationdeeplink

object DeepLinkManager {

    private var uri: String? = null
    private var onUriChanged: ((uri: String) -> Unit)? = null

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    fun setOnUriChanged(onUriChanged: ((uri: String) -> Unit)?) {
        this.onUriChanged = onUriChanged
        if (onUriChanged != null) {
            uri?.let { onUriChanged.invoke(it) }
            uri = null
        }
    }

    fun setUri(uri: String) {
        this.uri = uri
        onUriChanged?.let {
            it.invoke(uri)
            this.uri = null
        }
    }
}