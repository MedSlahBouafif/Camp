package com.mohamedslahsapplication.app.modules.homespot.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivityHomeSpotBinding
import com.mohamedslahsapplication.app.modules.homespot.`data`.viewmodel.HomeSpotVM
import kotlin.String
import kotlin.Unit

class HomeSpotActivity : BaseActivity<ActivityHomeSpotBinding>(R.layout.activity_home_spot) {
  private val viewModel: HomeSpotVM by viewModels<HomeSpotVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeSpotVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SPOT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeSpotActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
