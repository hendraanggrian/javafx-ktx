@file:JvmMultifileClass
@file:JvmName("EventsKt")

package kotfx.coroutines

import javafx.event.Event
import javafx.event.EventType
import javafx.scene.transform.Transform
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.CoroutineContext

fun <E : Event> Transform.eventFilter(
    context: CoroutineContext = FX,
    type: EventType<E>,
    consume: Boolean = false,
    action: suspend CoroutineScope.(E) -> Unit
) = addEventFilter(type) { event ->
    if (consume) event.consume()
    launch(context) { action(event) }
}

fun <E : Event> Transform.eventHandler(
    context: CoroutineContext = FX,
    type: EventType<E>,
    consume: Boolean = false,
    action: suspend CoroutineScope.(E) -> Unit
) = addEventHandler(type) { event ->
    if (consume) event.consume()
    launch(context) { action(event) }
}