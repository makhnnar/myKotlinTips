package app.views.home

import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostListData
import app.views.home.postslist.postsList
import app.views.home.profilebar.ProfileData
import app.views.home.profilebar.profileBar
import react.*
import react.dom.*

interface IdState : RState {
    var idToShow: String
}

class Home : RComponent<RProps, IdState>(),OnClickPost {


    override fun IdState.init(props: RProps) {

    }

    override fun componentDidMount() {
        setState {
            idToShow = "Presione uno por favor"
        }
    }

    override fun RBuilder.render() {
        div("app") {
            profileBar(
                ProfileData(
                    "Full Name",
                    "Descripcion",
                    "",
                    ""
                )
            )
            p {
                +"Haz Clickeado el id: ${state.idToShow}"
            }
            postsList(
                listOf(
                    PostListData(
                        "1",
                        "title1",
                        "descripcion1",
                        "photo1"
                    ),
                    PostListData(
                        "2",
                        "title2",
                        "descripcion2",
                        "photo2"
                    )
                ),
                this@Home
            )
        }
    }

    override fun goToPostDetail(postListData: PostListData) {
        setState{
            idToShow = postListData.id
        }
    }

}

fun RBuilder.home() = child(Home::class) {}