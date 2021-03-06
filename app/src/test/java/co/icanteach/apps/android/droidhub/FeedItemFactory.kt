package co.icanteach.apps.android.droidhub

import co.icanteach.apps.android.droidhub.news.FeedItem

object FeedItemFactory {

    fun createFeedItem(
        originUrl: String = "www.example.com",
        image: String = "example_image",
        title: String = "example_title",
        description: String = "example_description",
        category: String = "example_category"
    ): FeedItem {
        return FeedItem(
            originUrl, image, title, description, category
        )
    }
}