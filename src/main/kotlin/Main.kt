import content.*

fun main() {

    val post = Post(
        0,
        0,
        0,
        0,
        0,
        "Всем привет!",
        0,
        0,
        false,
        Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
        Copyright(0, "", "", ""),
        Likes(0, userLikes = false, canLike = false, canPublish = false),
        Reposts(0, false),
        Views(0),
        "",
        0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        false,
        Donut(false, 0, false, ""),
        0,
        arrayOf(VideoAttachment(),AudioAttachment(),ImageAttachment(),PhotoAttachment(),LinkAttachment()),
        null,
        null,
        null
    )

    println(post)
}