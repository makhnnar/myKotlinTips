package app.views.postdetail

import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostItemData
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h1


interface PostDetailProps : RProps {
    var postItemData: PostItemData
}

class PostDetail : RComponent<PostDetailProps, RState>(){


    override fun componentDidMount() {

    }

    override fun RBuilder.render() {
        div("postDetail") {
            h1 {
                +props.postItemData.title
            }
        }
    }

}

fun RBuilder.postDetail(
        postItemData: PostItemData
) = child(PostDetail::class) {
    attrs.postItemData = postItemData
}

