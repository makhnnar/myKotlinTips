package app.views.home.profilebar

import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.img
import react.dom.p

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
    }
}