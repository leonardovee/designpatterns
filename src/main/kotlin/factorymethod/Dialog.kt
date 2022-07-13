package factorymethod

import factorymethod.interfaces.Button

abstract class Dialog {
    fun render() {
        val okButton = createButton()
        okButton.onClick()
        okButton.render()
    }

    abstract fun createButton(): Button
}