@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.control.ColorPicker
import javafx.scene.paint.Color
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [ColorPicker] with initialization block. */
inline fun colorPicker(
    value: Color = Color.WHITE,
    init: (@LayoutsDslMarker ColorPicker).() -> Unit
): ColorPicker {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return ColorPicker(value).apply(init)
}

/** Add a [ColorPicker] to this manager. */
fun NodeManager.colorPicker(
    value: Color = Color.WHITE
): ColorPicker = addChild(ColorPicker(value))

/** Add a [ColorPicker] with initialization block to this manager. */
inline fun NodeManager.colorPicker(
    value: Color = Color.WHITE,
    init: (@LayoutsDslMarker ColorPicker).() -> Unit
): ColorPicker {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return addChild(ColorPicker(value), init)
}
