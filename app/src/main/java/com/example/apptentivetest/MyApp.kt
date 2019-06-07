package com.example.apptentivetest

import android.app.Application
import com.apptentive.android.sdk.Apptentive
import com.apptentive.android.sdk.ApptentiveConfiguration

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        val configuration = ApptentiveConfiguration("", "")  // Insert Apptentive Key and Signature to test
        Apptentive.register(this, configuration)
    }
}
