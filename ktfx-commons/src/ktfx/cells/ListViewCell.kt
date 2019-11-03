package ktfx.cells

import javafx.beans.value.ObservableValue
import javafx.collections.ObservableList
import javafx.scene.control.ListView
import javafx.scene.control.cell.CellUtils2
import javafx.scene.control.cell.CheckBoxListCell
import javafx.scene.control.cell.ChoiceBoxListCell
import javafx.scene.control.cell.ComboBoxListCell
import javafx.scene.control.cell.TextFieldListCell
import javafx.util.StringConverter
import javafx.util.converter.DefaultStringConverter

fun <T> ListView<T>.checkBoxCellFactory(
    converter: StringConverter<T> = CellUtils2.defaultStringConverter(),
    selectedProperty: (T) -> ObservableValue<Boolean>
): Unit = setCellFactory(CheckBoxListCell.forListView(selectedProperty, converter))

fun <T> ListView<T>.choiceBoxCellFactory(
    converter: StringConverter<T> = CellUtils2.defaultStringConverter(),
    vararg items: T
): Unit = setCellFactory(ChoiceBoxListCell.forListView(converter, *items))

fun <T> ListView<T>.choiceBoxCellFactory(
    converter: StringConverter<T> = CellUtils2.defaultStringConverter(),
    items: ObservableList<T>
): Unit = setCellFactory(ChoiceBoxListCell.forListView(converter, items))

fun <T> ListView<T>.comboBoxCellFactory(
    converter: StringConverter<T> = CellUtils2.defaultStringConverter(),
    vararg items: T
): Unit = setCellFactory(ComboBoxListCell.forListView(converter, *items))

fun <T> ListView<T>.comboBoxCellFactory(
    converter: StringConverter<T> = CellUtils2.defaultStringConverter(),
    items: ObservableList<T>
): Unit = setCellFactory(ComboBoxListCell.forListView(converter, items))

fun ListView<String>.textFieldCellFactory(
    converter: StringConverter<String> = DefaultStringConverter()
): Unit = setCellFactory(TextFieldListCell.forListView(converter))

fun <T> ListView<T>.cellFactory(
    cellFactory: ListCellBuilder<T>.() -> Unit
): Unit = setCellFactory { cellFactory.build() }
