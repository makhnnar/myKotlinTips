package app

import app.views.data.getAllPostData
import app.views.data.getPostDataById
import app.views.home.home
import app.views.home.postslist.postlistitem.*
import app.views.postdetail.postDetail
import firebase.FirebaseOptions
import firebase.fireBase
import react.*
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

const val DETAIL_PATH = "/postDetail"

interface RoutePostDetailProps : RProps {
    var idPost :String
}

class App : RComponent<RProps, RState>() {

    override fun RState.init() {
        //initializeApp()
        fireBase.initializeApp(
                FirebaseOptions().apply {
                    apiKey = "AIzaSyB8o4J6qso5CbDXWFAtV1nqZn_8vBLw4UA"
                    authDomain = "mykotlintips.firebaseapp.com"
                    databaseURL = "https://mykotlintips.firebaseio.com"
                    projectId = "mykotlintips"
                    storageBucket = "mykotlintips.appspot.com"
                    messagingSenderId = "204702118352"
                    appId = "1:204702118352:web:ae99ab4a800cfcb5f409d5"
                    measurementId = "G-0GTG4V7Q09"
                }
        )
    }

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
