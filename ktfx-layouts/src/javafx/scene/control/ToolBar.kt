@file:JvmMultifileClass
@file:JvmName("LayoutsKt")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.ToolBar

open class KtfxToolBar : ToolBar(), NodeManager {

    final override fun <T : Node> addNode(node: T): T =
        node.also { items += it }
}

/** Create a [ToolBar] with initialization block. */
inline fun toolBar(
    init: (@LayoutDslMarker KtfxToolBar).() -> Unit
): ToolBar = KtfxToolBar().apply(init)

/** Add a [ToolBar] to this manager. */
fun NodeManager.toolBar(): ToolBar =
    addNode(KtfxToolBar())

/** Add a [ToolBar] with initialization block to this manager. */
inline fun NodeManager.toolBar(
    init: (@LayoutDslMarker KtfxToolBar).() -> Unit
): ToolBar = addNode(KtfxToolBar(), init)
