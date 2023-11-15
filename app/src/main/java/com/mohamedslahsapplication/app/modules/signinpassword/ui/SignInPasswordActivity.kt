package com.mohamedslahsapplication.app.modules.signinpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivitySignInPasswordBinding
import com.mohamedslahsapplication.app.modules.signinpassword.`data`.viewmodel.SignInPasswordVM
import com.mohamedslahsapplication.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class SignInPasswordActivity :
    BaseActivity<ActivitySignInPasswordBinding>(R.layout.activity_sign_in_password) {
  private val viewModel: SignInPasswordVM by viewModels<SignInPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSigninButton.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
