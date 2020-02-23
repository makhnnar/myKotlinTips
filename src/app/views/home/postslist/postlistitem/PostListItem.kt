package app.views.home.postslist.postlistitem

import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.div
import react.dom.h3
import react.dom.img
import react.dom.p

fun RBuilder.postListItem(
        postItemData: PostItemData,
        onClickPost: OnClickPost
) {
    div("itemListPost") {

        div("titlePhotoItemListPost") {

            img {
                attrs{
                    id = "imgItemListPost"
                    src = postItemData.photo
                }
            }

            h3("titleItemListPost") {
                +postItemData.title
            }
        }

        p("descriptionItemListPost") {
            +postItemData.description
        }

        attrs{
            onClickFunction = {
                onClickPost.goToPostDetail(postItemData)
            }
        }
    }
}

interface OnClickPost {

    fun goToPostDetail(postItemData: PostItemData)

}