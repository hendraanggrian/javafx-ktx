@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXMasonryPane
import ktfx.internal.KtfxInternals.newChild
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [JFXMasonryPane] to this manager.
 *
 * @return the control added.
 */
fun NodeManager.jfxMasonryPane(): JFXMasonryPane = jfxMasonryPane() { }

/**
 * Create a [JFXMasonryPane] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
inline fun jfxMasonryPane(configuration: (@LayoutDslMarker KtfxJFXMasonryPane).() -> Unit):
    JFXMasonryPane {
        contract { callsInPlace(configuration, EXACTLY_ONCE) }
        return newChild(KtfxJFXMasonryPane(), configuration = configuration)
    }

/**
 * Add a [JFXMasonryPane] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
inline fun NodeManager.jfxMasonryPane(
    configuration: (@LayoutDslMarker KtfxJFXMasonryPane).() ->
    Unit
): JFXMasonryPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(newChild(KtfxJFXMasonryPane(), configuration = configuration))
}

/**
 * Create a styled [JFXMasonryPane].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
fun styledJFXMasonryPane(vararg styleClass: String, id: String? = null): JFXMasonryPane =
    styledJFXMasonryPane(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [JFXMasonryPane] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
fun NodeManager.styledJFXMasonryPane(vararg styleClass: String, id: String? = null): JFXMasonryPane =
    styledJFXMasonryPane(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [JFXMasonryPane] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
inline fun styledJFXMasonryPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxJFXMasonryPane).() -> Unit
): JFXMasonryPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(
        KtfxJFXMasonryPane(), styleClass = *styleClass, id = id,
        configuration =
            configuration
    )
}

/**
 * Add a styled [JFXMasonryPane] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
inline fun NodeManager.styledJFXMasonryPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxJFXMasonryPane).() -> Unit
): JFXMasonryPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(
        newChild(
            KtfxJFXMasonryPane(), styleClass = *styleClass, id = id,
            configuration =
                configuration
        )
    )
}