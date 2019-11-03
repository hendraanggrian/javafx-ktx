@file:JvmMultifileClass
@file:JvmName("LayoutsKt")

package ktfx.layouts

import javafx.scene.shape.Mesh
import javafx.scene.shape.MeshView

/** Create a [MeshView] with initialization block. */
inline fun meshView(
    mesh: Mesh? = null,
    init: (@LayoutDslMarker MeshView).() -> Unit
): MeshView = MeshView(mesh).apply(init)

/** Add a [MeshView] to this manager. */
fun NodeManager.meshView(
    mesh: Mesh? = null
): MeshView = addNode(MeshView(mesh))

/** Add a [MeshView] with initialization block to this manager. */
inline fun NodeManager.meshView(
    mesh: Mesh? = null,
    init: (@LayoutDslMarker MeshView).() -> Unit
): MeshView = addNode(MeshView(mesh), init)
