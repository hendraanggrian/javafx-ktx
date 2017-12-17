@file:JvmMultifileClass
@file:JvmName("ControlsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kotfx

import javafx.scene.control.Accordion
import javafx.scene.control.TitledPane
import kotfx.internal.ChildManager
import kotfx.internal.ItemManager
import kotfx.internal.KotfxDsl

@JvmOverloads
inline fun accordion(
        vararg titledPanes: TitledPane,
        noinline init: ((@KotfxDsl Accordion).() -> Unit)? = null
): Accordion = Accordion(*titledPanes).apply { init?.invoke(this) }

@JvmOverloads
inline fun ChildManager.accordion(
        vararg titledPanes: TitledPane,
        noinline init: ((@KotfxDsl Accordion).() -> Unit)? = null
): Accordion = Accordion(*titledPanes).apply { init?.invoke(this) }.add()

@JvmOverloads
inline fun ItemManager.accordion(
        vararg titledPanes: TitledPane,
        noinline init: ((@KotfxDsl Accordion).() -> Unit)? = null
): Accordion = Accordion(*titledPanes).apply { init?.invoke(this) }.add()