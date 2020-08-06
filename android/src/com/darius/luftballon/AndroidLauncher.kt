package com.darius.luftballon

import android.os.Bundle
import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.darius.luftballon.Activities.StartActivity


class AndroidLauncher : AndroidApplication() {
    //private var spen: SPen? = null

    private var startActivity: StartActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val config = AndroidApplicationConfiguration()
        startActivity = StartActivity()
        initialize(startActivity, config)
        //spen = SPen(startActivity!!)
    }
}