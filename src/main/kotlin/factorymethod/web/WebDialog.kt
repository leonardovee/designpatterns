package factorymethod.web

import factorymethod.Dialog
import factorymethod.interfaces.Button

class WebDialog : Dialog() {
    override fun createButton(): Button {
        return HTMLButton()
    }
}