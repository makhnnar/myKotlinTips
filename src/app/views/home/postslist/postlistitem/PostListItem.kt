package app.views.home.postslist.postlistitem

import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.div
import react.dom.h3
import react.dom.img
import react.dom.p

fun RBuilder.postListItem(
        postListData: PostListData,
        onClickPost: OnClickPost
) {
    div("itemListPost") {

        div("titlePhotoItemListPost") {

            img {
                attrs{
                    id = "imgItemListPost"
                    src = postListData.photo
                }
            }

            h3("titleItemListPost") {
                +postListData.title
            }
        }

        p("descriptionItemListPost") {
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