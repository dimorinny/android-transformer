package com.mobandme.sample.kotlin.app

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.mobandme.android.transformer.Transformer
import com.mobandme.sample.kotlin.app.model.NetworkHome
import com.mobandme.sample.kotlin.app.model.PresentationHome

/**
 * Created by Dimorinny on 20.05.16.
 */
class MainActivity : Activity() {

    companion object {
        private val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val presentationHomeTransformer = Transformer.Builder().build(PresentationHome::class.java)

            val presentationHome = PresentationHome()
            presentationHome.city = "city"
            presentationHome.name = "name"

            val networkHome = presentationHomeTransformer.transform(presentationHome, NetworkHome::class.java)

            Log.d(TAG, networkHome.city)
            Log.d(TAG, networkHome.name)

        } catch (e: Exception) {
            Log.e("android-transformer", e.message, e)
        }
    }
}