@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:Suppress("NOTHING_TO_INLINE")

package kotfx.scene

import javafx.scene.canvas.Canvas
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.media.MediaPlayer
import javafx.scene.media.MediaView
import javafx.scene.text.Text
import javafx.scene.web.WebView
import kotfx.annotations.SceneDsl

inline fun canvas(width: Double = 0.0, height: Double = 0.0, noinline init: ((@SceneDsl Canvas).() -> Unit)? = null): Canvas = Canvas(width, height).apply { init?.invoke(this) }
inline fun ChildManager.canvas(width: Double = 0.0, height: Double = 0.0, noinline init: ((@SceneDsl Canvas).() -> Unit)? = null): Canvas = Canvas(width, height).apply { init?.invoke(this) }.add()
inline fun ItemManager.canvas(width: Double = 0.0, height: Double = 0.0, noinline init: ((@SceneDsl Canvas).() -> Unit)? = null): Canvas = Canvas(width, height).apply { init?.invoke(this) }.add()
inline fun ButtonManager.canvas(width: Double = 0.0, height: Double = 0.0, noinline init: ((@SceneDsl Canvas).() -> Unit)? = null): Canvas = Canvas(width, height).apply { init?.invoke(this) }.add()

inline fun imageView(image: Image? = null, noinline init: ((@SceneDsl ImageView).() -> Unit)? = null): ImageView = ImageView(image).apply { init?.invoke(this) }
inline fun ChildManager.imageView(image: Image? = null, noinline init: ((@SceneDsl ImageView).() -> Unit)? = null): ImageView = ImageView(image).apply { init?.invoke(this) }.add()
inline fun ItemManager.imageView(image: Image? = null, noinline init: ((@SceneDsl ImageView).() -> Unit)? = null): ImageView = ImageView(image).apply { init?.invoke(this) }.add()
inline fun ButtonManager.imageView(image: Image? = null, noinline init: ((@SceneDsl ImageView).() -> Unit)? = null): ImageView = ImageView(image).apply { init?.invoke(this) }.add()

inline fun mediaView(player: MediaPlayer? = null, noinline init: ((@SceneDsl MediaView).() -> Unit)? = null): MediaView = MediaView(player).apply { init?.invoke(this) }
inline fun ChildManager.mediaView(player: MediaPlayer? = null, noinline init: ((@SceneDsl MediaView).() -> Unit)? = null): MediaView = MediaView(player).apply { init?.invoke(this) }.add()
inline fun ItemManager.mediaView(player: MediaPlayer? = null, noinline init: ((@SceneDsl MediaView).() -> Unit)? = null): MediaView = MediaView(player).apply { init?.invoke(this) }.add()
inline fun ButtonManager.mediaView(player: MediaPlayer? = null, noinline init: ((@SceneDsl MediaView).() -> Unit)? = null): MediaView = MediaView(player).apply { init?.invoke(this) }.add()

inline fun text(text: String? = null, noinline init: ((@SceneDsl Text).() -> Unit)? = null): Text = Text(text).apply { init?.invoke(this) }
inline fun ChildManager.text(text: String? = null, noinline init: ((@SceneDsl Text).() -> Unit)? = null): Text = Text(text).apply { init?.invoke(this) }.add()
inline fun ItemManager.text(text: String? = null, noinline init: ((@SceneDsl Text).() -> Unit)? = null): Text = Text(text).apply { init?.invoke(this) }.add()
inline fun ButtonManager.text(text: String? = null, noinline init: ((@SceneDsl Text).() -> Unit)? = null): Text = Text(text).apply { init?.invoke(this) }.add()

inline fun webView(noinline init: ((@SceneDsl WebView).() -> Unit)? = null): WebView = WebView().apply { init?.invoke(this) }
inline fun ChildManager.webView(noinline init: ((@SceneDsl WebView).() -> Unit)? = null): WebView = WebView().apply { init?.invoke(this) }.add()
inline fun ItemManager.webView(noinline init: ((@SceneDsl WebView).() -> Unit)? = null): WebView = WebView().apply { init?.invoke(this) }.add()
inline fun ButtonManager.webView(noinline init: ((@SceneDsl WebView).() -> Unit)? = null): WebView = WebView().apply { init?.invoke(this) }.add()