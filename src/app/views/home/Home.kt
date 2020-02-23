package app.views.home

import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostItemData
import app.views.home.postslist.postsList
import app.views.home.profilebar.ProfileData
import app.views.home.profilebar.profileBar
import react.*
import react.dom.*

interface HomeProps : RProps {
    var idToShow: String
    var onClickPost: OnClickPost
}

class Home : RComponent<HomeProps, RState>(){


    override fun componentDidMount() {

    }

    override fun RBuilder.render() {
        div("home") {
            profileBar(
                ProfileData(
                    "Full Name",
                    "Descripcion",
                    "https://i.postimg.cc/qtMKQ920/orange-tabby-cat-near-window-2071873.jpg",
                    ""
                )
            )
            p {
                +"Haz Clickeado el id: ${props.idToShow}"
            }
            postsList(
                listOf(
                    PostItemData(
                        "1",
                        "title1",
                        "descripcion1",
                        "https://i.postimg.cc/tCHPJKYK/gatito.jpg"
                    ),
                    PostItemData(
                        "2",
                        "title2",
                        "descripcion2",
                        "https://i.postimg.cc/Hnby32Pv/1517151881-149-15-perritos-que-fueron-premiados-por-su-belleza-c.jpg"
                    ),
                    PostItemData(
                        "3",
                        "title3",
                        "descripcion3",
                        "https://i.postimg.cc/Qt27pPSW/pajarito.jpg"
                    )
                ),
                props.onClickPost
            )
        }
    }

}

fun RBuilder.home(
        idToShow: String,
        onClickPost: OnClickPost
) = child(Home::class) {
    attrs.idToShow = idToShow
    attrs.onClickPost = onClickPost
}