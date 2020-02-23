package app.views.home.postslist

import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostItemData
import app.views.home.postslist.postlistitem.postListItem
import react.RBuilder
import react.dom.div

fun RBuilder.postsList(
        postsItem: List<PostItemData>,
        onClickPost: OnClickPost
) {
    div("listPost") {
        postsItem.map {
            postListItem(it,onClickPost)
        }
    }
}