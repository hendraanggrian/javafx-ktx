@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.TextArea

inline fun textArea(
    text: String = "",
    noinline init: ((@LayoutDsl TextArea).() -> Unit)? = null
): TextArea = TextArea(text).also { init?.invoke(it) }

inline fun LayoutManager<Node>.textArea(
    text: String = "",
    noinline init: ((@LayoutDsl TextArea).() -> Unit)? = null
): TextArea = ktfx.layouts.textArea(text, init).add()