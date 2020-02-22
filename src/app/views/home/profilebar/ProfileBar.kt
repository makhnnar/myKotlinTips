package app.views.home.profilebar

import kotlinx.html.classes
import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.div
import react.dom.img
import react.dom.p
import kotlin.browser.window

//todo: put this link on the footer <a target="_blank" href="https://icons8.com/icons/set/linkedin">LinkedIn icon</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a>

@JsModule("src/app/views/home/profilebar/icons8-linkedin-out.svg")
external val linkedInLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-github.svg")
external val githubLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-twitter.svg")
external val twitterLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-icons8.svg")
external val icons8Logo: dynamic


fun RBuilder.profileBar(
        profileData: ProfileData
) {
    div("profileBar") {
        img {
            attrs{
                id = "imgProfile"
                src = profileData.photo
            }
        }
        p {
           +profileData.fullName
        }
        p {
            +profileData.description
        }
        div("socialContainer") {
            img {
                attrs{
                    src = linkedInLogo
                    onClickFunction = {
                        window.open(
                                "https://www.linkedin.com/in/pedro-gomez-736b08145/",
                                "_blank"
                        )
                    }
                }
            }
            img {
                attrs{
                    src = githubLogo
                    onClickFunction = {
                        window.open(
                                "https://github.com/makhnnar",
                                "_blank"
                        )
                    }
                }
            }
            img {
                attrs{
                    src = twitterLogo
                    onClickFunction = {
                        window.open(
                                "https://twitter.com/phgomez674",
                                "_blank"
                        )
                    }
                }
            }
            img {
                attrs{
                    src = icons8Logo
                    onClickFunction = {
                        window.open(
                                "https://icons8.com",
                                "_blank"
                        )
                    }
                }
            }
        }

    }
}