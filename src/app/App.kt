package app

import app.views.home.home
import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        home()
    }
}

fun RBuilder.app() = child(App::class) {}
