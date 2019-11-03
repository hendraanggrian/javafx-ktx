@file:JvmMultifileClass
@file:JvmName("ListenersKt")
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.listeners

import javafx.event.Event
import javafx.event.EventHandler
import javafx.event.EventType
import javafx.scene.Node
import javafx.scene.SnapshotParameters
import javafx.scene.SnapshotResult
import javafx.scene.image.WritableImage
import javafx.scene.input.ContextMenuEvent
import javafx.scene.input.DragEvent
import javafx.scene.input.InputMethodEvent
import javafx.scene.input.KeyEvent
import javafx.scene.input.MouseDragEvent
import javafx.scene.input.MouseEvent
import javafx.scene.input.RotateEvent
import javafx.scene.input.ScrollEvent
import javafx.scene.input.SwipeEvent
import javafx.scene.input.TouchEvent
import javafx.scene.input.ZoomEvent
import ktfx.internal.KtfxInternals

/** Registers an event filter to this node. */
inline fun <E : Event> Node.eventFilter(
    type: EventType<E>,
    noinline action: (E) -> Unit
): EventHandler<E> = EventHandler<E> { event -> action(event) }
    .also { addEventFilter(type, it) }

/** Registers an event handler to this node. */
inline fun <E : Event> Node.eventHandler(
    type: EventType<E>,
    noinline action: (E) -> Unit
): EventHandler<E> = EventHandler<E> { event -> action(event) }
    .also { addEventHandler(type, it) }

inline fun Node.onContextMenuRequested(
    noinline action: (ContextMenuEvent) -> Unit
): Unit = setOnContextMenuRequested { event -> action(event) }

/** Defines a function to be called when drag gesture has been detected. */
inline fun Node.onDragDetected(
    noinline action: (MouseEvent) -> Unit
): Unit = setOnDragDetected { event -> action(event) }

/**
 * Defines a function to be called when this [Node] is a drag and drop gesture source after its data has been dropped on
 * a drop target.
 */
inline fun Node.onDragDone(
    noinline action: (DragEvent) -> Unit
): Unit = setOnDragDone { event -> action(event) }

/** Defines a function to be called when the mouse button is released on this [Node] during drag and drop gesture. */
inline fun Node.onDragDropped(
    noinline action: (DragEvent) -> Unit
): Unit = setOnDragDropped { event -> action(event) }

/** Defines a function to be called when drag gesture enters this [Node]. */
inline fun Node.onDragEntered(
    noinline action: (DragEvent) -> Unit
): Unit = setOnDragEntered { event -> action(event) }

/** Defines a function to be called when drag gesture exits this [Node]. */
inline fun Node.onDragExited(
    noinline action: (DragEvent) -> Unit
): Unit = setOnDragExited { event -> action(event) }

/** Defines a function to be called when drag gesture progresses within this [Node]. */
inline fun Node.onDragOver(
    noinline action: (DragEvent) -> Unit
): Unit = setOnDragOver { event -> action(event) }

/** Defines a function to be called when this [Node] has input focus and the input method text has changed. */
inline fun Node.onInputMethodTextChanged(
    noinline action: (InputMethodEvent) -> Unit
): Unit = setOnInputMethodTextChanged { event -> action(event) }

/** Defines a function to be called when this [Node] or its child [Node] has input focus and a key has been pressed. */
inline fun Node.onKeyPressed(
    noinline action: (KeyEvent) -> Unit
): Unit = setOnKeyPressed { event -> action(event) }

/** Defines a function to be called when this [Node] or its child [Node] has input focus and a key has been released. */
inline fun Node.onKeyReleased(
    noinline action: (KeyEvent) -> Unit
): Unit = setOnKeyReleased { event -> action(event) }

/** Defines a function to be called when this [Node] or its child [Node] has input focus and a key has been typed. */
inline fun Node.onKeyTyped(
    noinline action: (KeyEvent) -> Unit
): Unit = setOnKeyTyped { event -> action(event) }

/** Defines a function to be called when a mouse button has been clicked (pressed and released) on this [Node]. */
inline fun Node.onMouseClicked(
    noinline action: (MouseEvent) -> Unit
): Unit = setOnMouseClicked { event -> action(event) }

/** Defines a function to be called when a full press-drag-release gesture enters this [Node]. */
inline fun Node.onMouseDragEntered(
    noinline action: (MouseDragEvent) -> Unit
): Unit = setOnMouseDragEntered { event -> action(event) }

/** Defines a function to be called when a full press-drag-release gesture leaves this [Node]. */
inline fun Node.onMouseDragExited(
    noinline action: (MouseDragEvent) -> Unit
): Unit = setOnMouseDragExited { event -> action(event) }

/** Defines a function to be called when a mouse button is pressed on this [Node] and then dragged. */
inline fun Node.onMouseDragged(
    noinline action: (MouseEvent) -> Unit
): Unit = setOnMouseDragged { event -> action(event) }

/** Defines a function to be called when a full press-drag-release gesture progresses within this [Node]. */
inline fun Node.onMouseDragOver(
    noinline action: (MouseDragEvent) -> Unit
): Unit = setOnMouseDragOver { event -> action(event) }

