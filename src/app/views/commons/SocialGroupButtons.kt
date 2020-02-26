package app.views.commons

import react.RBuilder
import react.dom.ul

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

fun RBuilder.socialGroupButtons() {
    ul ("socialGroupButtons"){
        socialButton(
                "https://www.linkedin.com/in/pedro-gomez-736b08145/",
                "_blank",
                linkedInLogo
        )
        socialButton(
                "https://github.com/makhnnar",
                "_blank",
                githubLogo
        )
        socialButton(
                "https://twitter.com/phgomez674",
                "_blank",
                twitterLogo
        )
        socialButton(
                "https://icons8.com",
                "_blank",
                icons8Logo
        )
    }
}