package factorymethod.web

import factorymethod.interfaces.Button

class HTMLButton: Button {
    override fun render() {
        println("[HTMLButton] render()")
    }

    override fun onClick() {
        println("[HTMLButton] onClick()")
    }
}