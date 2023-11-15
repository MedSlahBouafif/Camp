package com.mohamedslahsapplication.app.modules.signinpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.signinpassword.`data`.model.SignInPasswordModel
import org.koin.core.KoinComponent

class SignInPasswordVM : ViewModel(), KoinComponent {
  val signInPasswordModel: MutableLiveData<SignInPasswordModel> =
      MutableLiveData(SignInPasswordModel())

  var navArguments: Bundle? = null
}
