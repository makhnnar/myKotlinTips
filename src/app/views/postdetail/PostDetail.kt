package app.views.postdetail

import app.views.home.postslist.postlistitem.PostItemData
import app.views.postdetail.titlepostbar.titlePostBar
import kotlinx.html.id
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h1
import react.dom.img
import react.router.dom.BrowserRouterComponent


interface PostDetailProps : RProps {
    var postItemData: PostItemData
}

class PostDetail : RComponent<PostDetailProps, RState>(){


    override fun componentDidMount() {

    }

    override fun RBuilder.render() {
        titlePostBar()
        div("postDetail") {

            img {
                attrs{
                    id = "imgItemListPost"
                    src = props.postItemData.photo
                }
            }
            h1 {
                +props.postItemData.title
            }
            h1 {
                +props.postItemData.description
            }
        }
    }

}

fun RBuilder.postDetail(
        postItemData: PostItemData
) = child(PostDetail::class) {
    attrs.postItemData = postItemData
}

