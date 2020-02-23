package app.views.home.postslist

import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostItemData
import app.views.home.postslist.postlistitem.postListItem
import react.RBuilder
import react.dom.div

fun RBuilder.postsList(
        postsItems: List<PostItemData>,
        onClickPost: OnClickPost
) {
    div("listPost") {
        postsItems.map {
            postListItem(it,onClickPost)
        }
    }
}