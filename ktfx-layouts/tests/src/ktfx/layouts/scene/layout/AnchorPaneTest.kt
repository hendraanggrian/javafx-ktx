package ktfx.layouts.scene.layout

import ktfx.layouts.anchorPane
import ktfx.layouts.pane
import ktfx.layouts.region
import ktfx.test.ToolkitLayoutTest
import kotlin.test.assertEquals

class AnchorPaneTest : ToolkitLayoutTest() {

    override fun newInstance() {
        anchorPane {
            val region1 = region() anchorAll 10.0
            assertEquals(region1.anchorTop, 10.0)
            assertEquals(region1.anchorLeft, 10.0)
            assertEquals(region1.anchorBottom, 10.0)
            assertEquals(region1.anchorRight, 10.0)
            val region2 = region() anchorTop 10.0
            assertEquals(region2.anchorTop, 10.0)
            val region3 = region() anchorLeft 10.0
            assertEquals(region3.anchorLeft, 10.0)
            val region4 = region() anchorBottom 10.0
            assertEquals(region4.anchorBottom, 10.0)
            val region5 = region() anchorRight 10.0
            assertEquals(region5.anchorRight, 10.0)

            region1.reset()
            assertEquals(region1.anchorTop, null)
            assertEquals(region1.anchorLeft, null)
            assertEquals(region1.anchorBottom, null)
            assertEquals(region1.anchorRight, null)
            region2.reset()
            assertEquals(region2.anchorTop, null)
            region3.reset()
            assertEquals(region3.anchorLeft, null)
            region4.reset()
            assertEquals(region4.anchorBottom, null)
            region5.reset()
            assertEquals(region5.anchorRight, null)

            assertEquals(children.size, 5)
        }
    }

    override fun withManager() {
        assertEquals(pane {
            anchorPane()
        }.children.size, 1)
    }
}