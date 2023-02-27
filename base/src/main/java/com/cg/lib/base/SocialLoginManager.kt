package com.cg.lib.base

import com.cg.lib.base.model.CGUserData

interface GoogleLoginManager {
    fun loginWithGoogle(callback: CGCallback)

}

public interface FBLoginManager {
    fun loginWithFacebook(callback: CGCallback)

}

interface SocialLoginManager : GoogleLoginManager, FBLoginManager {
    fun returnUserData(user:CGUserData)
}