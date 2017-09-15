package kotfx.dialogs

import kotfx.JavaFXThreadingRule
import javafx.stage.FileChooser
import javafx.stage.Window
import org.junit.Assert.assertEquals
import org.junit.Rule

/**
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
class DialogsTest {

    @get:Rule
    val rule = JavaFXThreadingRule()

    // @Test
    fun alert() {
        val alert1 = kotfx.dialogs.alert("Here's an alert.")
        assertEquals(alert1.contentText, "Here's an alert.")
        alert1.close()

        val alert2 = kotfx.dialogs.alert({
            title = "Title"
            headerText = "Title"
            contentText = "Here's another"
        })
        assertEquals(alert2.title, "Title")
        assertEquals(alert2.headerText, "Title")
        assertEquals(alert2.contentText, "Here's another")
        alert2.close()
    }

    // @Test
    fun dialog() {

    }

    // @Test
    fun chooser(window: Window) {
        fileChooser(window) {

        }
        fileChooser(window, FileChooser.ExtensionFilter("")) {

        }
        fileChooser(window, {}) {

        }
    }
}