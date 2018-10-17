@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

/* ktlint-disable package-name */
package ktfx.jfoenix

/* ktlint-enable package-name */

import com.jfoenix.controls.JFXPasswordField
import ktfx.NodeManager
import ktfx.annotations.LayoutDsl

/** Creates a [JFXPasswordField]. */
fun jfxPasswordField(
    init: ((@LayoutDsl JFXPasswordField).() -> Unit)? = null
): JFXPasswordField = JFXPasswordField().also { init?.invoke(it) }

/** Creates a [JFXPasswordField] and add it to this manager. */
inline fun NodeManager.jfxPasswordField(
    noinline init: ((@LayoutDsl JFXPasswordField).() -> Unit)? = null
): JFXPasswordField = ktfx.jfoenix.jfxPasswordField(init)()