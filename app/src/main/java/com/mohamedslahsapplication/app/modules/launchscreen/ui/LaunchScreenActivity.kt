package com.mohamedslahsapplication.app.modules.launchscreen.ui

import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivityLaunchScreenBinding
import com.mohamedslahsapplication.app.modules.launchscreen.`data`.viewmodel.LaunchScreenVM
import com.mohamedslahsapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.String
import kotlin.Unit

class LaunchScreenActivity :
    BaseActivity<ActivityLaunchScreenBinding>(R.layout.activity_launch_screen) {
  private val viewModel: LaunchScreenVM by viewModels<LaunchScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.launchScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogocampingpar.setOnClickListener {
      val destIntent = WelcomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LAUNCH_SCREEN_ACTIVITY"

  }
}
