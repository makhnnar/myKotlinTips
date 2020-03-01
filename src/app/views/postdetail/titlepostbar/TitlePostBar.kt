package app.views.postdetail.titlepostbar

import app.views.commons.socialGroupButtons
import react.RBuilder
import react.dom.*

@JsModule("src/app/views/home/profilebar/icons8-linkedin-out.svg")
external val linkedInLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-github.svg")
external val githubLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-twitter.svg")
external val twitterLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-icons8.svg")
external val icons8Logo: dynamic

/**
 *todo:put classes on nav for to add styles and fix positions on screen
 * */

fun RBuilder.titlePostBar(title:String) {
    header {
        h3 {
            +title
        }
        div("titlePostBar"){
            socialGroupButtons()
        }
    }
}