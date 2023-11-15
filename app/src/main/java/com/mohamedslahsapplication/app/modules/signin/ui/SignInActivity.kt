package com.mohamedslahsapplication.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivitySignInBinding
import com.mohamedslahsapplication.app.modules.signin.`data`.viewmodel.SignInVM
import com.mohamedslahsapplication.app.modules.signinpassword.ui.SignInPasswordActivity
import kotlin.String
import kotlin.Unit

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSigninButton.setOnClickListener {
      val destIntent = SignInPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
