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
        var firebaseOptions = FirebaseOptions()
        firebaseOptions.apply {
            this.apiKey = "AIzaSyB8o4J6qso5CbDXWFAtV1nqZn_8vBLw4UA"
            this.authDomain = "mykotlintips.firebaseapp.com"
            this.databaseURL = "https://mykotlintips.firebaseio.com"
            this.projectId = "mykotlintips"
            this.storageBucket = "mykotlintips.appspot.com"
            this.messagingSenderId = "204702118352"
            this.appId = "1:204702118352:web:ae99ab4a800cfcb5f409d5"
            this.measurementId = "G-0GTG4V7Q09"
        }
        fireBase.initializeApp(
            firebaseOptions
        )
    }

    override fun RBuilder.render() {
        home(
            getAllPostData()
        )
        /*browserRouter {
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
        }*/
    }

}

fun RBuilder.app() = child(App::class) {}
