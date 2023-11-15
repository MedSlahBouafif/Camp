package com.mohamedslahsapplication.app.modules.signuptyping.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivitySignUpTypingBinding
import com.mohamedslahsapplication.app.modules.signuptyping.`data`.viewmodel.SignUpTypingVM
import kotlin.String
import kotlin.Unit

class SignUpTypingActivity :
    BaseActivity<ActivitySignUpTypingBinding>(R.layout.activity_sign_up_typing) {
  private val viewModel: SignUpTypingVM by viewModels<SignUpTypingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpTypingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_TYPING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpTypingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
