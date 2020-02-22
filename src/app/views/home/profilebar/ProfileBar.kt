package app.views.home.profilebar

import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.img
import react.dom.p

//todo: put this link on the footer <a target="_blank" href="https://icons8.com/icons/set/linkedin">LinkedIn icon</a> icon by <a target="_blank" href="https://icons8.com">Icons8</a>

@JsModule("src/app/views/home/profilebar/icons8-linkedin-out.svg")
external val linkedInLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-github.svg")
external val githubLogo: dynamic

@JsModule("src/app/views/home/profilebar/icons8-twitter.svg")
external val twitterLogo: dynamic


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
        img {
            attrs{
                src = linkedInLogo
            }
        }
        img {
            attrs{
                src = githubLogo
            }
        }
        img {
            attrs{
                src = twitterLogo
            }
        }
    }
}