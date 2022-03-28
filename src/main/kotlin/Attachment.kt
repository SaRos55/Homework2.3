import content.*

interface Attachment {
    val type: String
    val content: Content
}

class AudioAttachment : Attachment {
    override val type = "audio"
    override val content = Audio()
}

class VideoAttachment : Attachment {
    override val type = "video"
    override val content = Video()
}

class ImageAttachment : Attachment {
    override val type = "image"
    override val content = Image()
}

class PhotoAttachment : Attachment {
    override val type = "photo"
    override val content = Photo()
}

class LinkAttachment : Attachment {
    override val type = "Link"
    override val content = Link()
}