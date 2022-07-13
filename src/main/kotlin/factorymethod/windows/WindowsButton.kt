package factorymethod.windows

import factorymethod.interfaces.Button

class WindowsButton: Button {
    override fun render() {
        println("[WindowsButton] render()")
    }

    override fun onClick() {
        println("[WindowsButton] render()")
    }
}