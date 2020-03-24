package app.views.data

import app.views.home.postslist.postlistitem.*

val allPostsData = listOf(
        PostItemData(
                "1",
                "Custom View Components en Android",
                "Un breve tutorial de como iniciar el desarrollo de componentes custom en Android.",
                "https://i.postimg.cc/tCHPJKYK/gatito.jpg",
                listOf(
                        H1Elment(
                                "Custom View Components en Android"
                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "Cuando se realiza cualquier tipo software, una" +
                                                " de las herramientas más útiles es la reusabilidad del código," +
                                                " y al codificar interfaces de usuario esto es realmente importante." +
                                                " En Android, el desarrollo de interfaces de usuario puede convertirse " +
                                                "en un infierno de forma muy rápida, como consecuencia de que aún no es " +
                                                "posible (al menos en una versión estable), el crear componentes visuales " +
                                                "de forma declarativa como lo hacen otros ambientes de desarrollo" +
                                                " como React o Flutter."
                                        )
                                )
                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "Si bien es cierto que existen algunas alternativas" +
                                                " como Anko Layouts (el cual está deprecado como consecuencia" +
                                                " del soporte nativo que tendrá Android con Jetpack Compose)," +
                                                " las cuales permiten crear interfaces de usuario de forma más" +
                                                " sencilla, los Custom View Components, solo agregar más " +
                                                "funcionalidad a estos mismos, ya que nos permitirán rehusar de" +
                                                " forma sencilla nuestras cápsulas visuales en nuestra app."
                                        )
                                )
                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "De forma concreta un Custom View Component, es una pieza de" +
                                                " código (clase) que encapsula toda la lógica de un " +
                                                "component visual con su apariencia. Estas clases, heredan " +
                                                "de alguna otra(View, Button, TextView, entre otras) de la" +
                                                " cual nosotros queramos extender sus funcionalidades, o " +
                                                "simplemente crear una nueva que herede de cualquiera " +
                                                "de los layouts padres(linear layout, relative layout, " +
                                                "frame layout, constraint layout), para piezas de código" +
                                                " reusables, permitiendo un uso simple de las mismas en" +
                                                " cualquier parte del app."
                                        )
                                )
                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "Para entender mejor esto, supongamos que deseamos hacer un" +
                                                " boton que se bloquee cuando sea presionado, y que se" +
                                                " libere asi mismo luego de “n” segundos. Para ello haremos" +
                                                " uso de la clase CountDownTimer para generar la cuentra " +
                                                "atras, y desbloquear el boton una vez pase el tiempo determinado." +
                                                " Nuestro Layout padre sera un Relativelayout, por lo que nuestro" +
                                                " SelfBlockButton heredara de la clase Relativelayout."
                                        )
                                )
                        ),
                        CodeElment(
                                "class SelfBlockButton @JvmOverloads constructor(\n" +
                                        "       context: Context,\n" +
                                        "       attrs: AttributeSet? = null,\n" +
                                        "       defStyle: Int = 0\n" +
                                        ") : RelativeLayout(context, attrs, defStyle){\n" +
                                        "}\n",
                                "javascript"

                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "una vez hecho lo anterior, lo mas " +
                                                "importante para nosotros sera el bloque init, donde inflaremos " +
                                                "nuestro layout y usaremos el objeto attrs. Para inflar nuestro" +
                                                " layout:"
                                        )
                                )
                        ),
                        CodeElment(
                                "init {\n" +
                                        "   LayoutInflater.from(context)\n" +
                                        "           .inflate(\n" +
                                        "                   R.layout.selfBlockButtonLayout,\n" +
                                        "                   this,\n" +
                                        "                   true\n" +
                                        "           )\n" +
                                        "\n" +
                                        "   attrs.let {\n" +
                                        "       var a = context.obtainStyledAttributes(\n" +
                                        "       it,\n" +
                                        "       R.styleable.SelfBlockButton\n" +
                                        "       )\n" +
                                        "\n" +
                                        "       a.recycle()\n" +
                                        "   }\n" +
                                        "\n" +
                                        "}\n",
                                "javascript"

                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "Ahora, detengámonos un momento a entender estas lineas de codigo. Primeramente abriendo el bloque init, tenemos el LayoutInflater, el cual simplemente nos “infla” el layout del view que queremos dibujar en pantalla. Seguidamente, tenemos el bloque de attrs, con su respectivo lambda en let, con el cual podremos setear los parámetros básicos a renderizar en el mismo."
                                        )
                                )
                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "Para ello obtenemos una referencia al objeto que contiene todos los atributos que definimos para el view en el archivo attrs.xml, que esta en el directorio values de la carpeta res."
                                        )
                                )
                        ),
                        CodeElment(
                                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                                        "<resources>\n" +
                                        "\n" +
                                        "  <declare-styleable name=\"SelfBlockButton\">\n" +
                                        "       <attr name=\"timeBlocked\" format=\"integer\" />\n" +
                                        "   </declare-styleable>\n" +
                                        "\n" +
                                        "</resources>\n",
                                "xml"

                        ),
                        PElment(
                                listOf(
                                        StrElment(
                                                "Es necesario, que existan tantas etiquetas del tipo declare-styleable, como componentes custom tengamos definidos en nuestro proyecto. En estos hacemos uso de la etiqueta attr, con la cual definimos el nombre y el tipo de dato asociado al atributo. Por ahora definiremos el atributo como timeBlocked y será de tipo entero, y con este valor podremos pasar el tiempo que queramos que el botón se bloque al ser presionado. "
                                        )
                                )
                        ),
                        ImgElment(
                                "https://i.postimg.cc/tCHPJKYK/gatito.jpg"
                        )
                )
        ),
        PostItemData(
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
        ),
        PostItemData(
                "3",
                "Es el titulo 3",
                "Cras in tortor a sem faucibus venenatis",
                "https://i.postimg.cc/Qt27pPSW/pajarito.jpg",
                listOf(
                        H1Elment(
                                "Es el titulo 3"
                        ),
                        PElment(
                                listOf(
                                        StrElment("Lorem ipsum dolor sit amet,"),
                                        BElment(" consectetur adipiscing elit."),
                                        StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                        LinkElment("https://www.google.com","Sed at ultricies orci."),
                                        StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                )                                ),
                        PElment(
                                listOf(
                                        StrElment("Lorem ipsum dolor sit amet,"),
                                        BElment(" consectetur adipiscing elit."),
                                        StrElment(" Sed et odio id metus vestibulum tempus. Integer molestie risus ac est aliquet, vitae ullamcorper mi laoreet."),
                                        LinkElment("https://www.google.com","Sed at ultricies orci."),
                                        StrElment(" Phasellus dapibus, justo in venenatis tristique, nisi libero fringilla mi, quis laoreet elit velit in mauris. Integer placerat mollis augue, nec pellentesque neque egestas vitae. Aenean dictum lobortis nunc, a ornare mauris ultrices a. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam ut justo tempor, porta nibh vel, sagittis nisi. Vestibulum ac augue non massa commodo facilisis a quis sem. Suspendisse at ligula ac ipsum malesuada malesuada. Phasellus et laoreet diam. Nulla facilisis erat nec ligula fermentum ullamcorper")
                                )                                ),
                        ImgElment(
                                "https://i.postimg.cc/Qt27pPSW/pajarito.jpg"
                        )
                )
        )
)

fun getAllPostData():List<PostItemData>{
    return allPostsData
}

fun getPostDataById(idPost:String):PostItemData{
    return allPostsData.first{ it.id == idPost }
}