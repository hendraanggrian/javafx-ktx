package kotfx.scene.control

import javafx.event.ActionEvent
import javafx.scene.control.ContextMenu
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.CoroutineContext

fun ContextMenu.onAction(
    context: CoroutineContext,
    action: suspend CoroutineScope.(ActionEvent) -> Unit
) = setOnAction { event -> launch(context) { action(event) } }