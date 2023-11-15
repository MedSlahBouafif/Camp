package com.mohamedslahsapplication.app.modules.profilecomplete.ui

import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivityProfileCompleteBinding
import com.mohamedslahsapplication.app.modules.home.ui.HomeActivity
import com.mohamedslahsapplication.app.modules.profilecomplete.`data`.viewmodel.ProfileCompleteVM
import kotlin.String
import kotlin.Unit

class ProfileCompleteActivity :
    BaseActivity<ActivityProfileCompleteBinding>(R.layout.activity_profile_complete) {
  private val viewModel: ProfileCompleteVM by viewModels<ProfileCompleteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileCompleteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearCompletebutton.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_COMPLETE_ACTIVITY"

  }
}