/** Defines a function to be called when a full press-drag-release gesture ends within this [Node]. */
inline fun Node.onMouseDragReleased(
    noinline action: (MouseDragEvent) -> Unit
): Unit = setOnMouseDragReleased { event -> action(event) }

/** Defines a function to be called when the mouse enters this [Node]. */
inline fun Node.onMouseEntered(
    noinline action: (MouseEvent) -> Unit
): Unit = setOnMouseEntered { event -> action(event) }

/** Defines a function to be called when the mouse exits this [Node]. */
inline fun Node.onMouseExited(
    noinline action: (MouseEvent) -> Unit
): Unit = setOnMouseExited { event -> action(event) }

/** Defines a function to be called when mouse cursor moves within this [Node] but no buttons have been pushed. */
inline fun Node.onMouseMoved(

    noinline action: (MouseEvent) -> Unit
): Unit = setOnMouseMoved { event -> action(event) }

/** Defines a function to be called when a mouse button has been pressed on this [Node]. */
inline fun Node.onMousePressed(
    noinline action: (MouseEvent) -> Unit
): Unit = setOnMousePressed { event -> action(event) }

/** Defines a function to be called when a mouse button has been released on this [Node]. */
inline fun Node.onMouseReleased(
    noinline action: (MouseEvent) -> Unit
): Unit = setOnMouseReleased { event -> action(event) }

/** Defines a function to be called when user performs a rotation action. */
inline fun Node.onRotate(
    noinline action: (RotateEvent) -> Unit
): Unit = setOnRotate { event -> action(event) }

/** Defines a function to be called when a rotation gesture ends. */
inline fun Node.onRotationFinished(
    noinline action: (RotateEvent) -> Unit
): Unit = setOnRotationFinished { event -> action(event) }

/** Defines a function to be called when a rotation gesture is detected. */
inline fun Node.onRotationStarted(
    noinline action: (RotateEvent) -> Unit
): Unit = setOnRotationStarted { event -> action(event) }

/** Defines a function to be called when user performs a scrolling action. */
inline fun Node.onScroll(
    noinline action: (ScrollEvent) -> Unit
): Unit = setOnScroll { event -> action(event) }

/** Defines a function to be called when a scrolling gesture ends. */
inline fun Node.onScrollFinished(
    noinline action: (ScrollEvent) -> Unit
): Unit = setOnScrollFinished { event -> action(event) }

/** Defines a function to be called when a scrolling gesture is detected. */
inline fun Node.onScrollStarted(
    noinline action: (ScrollEvent) -> Unit
): Unit = setOnScrollStarted { event -> action(event) }

/** Defines a function to be called when a downward swipe gesture centered over this node happens. */
inline fun Node.onSwipeDown(
    noinline action: (SwipeEvent) -> Unit
): Unit = setOnSwipeDown { event -> action(event) }

/** Defines a function to be called when a leftward swipe gesture centered over this node happens. */
inline fun Node.onSwipeLeft(
    noinline action: (SwipeEvent) -> Unit
): Unit = setOnSwipeLeft { event -> action(event) }

/** Defines a function to be called when an rightward swipe gesture centered over this node happens. */
inline fun Node.onSwipeRight(
    noinline action: (SwipeEvent) -> Unit
): Unit = setOnSwipeRight { event -> action(event) }

/** Defines a function to be called when an upward swipe gesture centered over this node happens. */
inline fun Node.onSwipeUp(
    noinline action: (SwipeEvent) -> Unit
): Unit = setOnSwipeUp { event -> action(event) }

/** Defines a function to be called when a touch point is moved. */
inline fun Node.onTouchMoved(
    noinline action: (TouchEvent) -> Unit
): Unit = setOnTouchMoved { event -> action(event) }

/** Defines a function to be called when a new touch point is pressed. */
inline fun Node.setOnTouchPressed(
    noinline action: (TouchEvent) -> Unit
): Unit = setOnTouchPressed { event -> action(event) }

/** Defines a function to be called when a touch point is released. */
inline fun Node.onTouchReleased(
    noinline action: (TouchEvent) -> Unit
): Unit = setOnTouchReleased { event -> action(event) }

/** Defines a function to be called when a touch point stays pressed and still. */
inline fun Node.onTouchStationary(
    noinline action: (TouchEvent) -> Unit
): Unit = setOnTouchStationary { event -> action(event) }

/** Defines a function to be called when user performs a zooming action. */
inline fun Node.onZoom(
    noinline action: (ZoomEvent) -> Unit
): Unit = setOnZoom { event -> action(event) }

/** Defines a function to be called when a zooming gesture ends. */
inline fun Node.onZoomFinished(
    noinline action: (ZoomEvent) -> Unit
): Unit = setOnZoomFinished { event -> action(event) }

/** Defines a function to be called when a zooming gesture is detected. */
inline fun Node.onZoomStarted(
    noinline action: (ZoomEvent) -> Unit
): Unit = setOnZoomStarted { event -> action(event) }

/** Takes a snapshot of this node at the next frame and calls the specified callback method when the image is ready. */
inline fun Node.snapshot(
    params: SnapshotParameters? = null,
    image: WritableImage? = null,
    noinline callback: (SnapshotResult) -> Unit
): Unit = snapshot(KtfxInternals.noReturn { param -> callback(param) }, params, image)
