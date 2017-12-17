@file:JvmMultifileClass
@file:JvmName("ControlsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kotfx

import javafx.scene.control.TextField
import kotfx.internal.ChildManager
import kotfx.internal.ItemManager
import kotfx.internal.KotfxDsl

@JvmOverloads
inline fun textField(
        text: String = "",
        noinline init: ((@KotfxDsl TextField).() -> Unit)? = null
): TextField = TextField(text).apply { init?.invoke(this) }

@JvmOverloads
inline fun ChildManager.textField(
        text: String = "",
        noinline init: ((@KotfxDsl TextField).() -> Unit)? = null
): TextField = TextField(text).apply { init?.invoke(this) }.add()

@JvmOverloads
inline fun ItemManager.textField(
        text: String = "",
        noinline init: ((@KotfxDsl TextField).() -> Unit)? = null
): TextField = TextField(text).apply { init?.invoke(this) }.add()