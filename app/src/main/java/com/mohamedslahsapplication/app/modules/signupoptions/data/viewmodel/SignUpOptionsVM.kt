package com.mohamedslahsapplication.app.modules.signupoptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.mohamedslahsapplication.app.modules.signupoptions.`data`.model.SignUpOptionsModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class SignUpOptionsVM : ViewModel(), KoinComponent {
  val signUpOptionsModel: MutableLiveData<SignUpOptionsModel> =
      MutableLiveData(SignUpOptionsModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
