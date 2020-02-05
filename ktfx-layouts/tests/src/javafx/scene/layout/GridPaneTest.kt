package ktfx.layouts

import javafx.scene.layout.GridPane
import ktfx.test.LayoutsTest
import kotlin.test.Test
import kotlin.test.assertEquals

class GridPaneTest : LayoutsTest<NodeManager, GridPane>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = gridPane { }
    override fun NodeManager.child2() = gridPane()
    override fun NodeManager.child3() = gridPane { }

    @Test fun colAndRow() {
        gridPane {
            val label = label() row (1 to 3) col (2 to 4)
            assertEquals(1, label.rowIndex)
            assertEquals(2, label.columnIndex)
            assertEquals(3, label.rowSpan)
            assertEquals(4, label.columnSpan)
        }
    }
}