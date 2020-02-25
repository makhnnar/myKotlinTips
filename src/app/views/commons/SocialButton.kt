package app.views.commons

import react.RBuilder
import react.dom.a
import react.dom.img
import react.dom.li

fun RBuilder.socialButton(
        href:String,
        target:String,
        imgSrc: dynamic
){
    li {
        a(
                href,
                target
        ) {
            img {
                attrs{
                    src = imgSrc
                }
            }
        }
    }
}
