package com.likeminds.feed.social.example

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.likeminds.feed.android.core.LMFeedCore
import com.likeminds.feed.android.core.socialfeed.view.LMFeedSocialFeedFragment
import com.likeminds.feed.android.core.utils.user.UserResponse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiKey = "" // api key generated from the dashboard
        val userName = "" // name of the user
        val userId = "" // id of the user
        val context = this // instance of context

        // pass this successCallback to LMFeedCore.showFeed()
        val successCallback = { response : UserResponse? ->
            // inflate social feed fragment in your activity
            val containerViewId = R.id.frame_layout
            val fragment = LMFeedSocialFeedFragment.getInstance()

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(containerViewId, fragment, containerViewId.toString())
            transaction.commit()
            Unit
        } // callback triggered when the initiate user call is successful

        val failureCallback = { errorMessage: String? ->
            Log.e("Example", errorMessage ?: "")
            Unit
        } // callback triggered when the initiate user call fails

        LMFeedCore.showFeed(
            context = context,
            apiKey = apiKey,
            uuid = userId,
            userName = userName,
            success = successCallback,
            error = failureCallback
        )
    }
}