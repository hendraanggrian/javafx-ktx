package com.example

import javafx.application.Application
import javafx.scene.control.Label
import javafx.stage.Stage
import ktfx.bindings.toBooleanBinding
import ktfx.bindings.toStringBinding
import ktfx.controls.horizontalPadding
import ktfx.controls.minSize
import ktfx.coroutines.onAction
import ktfx.dialogs.errorAlert
import ktfx.dialogs.infoAlert
import ktfx.launchApplication
import ktfx.layouts.button
import ktfx.layouts.gridPane
import ktfx.layouts.label
import ktfx.layouts.scene
import ktfx.layouts.vbox

class CalculatorApp : Application() {
    companion object {
        private val OPERATORS = arrayOf("+", "-", "/", "*")

        @JvmStatic fun main(vararg args: String) = launchApplication<CalculatorApp>(*args)
    }

    private lateinit var calculationLabel: Label
    private lateinit var resultLabel: Label

    override fun start(stage: Stage) {
        stage.scene {
            gridPane {
                vbox {
                    horizontalPadding = 20.0
                    calculationLabel = label("")

                    resultLabel = label {
                        textProperty().bind(calculationLabel.textProperty().toStringBinding {
                            if (endsWithOperator(calculationLabel.text)) "..." else {
                                val operators = calculationLabel.text
                                    .split("\\d".toRegex())
                                    .filter { it.isNotEmpty() }
                                    .toMutableList()
                                val values = calculationLabel.text
                                    .split("[+\\-/*]".toRegex())
                                    .toMutableList()
                                var total: Double? = null
                                while (values.isNotEmpty() && operators.isNotEmpty()) {
                                    val value = values[0].toDouble()
                                    if (total != null) {
                                        total = when (operators[0]) {
                                            "+" -> total + value
                                            "-" -> total - value
                                            "/" -> total / value
                                            else -> total * value
                                        }
                                        operators.removeAt(0)
                                    } else {
                                        total = value
                                    }
                                    values.removeAt(0)
                                }
                                total?.toString() ?: "0"
                            }
                        })
                    }
                } row 0 col (0 to 5) fillWidth true

                button("1") {
                    minSize = 40.0
                    onAction { appendText("1") }
                } row 1 col 0
                button("2") {
                    minSize = 40.0
                    onAction { appendText("2") }
                } row 1 col 1
                button("3") {
                    minSize = 40.0
                    onAction { appendText("3") }
                } row 1 col 2

                button("4") {
                    minSize = 40.0
                    onAction { appendText("4") }
                } row 2 col 0
                button("5") {
                    minSize = 40.0
                    onAction { appendText("5") }
                } row 2 col 1
                button("6") {
                    minSize = 40.0
                    onAction { appendText("6") }
                } row 2 col 2

                button("7") {
                    minSize = 40.0
                    onAction { appendText("7") }
                } row 3 col 0
                button("8") {
                    minSize = 40.0
                    onAction { appendText("8") }
                } row 3 col 1
                button("9") {
                    minSize = 40.0
                    onAction { appendText("9") }
                } row 3 col 2

                button("0") {
                    minSize = 40.0
                    onAction { appendText("0") }
                } row 4 col 0
                button("00") {
                    minSize = 40.0
                    onAction { appendText("00") }
                } row 4 col 1
                button(".") {
                    minSize = 40.0
                    onAction { errorAlert(":(", content = "Not yet supported.") }
                } row 4 col 2

                button("C") {
                    setMinSize(80.0, 40.0)
                    isCancelButton = true
                    onAction { calculationLabel.text = "" }
                } row 1 col (3 to 2)
                button("*") {
                    minSize = 40.0
                    onAction { appendText("*") }
                } row 2 col 3
                button("/") {
                    minSize = 40.0
                    onAction { appendText("/") }
                } row 2 col 4
                button("+") {
                    setMinSize(40.0, 80.0)
                    onAction { appendText("+") }
                } row (3 to 2) col 3
                button("-") {
                    minSize = 40.0
                    onAction { appendText("-") }
                } row 3 col 4
                button("=") {
                    minSize = 40.0
                    isDefaultButton = true
                    disableProperty().bind(calculationLabel.textProperty().toBooleanBinding(::endsWithOperator))
                    onAction { infoAlert("Result", content = resultLabel.text) }
                } row 4 col 4
            }
        }
        stage.isResizable = false
        stage.show()
    }

    private fun appendText(text: String) {
        if (text in OPERATORS && endsWithOperator(text)) {
            calculationLabel.text = calculationLabel.text.substring(0, calculationLabel.text.length - 1)
        }
        calculationLabel.text += text
    }

    private fun endsWithOperator(text: String?): Boolean = OPERATORS.any { text!!.endsWith(it) }
}