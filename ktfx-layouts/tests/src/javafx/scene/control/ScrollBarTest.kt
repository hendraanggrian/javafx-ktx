package ktfx.layouts

import javafx.scene.control.ScrollBar
import ktfx.test.LayoutTest

class ScrollBarTest : LayoutTest<NodeManager, ScrollBar>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = scrollBar { }
    override fun NodeManager.child2() = scrollBar()
    override fun NodeManager.child3() = scrollBar { }
}