package com.mohamedslahsapplication.app.modules.profiletyping.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.profiletyping.`data`.model.ProfileTypingModel
import org.koin.core.KoinComponent

class ProfileTypingVM : ViewModel(), KoinComponent {
  val profileTypingModel: MutableLiveData<ProfileTypingModel> =
      MutableLiveData(ProfileTypingModel())

  var navArguments: Bundle? = null
}
