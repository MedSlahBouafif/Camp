package com.mohamedslahsapplication.app.modules.signupwrongemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.signupwrongemail.`data`.model.SignUpWrongEmailModel
import org.koin.core.KoinComponent

class SignUpWrongEmailVM : ViewModel(), KoinComponent {
  val signUpWrongEmailModel: MutableLiveData<SignUpWrongEmailModel> =
      MutableLiveData(SignUpWrongEmailModel())

  var navArguments: Bundle? = null
}
