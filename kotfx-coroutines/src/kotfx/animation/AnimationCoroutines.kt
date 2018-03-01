package kotfx.animation

import javafx.animation.Animation
import javafx.event.ActionEvent
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.launch
import kotlin.coroutines.experimental.CoroutineContext

fun Animation.onFinished(
    context: CoroutineContext,
    action: suspend CoroutineScope.(ActionEvent) -> Unit
) = setOnFinished { event -> launch(context) { action(event) } }