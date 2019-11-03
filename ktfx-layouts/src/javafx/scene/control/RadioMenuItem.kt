@file:JvmMultifileClass
@file:JvmName("LayoutsKt")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.RadioMenuItem

/** Create a [RadioMenuItem] with initialization block. */
inline fun radioMenuItem(
    text: String? = null,
    graphic: Node? = null,
    init: (@LayoutDslMarker RadioMenuItem).() -> Unit
): RadioMenuItem = RadioMenuItem(text, graphic).apply(init)

/** Add a [RadioMenuItem] to this manager. */
fun MenuItemManager.radioMenuItem(
    text: String? = null,
    graphic: Node? = null
): RadioMenuItem = addItem(RadioMenuItem(text, graphic))

/** Add a [RadioMenuItem] with initialization block to this manager. */
inline fun MenuItemManager.radioMenuItem(
    text: String? = null,
    graphic: Node? = null,
    init: (@LayoutDslMarker RadioMenuItem).() -> Unit
): RadioMenuItem = addItem(RadioMenuItem(text, graphic), init)