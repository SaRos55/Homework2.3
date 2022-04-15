data class Post(
    val id: Int,
    val ownerID: Int,
    val fromID: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerID: Int,
    val replyPostID: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerID: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedID: Int,
    val attachments: Array<Attachment>,
    val postSource: PostSource?,
    val geo: Geo?,
    val copyHistory: CopyHistory?
) {
    override fun toString(): String {
        //return super.toString()
        return "Post ID: $id\n" +
                "дата: $date\n" +
                "Текст поста: $text\n" +
                "Источник поста: " + (postSource ?: "н/д") + "\n" +
                "Информация о местоположении: " + (geo ?: "н/д") + "\n" +
                "История репостов: " + (copyHistory ?: "н/д")
    }
}

class CopyHistory {

}

class Geo {

}

class PostSource {

}

class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class Reposts(
    val count: Int,
    val userReposted: Boolean
)

class Views(
    val count: Int
)

class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

//object WallService {
class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var id: Int = 0

    fun add(post: Post): Post {
        id += 1
        val postWithID = post.copy(id = id)
        posts += postWithID
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, p) in posts.withIndex()) {
            if (p.id == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment): String {
        var itPost = false
        val id = comment.postId
        for (post in posts) {
            if (post.id == id) {
                itPost = true
            }
        }
        if (itPost) {
            comments += comment
            return "Комментарий успешно добавлен"
        } else {
            throw PostNotFoundException ("no post with id $id")
        }
    }
}