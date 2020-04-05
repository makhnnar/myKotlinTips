package app.views.data

import app.views.home.postslist.postlistitem.*

fun getPost3(): PostItemData {
    return PostItemData(
            "2",
            "Es el titulo 2",
            "Phasellus placerat a massa in ullamcorper",
            "https://i.postimg.cc/Hnby32Pv/1517151881-149-15-perritos-que-fueron-premiados-por-su-belleza-c.jpg",
            listOf(
                    H1Elment(
                            "Es el titulo 2"
                    ),
                    PElment(
                            listOf(
                                    StrElment("Lorem ipsum dolor sit amet,"),
                                    BElment(" consectetur adipiscing elit."),
                                    StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                    LinkElment("https://www.google.com","Sed at ultricies orci."),
                                    StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                            )                                    ),
                    PElment(
                            listOf(
                                    StrElment(" Lorem ipsum dolor sit amet,"),
                                    BElment(" consectetur adipiscing elit."),
                                    StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                    LinkElment("https://www.google.com","Sed at ultricies orci."),
                                    StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                            )                                    ),
                    ImgElment(
                            "https://i.postimg.cc/Hnby32Pv/1517151881-149-15-perritos-que-fueron-premiados-por-su-belleza-c.jpg"
                    )
            )
    )
}