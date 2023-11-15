package com.mohamedslahsapplication.app.modules.otpone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.otpone.`data`.model.OtpOneModel
import org.koin.core.KoinComponent

class OtpOneVM : ViewModel(), KoinComponent {
  val otpOneModel: MutableLiveData<OtpOneModel> = MutableLiveData(OtpOneModel())

  var navArguments: Bundle? = null
}
