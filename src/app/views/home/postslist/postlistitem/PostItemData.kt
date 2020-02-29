package app.views.home.postslist.postlistitem

data class PostItemData(
        val id:String,
        val title: String,
        val description:String,
        val photo:String,
        val content:List<ElementData>
)

sealed class ElementData

data class ImgElment(val src:String):ElementData()
data class H1Elment(val title:String):ElementData()
data class PElment(val content:String):ElementData()