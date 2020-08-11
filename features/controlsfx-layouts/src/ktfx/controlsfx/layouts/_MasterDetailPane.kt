@file:JvmMultifileClass
@file:JvmName("ControlsFxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.controlsfx.layouts

import javafx.geometry.Side
import javafx.geometry.Side.RIGHT
import ktfx.internal.KtfxInternals.newChild
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import org.controlsfx.control.MasterDetailPane
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [MasterDetailPane] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.masterDetailPane(detailSide: Side = RIGHT, showDetailNode: Boolean = true):
    MasterDetailPane = masterDetailPane(
        detailSide = detailSide,
        showDetailNode =
            showDetailNode
    ) { }

/**
 * Create a [MasterDetailPane] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
inline fun masterDetailPane(
    detailSide: Side = RIGHT,
    showDetailNode: Boolean = true,
    configuration: (@LayoutDslMarker KtfxMasterDetailPane).() -> Unit
): MasterDetailPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(KtfxMasterDetailPane(detailSide, showDetailNode), configuration = configuration)
}

/**
 * Add a [MasterDetailPane] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
inline fun NodeManager.masterDetailPane(
    detailSide: Side = RIGHT,
    showDetailNode: Boolean = true,
    configuration: (@LayoutDslMarker KtfxMasterDetailPane).() -> Unit
): MasterDetailPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(
        newChild(
            KtfxMasterDetailPane(detailSide, showDetailNode),
            configuration =
                configuration
        )
    )
}

/**
 * Create a styled [MasterDetailPane].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
fun styledMasterDetailPane(
    detailSide: Side = RIGHT,
    showDetailNode: Boolean = true,
    vararg styleClass: String,
    id: String? = null
): MasterDetailPane = styledMasterDetailPane(
    detailSide = detailSide,
    showDetailNode =
        showDetailNode,
    styleClass = *styleClass, id = id
) { }

/**
 * Add a styled [MasterDetailPane] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
fun NodeManager.styledMasterDetailPane(
    detailSide: Side = RIGHT,
    showDetailNode: Boolean = true,
    vararg styleClass: String,
    id: String? = null
): MasterDetailPane = styledMasterDetailPane(
    detailSide = detailSide,
    showDetailNode =
        showDetailNode,
    styleClass = *styleClass, id = id
) { }

/**
 * Create a styled [MasterDetailPane] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
inline fun styledMasterDetailPane(
    detailSide: Side = RIGHT,
    showDetailNode: Boolean = true,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxMasterDetailPane).() -> Unit
): MasterDetailPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(
        KtfxMasterDetailPane(detailSide, showDetailNode), styleClass = *styleClass,
        id =
            id,
        configuration = configuration
    )
}

/**
 * Add a styled [MasterDetailPane] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
inline fun NodeManager.styledMasterDetailPane(
    detailSide: Side = RIGHT,
    showDetailNode: Boolean = true,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxMasterDetailPane).() -> Unit
): MasterDetailPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(
        newChild(
            KtfxMasterDetailPane(detailSide, showDetailNode),
            styleClass =
                *styleClass,
            id = id, configuration = configuration
        )
    )
}