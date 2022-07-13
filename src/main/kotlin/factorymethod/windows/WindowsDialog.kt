package factorymethod.windows

import factorymethod.Dialog
import factorymethod.interfaces.Button

class WindowsDialog : Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}