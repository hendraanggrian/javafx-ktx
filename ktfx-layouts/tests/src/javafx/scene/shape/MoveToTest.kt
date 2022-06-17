package ktfx.layouts

import javafx.scene.shape.MoveTo
import com.hendraanggrian.ktfx.test.LayoutsTest
import kotlin.test.assertEquals

class MoveToTest : LayoutsTest<KtfxPath, MoveTo>() {

    override fun manager() = KtfxPath()
    override fun KtfxPath.childCount() = elements.size
    override fun child1() = moveTo { }
    override fun KtfxPath.child2() = moveTo()
    override fun KtfxPath.child3() = moveTo { }

    override fun MoveTo.testDefaultValues() {
        assertEquals(0.0, x)
        assertEquals(0.0, y)
    }
}
