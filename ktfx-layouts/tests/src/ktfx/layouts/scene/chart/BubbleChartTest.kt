package ktfx.layouts.scene.chart

import javafx.scene.chart.BubbleChart
import javafx.scene.chart.NumberAxis
import ktfx.layouts.KtfxPane
import ktfx.layouts.LayoutTest
import ktfx.layouts.NodeManager
import ktfx.layouts.bubbleChart
import ktfx.test.assertEmpty
import kotlin.test.BeforeTest
import kotlin.test.assertEquals

class BubbleChartTest : LayoutTest<NodeManager, BubbleChart<Number, Number>>(KtfxPane()) {
    private lateinit var axis1: NumberAxis
    private lateinit var axis2: NumberAxis

    @BeforeTest fun createAxises() {
        axis1 = NumberAxis()
        axis2 = NumberAxis(1.0, 2.0, 3.0)
    }

    override fun create() = bubbleChart(axis1, axis2) { }
    override fun NodeManager.add() = bubbleChart(axis1, axis2)
    override fun NodeManager.addWithBuilder() = bubbleChart(axis1, axis2) { }

    override fun BubbleChart<Number, Number>.testDefaultValues() {
        assertEquals(axis1, xAxis)
        assertEquals(axis2, yAxis)
        assertEmpty(data)
    }
}