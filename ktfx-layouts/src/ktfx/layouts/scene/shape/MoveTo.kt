@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

/* ktlint-disable package-name */
package ktfx.layouts

/* ktlint-enable package-name */

import javafx.scene.shape.MoveTo
import ktfx.PathElementManager
import ktfx.annotations.LayoutDsl

/** Creates a [MoveTo]. */
fun moveTo(
    x: Double = 0.0,
    y: Double = 0.0,
    init: ((@LayoutDsl MoveTo).() -> Unit)? = null
): MoveTo = MoveTo(x, y).also { init?.invoke(it) }

/** Creates a [MoveTo] and add it to this manager. */
inline fun PathElementManager.moveTo(
    x: Double = 0.0,
    y: Double = 0.0,
    noinline init: ((@LayoutDsl MoveTo).() -> Unit)? = null
): MoveTo = ktfx.layouts.moveTo(x, y, init)()