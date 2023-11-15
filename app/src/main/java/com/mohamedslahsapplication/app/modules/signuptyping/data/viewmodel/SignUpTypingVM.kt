package com.mohamedslahsapplication.app.modules.signuptyping.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.signuptyping.`data`.model.SignUpTypingModel
import org.koin.core.KoinComponent

class SignUpTypingVM : ViewModel(), KoinComponent {
  val signUpTypingModel: MutableLiveData<SignUpTypingModel> = MutableLiveData(SignUpTypingModel())

  var navArguments: Bundle? = null
}
