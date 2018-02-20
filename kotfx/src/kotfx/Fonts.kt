@file:Suppress("NOTHING_TO_INLINE", "UsePropertyAccessSyntax")

package kotfx

import javafx.scene.control.Labeled
import javafx.scene.control.TextInputControl
import javafx.scene.control.Tooltip
import javafx.scene.text.Font
import javafx.scene.text.FontPosture
import javafx.scene.text.FontWeight
import javafx.scene.text.Text
import java.io.InputStream

/** Search appropriate font with options and set it to this [Labeled]. */
inline fun Labeled.setFont(
    family: String? = null,
    weight: FontWeight? = null,
    posture: FontPosture? = null,
    size: Double = -1.0
) = setFont(Font.font(family, weight, posture, size))

/** Search appropriate font with options and set it to this [Text]. */
inline fun Text.setFont(
    family: String? = null,
    weight: FontWeight? = null,
    posture: FontPosture? = null,
    size: Double = -1.0
) = setFont(Font.font(family, weight, posture, size))

/** Search appropriate font with options and set it to this [TextInputControl]. */
inline fun TextInputControl.setFont(
    family: String? = null,
    weight: FontWeight? = null,
    posture: FontPosture? = null,
    size: Double = -1.0
) = setFont(Font.font(family, weight, posture, size))

/** Search appropriate font with options and set it to this [Tooltip]. */
inline fun Tooltip.setFont(
    family: String? = null,
    weight: FontWeight? = null,
    posture: FontPosture? = null,
    size: Double = -1.0
) = setFont(Font.font(family, weight, posture, size))

/** Load font from url string and set it to this [Labeled]. */
inline fun Labeled.loadFont(
    url: String,
    size: Double
) = setFont(Font.loadFont(url, size))

/** Load font from url string and set it to this [Text]. */
inline fun Text.loadFont(
    url: String,
    size: Double
) = setFont(Font.loadFont(url, size))

/** Load font from url string and set it to this [TextInputControl]. */
inline fun TextInputControl.loadFont(
    url: String,
    size: Double
) = setFont(Font.loadFont(url, size))

/** Load font from url string and set it to this [Tooltip]. */
inline fun Tooltip.loadFont(
    url: String,
    size: Double
) = setFont(Font.loadFont(url, size))

/** Load font from input stream and set it to this [Labeled]. */
inline fun Labeled.loadFont(
    stream: InputStream,
    size: Double
) = setFont(Font.loadFont(stream, size))

/** Load font from input stream and set it to this [Text]. */
inline fun Text.loadFont(
    stream: InputStream,
    size: Double
) = setFont(Font.loadFont(stream, size))

/** Load font from input stream and set it to this [TextInputControl]. */
inline fun TextInputControl.loadFont(
    stream: InputStream,
    size: Double
) = setFont(Font.loadFont(stream, size))

/** Load font from input stream and set it to this [Tooltip]. */
inline fun Tooltip.loadFont(
    stream: InputStream,
    size: Double
) = setFont(Font.loadFont(stream, size))