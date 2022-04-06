import content.*

interface Attachment {
    val type: String
    val content: Content
}

data class AudioAttachment(
    override val type: String = "audio",
    override val content: Audio = Audio()
) : Attachment

data class VideoAttachment(
    override val type: String = "video",
    override val content: Video = Video()
) : Attachment

data class ImageAttachment(
    override val type: String = "image",
    override val content: Image = Image()
) : Attachment

data class PhotoAttachment(
    override val type: String = "photo",
    override val content: Photo = Photo()
) : Attachment

data class LinkAttachment(
    override val type: String = "link",
    override val content: Link = Link()
) : Attachment