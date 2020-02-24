package app.views.home.postslist.postlistitem

import app.DETAIL_PATH
import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.div
import react.dom.h3
import react.dom.img
import react.dom.p
import kotlin.browser.window

fun RBuilder.postListItem(
        postItemData: PostItemData
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
                window.location.href = "$DETAIL_PATH/${postItemData.id}"
            }
        }
    }
}