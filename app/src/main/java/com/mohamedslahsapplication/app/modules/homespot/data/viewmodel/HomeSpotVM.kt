package com.mohamedslahsapplication.app.modules.homespot.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedslahsapplication.app.modules.homespot.`data`.model.HomeSpotModel
import org.koin.core.KoinComponent

class HomeSpotVM : ViewModel(), KoinComponent {
  val homeSpotModel: MutableLiveData<HomeSpotModel> = MutableLiveData(HomeSpotModel())

  var navArguments: Bundle? = null
}
