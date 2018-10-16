@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

/* ktlint-disable package-name */
package ktfx.layouts

/* ktlint-enable package-name */

import javafx.scene.shape.ClosePath
import ktfx.PathElementManager
import ktfx.annotations.LayoutDsl

/** Creates a [ClosePath]. */
fun closePath(
    init: ((@LayoutDsl ClosePath).() -> Unit)? = null
): ClosePath = ClosePath().also { init?.invoke(it) }

/** Creates a [ClosePath] and add it to this manager. */
inline fun PathElementManager.closePath(
    noinline init: ((@LayoutDsl ClosePath).() -> Unit)? = null
): ClosePath = ktfx.layouts.closePath(init)()