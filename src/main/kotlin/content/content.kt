package content

open class Content {
        val id: Int
                get() {
                        TODO()
                }
        val album_id: Int
                get() {
                        TODO()
                }
        val owner_id: Int
                get() {
                        TODO()
                }
        val user_id: Int = 0
}

class Audio : Content()
class Video : Content()
class Image : Content()
class Photo : Content()
class Link : Content()