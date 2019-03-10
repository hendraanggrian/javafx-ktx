@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.controlsfx

import ktfx.layouts.NodeManager
import ktfx.layouts.LayoutMarker
import org.controlsfx.control.RangeSlider

/** Creates a [RangeSlider]. */
fun rangeSlider(
    min: Double = 0.0,
    max: Double = 1.0,
    lowValue: Double = 0.25,
    highValue: Double = 0.75,
    init: ((@LayoutMarker RangeSlider).() -> Unit)? = null
): RangeSlider = RangeSlider(min, max, lowValue, highValue).also { init?.invoke(it) }

/** Creates a [RangeSlider] and add it to this manager. */
inline fun NodeManager.rangeSlider(
    min: Double = 0.0,
    max: Double = 1.0,
    lowValue: Double = 0.25,
    highValue: Double = 0.75,
    noinline init: ((@LayoutMarker RangeSlider).() -> Unit)? = null
): RangeSlider = ktfx.controlsfx.rangeSlider(min, max, lowValue, highValue, init).add()