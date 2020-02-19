package app.views.home.profilebar

import react.RBuilder
import react.dom.div
import react.dom.p

fun RBuilder.profileBar(
        profileData: ProfileData
) {
    div("profileBar") {
        p {
           +profileData.fullName
        }
        p {
            +profileData.description
        }
    }
}