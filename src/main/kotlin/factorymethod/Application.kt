package factorymethod

import factorymethod.web.WebDialog
import factorymethod.windows.WindowsDialog
import java.util.Random

class Application {
    fun initialize() {
        val availableOs = mapOf(1 to "Windows", 2 to "Web")

        val random = Random()
        val os = availableOs.entries.elementAt(random.nextInt(availableOs.size))

        var dialog: Dialog? = null

        when(os.value) {
            "Windows" -> dialog = WindowsDialog()
            "Web" -> dialog = WebDialog()
        }

        dialog?.createButton()
        dialog?.render()
    }
}