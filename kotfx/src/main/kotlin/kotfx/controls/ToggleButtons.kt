@file:JvmMultifileClass
@file:JvmName("ControlsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kotfx

import javafx.scene.Node
import javafx.scene.control.ToggleButton
import kotfx.internal.ChildManager
import kotfx.internal.ItemManager
import kotfx.internal.KotfxDsl

@JvmOverloads
inline fun toggleButton(
        text: String? = null,
        graphic: Node? = null,
        noinline init: ((@KotfxDsl ToggleButton).() -> Unit)? = null
): ToggleButton = ToggleButton(text, graphic).apply { init?.invoke(this) }

@JvmOverloads
inline fun ChildManager.toggleButton(
        text: String? = null,
        graphic: Node? = null,
        noinline init: ((@KotfxDsl ToggleButton).() -> Unit)? = null
): ToggleButton = ToggleButton(text, graphic).apply { init?.invoke(this) }.add()

@JvmOverloads
inline fun ItemManager.toggleButton(
        text: String? = null,
        graphic: Node? = null,
        noinline init: ((@KotfxDsl ToggleButton).() -> Unit)? = null
): ToggleButton = ToggleButton(text, graphic).apply { init?.invoke(this) }.add()