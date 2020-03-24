package app.views.postdetail

import app.views.home.postslist.postlistitem.*
import app.views.postdetail.titlepostbar.titlePostBar
import kotlinx.html.id
import react.*
import react.dom.div
import react.dom.h1
import react.dom.img
import react.dom.p
import react.dom.b
import react.dom.a
import react.router.dom.BrowserRouterComponent
import simpleprismcomponent.prismComponent


interface PostDetailProps : RProps {
    var postItemData: PostItemData
}

class PostDetail : RComponent<PostDetailProps, RState>(){


    override fun componentDidMount() {

    }

    override fun RBuilder.render() {
        titlePostBar(props.postItemData.title)
        div("postDetail") {
            props.postItemData.content.map {
                when(it){
                    is ImgElment ->{
                        img {
                            attrs{
                                src = it.src
                            }
                        }
                    }
                    is H1Elment -> {
                        h1 {
                            +it.title
                        }
                    }
                    is PElment -> {
                        p {
                            it.content.map{
                                when(it){
                                    is BElment ->{
                                        b {
                                            +it.strongText
                                        }
                                    }
                                    is LinkElment -> {
                                        a(
                                                it.link,
                                                "_blank"
                                        ) {
                                            +it.word
                                        }
                                    }
                                    is StrElment -> {
                                        +it.str
                                    }
                                    else -> {

                                    }
                                }
                            }
                        }
                    }
                    is CodeElment -> {
                        prismComponent{
                            attrs {
                                codeToShow = it.code
                                langSintax = it.lang
                            }
                        }
                    }
                    else -> {

                    }
                }
            }
        }
    }

}


fun RBuilder.postDetail(
        postItemData: PostItemData
) = child(PostDetail::class) {
    attrs.postItemData = postItemData
}

