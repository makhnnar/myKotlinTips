package app

import app.views.home.home
import react.*
import react.dom.*
import logo.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        home()
    }
}

fun RBuilder.app() = child(App::class) {}
