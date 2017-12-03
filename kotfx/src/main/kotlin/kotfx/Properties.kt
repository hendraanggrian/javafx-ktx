@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kotfx

import javafx.beans.property.*
import javafx.beans.value.ObservableValue

inline infix fun <T> Property<T>.bind(observable: ObservableValue<out T>) = bind(observable)
inline infix fun <T> Property<T>.bindBidirectional(other: Property<T>) = bindBidirectional(other)
inline infix fun <T> Property<T>.unbindBidirectional(other: Property<T>) = unbindBidirectional(other)

inline fun Boolean.toMutableProperty(): BooleanProperty = SimpleBooleanProperty(this)
inline fun Boolean.toProperty(): BooleanProperty = ReadOnlyBooleanWrapper(this)

inline fun Double.toMutableProperty(): DoubleProperty = SimpleDoubleProperty(this)
inline fun Double.toProperty(): DoubleProperty = ReadOnlyDoubleWrapper(this)

inline fun Float.toMutableProperty(): FloatProperty = SimpleFloatProperty(this)
inline fun Float.toProperty(): FloatProperty = ReadOnlyFloatWrapper(this)

inline fun Int.toMutableProperty(): IntegerProperty = SimpleIntegerProperty(this)
inline fun Int.toProperty(): IntegerProperty = ReadOnlyIntegerWrapper(this)

inline fun Long.toMutableProperty(): LongProperty = SimpleLongProperty(this)
inline fun Long.toProperty(): LongProperty = ReadOnlyLongWrapper(this)

inline fun <T> T.toMutableProperty(): ObjectProperty<T> = SimpleObjectProperty(this)
inline fun <T> T.toProperty(): ObjectProperty<T> = ReadOnlyObjectWrapper(this)

inline fun String.toMutableProperty(): StringProperty = SimpleStringProperty(this)
inline fun String.toProperty(): StringProperty = ReadOnlyStringWrapper(this)