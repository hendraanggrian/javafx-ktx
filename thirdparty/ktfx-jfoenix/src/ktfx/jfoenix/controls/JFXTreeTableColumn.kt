@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName")

/* ktlint-disable package-name */
package ktfx.jfoenix

/* ktlint-enable package-name */

import com.jfoenix.controls.JFXTreeTableColumn
import com.jfoenix.controls.JFXTreeTableView
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject
import javafx.scene.control.TreeTableColumn
import ktfx.internal.Manager

/** Interface to build [JFXTreeTableColumn] with Kotlin DSL. */
interface JFXTreeTableColumnsBuilder<S : RecursiveTreeObject<S>> {

    fun <T> column(
        text: String? = null,
        init: (JFXTreeTableColumn<S, T>.() -> Unit)? = null
    ): JFXTreeTableColumn<S, T>

    operator fun <T> String.invoke(
        init: (JFXTreeTableColumn<S, T>.() -> Unit)? = null
    ): JFXTreeTableColumn<S, T> = column(this, init)
}

@PublishedApi
internal class _JFXTreeTableColumnsBuilder<S : RecursiveTreeObject<S>> : JFXTreeTableColumnsBuilder<S>,
    Manager<JFXTreeTableColumn<S, *>> by Manager.Empty() {

    override fun <T> column(text: String?, init: (JFXTreeTableColumn<S, T>.() -> Unit)?): JFXTreeTableColumn<S, T> =
        JFXTreeTableColumn<S, T>(text).also { init?.invoke(it) }()
}

/** Invokes a [TreeTableColumn] DSL builder. */
inline fun <S : RecursiveTreeObject<S>> JFXTreeTableView<S>.columns(init: JFXTreeTableColumnsBuilder<S>.() -> Unit) {
    columns += _JFXTreeTableColumnsBuilder<S>().apply(init).collection
}