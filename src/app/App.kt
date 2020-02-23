package app

import app.views.home.home
import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostItemData
import app.views.postdetail.postDetail
import react.*
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

const val DETAIL_PATH = "/postDetail"

interface IdState : RState {
    var idToShow: String
    var listPost: List<PostItemData>
}

class App : RComponent<RProps, IdState>(), OnClickPost {


    override fun IdState.init(props: RProps) {

    }

    override fun componentWillMount() {
        setState {
            listPost = listOf(
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
            )
        }
    }

    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/", exact = true) {
                    home(
                            state.listPost,
                            this@App
                    )
                }
                route(DETAIL_PATH) {
                    postDetail(
                        state.listPost.first{ it.id == state.idToShow }
                    )
                }
            }
        }


    }

    override fun goToPostDetail(postItemData: PostItemData) {
        setState{
            idToShow = postItemData.id
        }
    }

}

fun RBuilder.app() = child(App::class) {}
