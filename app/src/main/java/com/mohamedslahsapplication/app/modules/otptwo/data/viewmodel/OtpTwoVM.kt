package com.mohamedslahsapplication.app.modules.otptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.otptwo.`data`.model.OtpTwoModel
import org.koin.core.KoinComponent

class OtpTwoVM : ViewModel(), KoinComponent {
  val otpTwoModel: MutableLiveData<OtpTwoModel> = MutableLiveData(OtpTwoModel())

  var navArguments: Bundle? = null
}
