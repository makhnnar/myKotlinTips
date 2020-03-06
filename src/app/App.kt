package app

import app.views.home.home
import app.views.home.postslist.postlistitem.*
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
                            "Es el titulo 1",
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
                            "https://i.postimg.cc/tCHPJKYK/gatito.jpg",
                            listOf(
                                    H1Elment(
                                    "Es el titulo 1"
                                    ),
                                    PElment(
                                        listOf(
                                            StrElment("Lorem ipsum dolor sit amet,"),
                                            BElment(" consectetur adipiscing elit."),
                                            StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                            LinkElment("https://www.google.com","Sed at ultricies orci."),
                                            StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                        )
                                    ),
                                    PElment(
                                        listOf(
                                            StrElment("Lorem ipsum dolor sit amet,"),
                                            BElment(" consectetur adipiscing elit."),
                                            StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                            LinkElment("https://www.google.com","Sed at ultricies orci."),
                                            StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                        )
                                    ),
                                    ImgElment(
                                            "https://i.postimg.cc/tCHPJKYK/gatito.jpg"
                                    )
                            )
                    ),
                    PostItemData(
                            "2",
                            "Es el titulo 2",
                            "Phasellus placerat a massa in ullamcorper",
                            "https://i.postimg.cc/Hnby32Pv/1517151881-149-15-perritos-que-fueron-premiados-por-su-belleza-c.jpg",
                            listOf(
                                    H1Elment(
                                            "Es el titulo 2"
                                    ),
                                    PElment(
                                            listOf(
                                                    StrElment("Lorem ipsum dolor sit amet,"),
                                                    BElment(" consectetur adipiscing elit."),
                                                    StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                                    LinkElment("https://www.google.com","Sed at ultricies orci."),
                                                    StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                            )                                    ),
                                    PElment(
                                            listOf(
                                                    StrElment(" Lorem ipsum dolor sit amet,"),
                                                    BElment(" consectetur adipiscing elit."),
                                                    StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                                    LinkElment("https://www.google.com","Sed at ultricies orci."),
                                                    StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                            )                                    ),
                                    ImgElment(
                                            "https://i.postimg.cc/Hnby32Pv/1517151881-149-15-perritos-que-fueron-premiados-por-su-belleza-c.jpg"
                                    )
                            )
                    ),
                    PostItemData(
                            "3",
                            "Es el titulo 3",
                            "Cras in tortor a sem faucibus venenatis",
                            "https://i.postimg.cc/Qt27pPSW/pajarito.jpg",
                            listOf(
                                H1Elment(
                                        "Es el titulo 3"
                                ),
                                PElment(
                                        listOf(
                                                StrElment("Lorem ipsum dolor sit amet,"),
                                                BElment(" consectetur adipiscing elit."),
                                                StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                                LinkElment("https://www.google.com","Sed at ultricies orci."),
                                                StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                        )                                ),
                                PElment(
                                        listOf(
                                                StrElment("Lorem ipsum dolor sit amet,"),
                                                BElment(" consectetur adipiscing elit."),
                                                StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                                LinkElment("https://www.google.com","Sed at ultricies orci."),
                                                StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                        )                                ),
                                ImgElment(
                                        "https://i.postimg.cc/Qt27pPSW/pajarito.jpg"
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
