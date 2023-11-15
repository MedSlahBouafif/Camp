package com.mohamedslahsapplication.app.modules.signupwrongemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivitySignUpWrongEmailBinding
import com.mohamedslahsapplication.app.modules.signuptyping.ui.SignUpTypingActivity
import com.mohamedslahsapplication.app.modules.signupwrongemail.`data`.viewmodel.SignUpWrongEmailVM
import kotlin.String
import kotlin.Unit

class SignUpWrongEmailActivity :
    BaseActivity<ActivitySignUpWrongEmailBinding>(R.layout.activity_sign_up_wrong_email) {
  private val viewModel: SignUpWrongEmailVM by viewModels<SignUpWrongEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpWrongEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSigninButton.setOnClickListener {
      val destIntent = SignUpTypingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_WRONG_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpWrongEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
