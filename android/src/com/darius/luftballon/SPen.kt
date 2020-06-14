package com.darius.luftballon

import android.view.KeyEvent
import com.darius.luftballon.Activities.StartActivity
import com.darius.luftballon.Utilities.SPenInput
import com.samsung.android.sdk.penremote.SpenRemote
import com.samsung.android.sdk.penremote.SpenUnitManager

class SPen(var activity: StartActivity) : SPenInput, KeyEvent.Callback{
    private var spenRemote: SpenRemote? = null
    private var spenUnitManager: SpenUnitManager? = null

    init{
        spenRemote = SpenRemote.getInstance()
        checkSdkInfo()
        //spenUnitManager= SpenUnitManager();
    }

    private fun checkSdkInfo() {
        println( "VersionCode=" + spenRemote?.versionCode)
        println( "VersionName=" + spenRemote?.versionName)
        println( "Support Button = " + spenRemote?.isFeatureEnabled(SpenRemote.FEATURE_TYPE_BUTTON))
        println( "Support Air motion = " + spenRemote?.isFeatureEnabled(SpenRemote.FEATURE_TYPE_AIR_MOTION))
    }

//    override fun action(type: Int) {
//        println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFAAAAAAAAAAAAAAAAAAAAAAAAAAA")
//        super.action(1)
//    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF $keyCode ${event!!.action}")
//        if (keyCode == KeyEvent.KEYCODE_A)
//            println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
//        if (keyCode == KeyEvent.KEYCODE_B)
//            println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB")
//        if (keyCode == KeyEvent.KEYCODE_C)
//            println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC")
//        if (keyCode == KeyEvent.KEYCODE_D)
//            println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD")
//        if (keyCode == KeyEvent.KEYCODE_E)
//            println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE")
//        if (keyCode == KeyEvent.KEYCODE_F)
//            println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF")
        return true
    }

    override fun onKeyMultiple(keyCode: Int, count: Int, event: KeyEvent?): Boolean {
        return false
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        return false
    }
    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        return false
    }
}