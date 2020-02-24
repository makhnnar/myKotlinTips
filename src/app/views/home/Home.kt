package app.views.home

import app.views.home.postslist.postlistitem.PostItemData
import app.views.home.postslist.postsList
import app.views.home.profilebar.ProfileData
import app.views.home.profilebar.profileBar
import react.*
import react.dom.*

interface HomeProps : RProps {
    var postsItems: List<PostItemData>
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
            postsList(
                    props.postsItems
            )
        }
    }

}

fun RBuilder.home(
        postsItems: List<PostItemData>
) = child(Home::class) {
    attrs.postsItems = postsItems
}