package app.views.home.postslist.postlistitem

import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.div
import react.dom.h3
import react.dom.p

fun RBuilder.postListItem(
        postListData: PostListData,
        onClickPost: OnClickPost
) {
    div("itemListPost") {

        h3("titlePost") {
            +postListData.title
        }

        p("descriptionPost") {
            +postListData.description
        }

        attrs{
            onClickFunction = {
                onClickPost.goToPostDetail(postListData)
            }
        }
    }
}

interface OnClickPost {

    fun goToPostDetail(postListData: PostListData)

}