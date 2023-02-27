package com.cg.lib.socialloginlib.ui.login

import android.content.Intent

interface ICGActivityResultCallback {
    fun onActivityResult(requestCode:Int,resultCode:Int,data: Intent?):Boolean
}