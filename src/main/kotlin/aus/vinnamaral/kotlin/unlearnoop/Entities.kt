package aus.vinnamaral.kotlin.unlearnoop


class Article(
    var status: ArticleStatus,

    val title: String
)

enum class ArticleStatus {
    PENDING, ACCEPTED, REJECTED, PUBLISHED
}

