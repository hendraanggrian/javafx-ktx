@file:JvmMultifileClass
@file:JvmName("ControlsFxLayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.controlsfx.layouts

import javafx.concurrent.Task
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import ktfx.layouts.LayoutsDslMarker
import ktfx.layouts.NodeManager
import ktfx.layouts.addChild
import org.controlsfx.control.TaskProgressView

/** Create a [TaskProgressView] with initialization block. */
inline fun <T : Task<*>> taskProgressView(
    init: (@LayoutsDslMarker TaskProgressView<T>).() -> Unit
): TaskProgressView<T> {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return TaskProgressView<T>().apply(init)
}

/** Add a [TaskProgressView] to this manager. */
fun <T : Task<*>> NodeManager.taskProgressView(): TaskProgressView<T> = addChild(TaskProgressView())

/** Add a [TaskProgressView] with initialization block to this manager. */
inline fun <T : Task<*>> NodeManager.taskProgressView(
    init: (@LayoutsDslMarker TaskProgressView<T>).() -> Unit
): TaskProgressView<T> {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return addChild(TaskProgressView(), init)
}