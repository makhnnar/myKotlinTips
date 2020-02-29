package app

import app.views.home.home
import app.views.home.postslist.postlistitem.ElementData
import app.views.home.postslist.postlistitem.PostItemData
import app.views.postdetail.postDetail
import react.*
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

const val DETAIL_PATH = "/postDetail"

interface IdState : RState {
    var listPost: List<PostItemData>
}

interface RoutePostDetailProps : RProps {
    var idPost :String
}

class App : RComponent<RProps, IdState>() {


    override fun IdState.init(props: RProps) {

    }

    override fun componentWillMount() {
        setState {
            listPost = listOf(
                    PostItemData(
                            "1",
                            "title1",
                            "descripcion1",
                            "https://i.postimg.cc/tCHPJKYK/gatito.jpg",
                            listOf(
                                    ElementData.H1Elment(
                                    "Es un titulo fabuloso"
                                    ),
                                    ElementData.PElment(
                                            "Un parrafo"
                                    ),
                                    ElementData.PElment(
                                            "Otro parrafo"
                                    ),
                                    ElementData.ImgElment(
                                            "https://i.postimg.cc/tCHPJKYK/gatito.jpg"
                                    )
                            )
                    ),
                    PostItemData(
                            "2",
                            "title2",
                            "descripcion2",
                            "https://i.postimg.cc/Hnby32Pv/1517151881-149-15-perritos-que-fueron-premiados-por-su-belleza-c.jpg",
                            listOf(
                                    ElementData.H1Elment(
                                            "Es un titulo fabuloso"
                                    ),
                                    ElementData.PElment(
                                            "Un parrafo"
                                    ),
                                    ElementData.PElment(
                                            "Otro parrafo"
                                    ),
                                    ElementData.ImgElment(
                                            "https://i.postimg.cc/tCHPJKYK/gatito.jpg"
                                    )
                            )
                    ),
                    PostItemData(
                            "3",
                            "title3",
                            "descripcion3",
                            "https://i.postimg.cc/Qt27pPSW/pajarito.jpg",
                            listOf(
                                ElementData.H1Elment(
                                        "Es un titulo fabuloso"
                                ),
                                ElementData.PElment(
                                        "Un parrafo"
                                ),
                                ElementData.PElment(
                                        "Otro parrafo"
                                ),
                                ElementData.ImgElment(
                                        "https://i.postimg.cc/tCHPJKYK/gatito.jpg"
                                )
                            )
                    )
            )
        }
    }

    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/", exact = true) {
                    home(
                        state.listPost
                    )
                }
                route<RoutePostDetailProps>("$DETAIL_PATH/:idPost") {
                    props -> postDetail(
                        state.listPost.first{ it.id == props.match.params.idPost }
                    )
                }
            }
        }


    }

}

fun RBuilder.app() = child(App::class) {}
