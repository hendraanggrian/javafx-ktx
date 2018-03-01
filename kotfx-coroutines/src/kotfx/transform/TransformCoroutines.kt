package kotfx.transform

import javafx.event.Event
import javafx.event.EventType
import javafx.scene.transform.Transform
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.CoroutineContext

fun <E : Event> Transform.eventFilter(
    context: CoroutineContext,
    type: EventType<E>,
    action: suspend CoroutineScope.(E) -> Unit
) = addEventFilter(type) { event -> launch(context) { action(event) } }

fun <E : Event> Transform.eventHandler(
    context: CoroutineContext,
    type: EventType<E>,
    action: suspend CoroutineScope.(E) -> Unit
) = addEventHandler(type) { event -> launch(context) { action(event) } }