package app

import app.views.data.getAllPostData
import app.views.data.getPostDataById
import app.views.home.home
import app.views.home.postslist.postlistitem.*
import app.views.postdetail.postDetail
import react.*
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

const val DETAIL_PATH = "/postDetail"

interface RoutePostDetailProps : RProps {
    var idPost :String
}

class App : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/", exact = true) {
                    home(
                        getAllPostData()
                    )
                }
                route<RoutePostDetailProps>("$DETAIL_PATH/:idPost") {
                    props -> postDetail(
                        getPostDataById(props.match.params.idPost)
                    )
                }
            }
        }
    }

}

fun RBuilder.app() = child(App::class) {}
