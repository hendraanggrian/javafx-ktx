@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName")

/* ktlint-disable package-name */
package ktfx.layouts

/* ktlint-enable package-name */

import javafx.scene.Node
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.paint.Color.WHITE
import javafx.scene.paint.Paint
import ktfx.NodeManager
import ktfx.annotations.LayoutDsl
import ktfx.internal.KtfxInternals

open class _Scene(
    root: Parent,
    width: Double,
    height: Double,
    fill: Paint
) : Scene(root, width, height, fill), NodeManager by NodeManager.INVOKABLE_ONLY {

    override operator fun <T : Node> T.invoke(): T = also { root = KtfxInternals.asRegion(it) }
}

/** Create a [Scene] with initialization. */
fun scene(
    root: Parent = region(),
    width: Double = -1.0,
    height: Double = -1.0,
    fill: Paint = WHITE,
    init: ((@LayoutDsl _Scene).() -> Unit)? = null
): Scene = _Scene(root, width, height, fill).also { init?.invoke(it) }