package app.views.home.postslist

import app.views.home.postslist.postlistitem.OnClickPost
import app.views.home.postslist.postlistitem.PostListData
import app.views.home.postslist.postlistitem.postListItem
import react.RBuilder
import react.dom.div

fun RBuilder.postsList(
        postsList: List<PostListData>,
        onClickPost: OnClickPost
) {
    div("listPost") {
        postsList.map {
            postListItem(it,onClickPost)
        }
    }
}