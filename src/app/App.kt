package app

import app.views.home.home
import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostItemData
import react.*


interface IdState : RState {
    var idToShow: String
}

class App : RComponent<RProps, IdState>(), OnClickPost {


    override fun IdState.init(props: RProps) {

    }

    override fun componentDidMount() {
        setState {
            idToShow = ""
        }
    }

    override fun RBuilder.render() {
        home(
                state.idToShow,
                this@App
        )
    }

    override fun goToPostDetail(postItemData: PostItemData) {
        setState{
            idToShow = postItemData.id
        }
    }

}

fun RBuilder.app() = child(App::class) {}
