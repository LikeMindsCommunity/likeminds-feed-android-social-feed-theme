package com.likeminds.feed.social.example

import android.app.Application
import com.likeminds.feed.android.core.LMFeedCore
import com.likeminds.feed.android.core.LMFeedTheme

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val application = this
        val theme = LMFeedTheme.SOCIAL_FEED
        val enablePushNotifications = false
        val deviceId = null
        val domain = "ENTER YOUR DOMAIN HERE"
        val lmFeedCoreCallback = null

        LMFeedCore.setup(
            application = application,
            theme,
            enablePushNotifications = enablePushNotifications,
            deviceId = deviceId,
            domain = domain,
            lmFeedCoreCallback = lmFeedCoreCallback
        )
    }
}