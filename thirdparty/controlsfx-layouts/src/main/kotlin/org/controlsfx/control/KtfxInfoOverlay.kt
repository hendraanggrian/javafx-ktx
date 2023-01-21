@file:JvmMultifileClass
@file:JvmName("ControlsfxLayoutsKt")

package ktfx.controlsfx.layouts

import javafx.scene.Node
import ktfx.layouts.NodeManager
import org.controlsfx.control.InfoOverlay

/** [InfoOverlay] with dynamic-layout dsl support. Invoking dsl will only set its content. */
open class KtfxInfoOverlay(graphic: Node?, text: String?) :
    InfoOverlay(graphic, text), NodeManager {

    final override fun <C : Node> addChild(child: C): C = child.also { content = it }
}
