package com.mohamedslahsapplication.app.modules.profilecomplete.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.profilecomplete.`data`.model.ProfileCompleteModel
import org.koin.core.KoinComponent

class ProfileCompleteVM : ViewModel(), KoinComponent {
  val profileCompleteModel: MutableLiveData<ProfileCompleteModel> =
      MutableLiveData(ProfileCompleteModel())

  var navArguments: Bundle? = null
}
