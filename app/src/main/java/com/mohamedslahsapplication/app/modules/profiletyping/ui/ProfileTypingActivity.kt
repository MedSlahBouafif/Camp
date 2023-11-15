package com.mohamedslahsapplication.app.modules.profiletyping.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivityProfileTypingBinding
import com.mohamedslahsapplication.app.modules.profiletyping.`data`.viewmodel.ProfileTypingVM
import kotlin.String
import kotlin.Unit

class ProfileTypingActivity :
    BaseActivity<ActivityProfileTypingBinding>(R.layout.activity_profile_typing) {
  private val viewModel: ProfileTypingVM by viewModels<ProfileTypingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileTypingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_TYPING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileTypingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
