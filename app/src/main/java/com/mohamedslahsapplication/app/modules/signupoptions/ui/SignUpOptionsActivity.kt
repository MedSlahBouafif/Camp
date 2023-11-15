package com.mohamedslahsapplication.app.modules.signupoptions.ui

import android.content.Intent
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.appcomponents.facebookauth.FacebookHelper
import com.mohamedslahsapplication.app.appcomponents.googleauth.GoogleHelper
import com.mohamedslahsapplication.app.databinding.ActivitySignUpOptionsBinding
import com.mohamedslahsapplication.app.modules.signupoptions.`data`.viewmodel.SignUpOptionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpOptionsActivity :
    BaseActivity<ActivitySignUpOptionsBinding>(R.layout.activity_sign_up_options) {
  private val viewModel: SignUpOptionsVM by viewModels<SignUpOptionsVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpOptionsVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearUtilitiesCus1.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.linearUtilitiesCus.setOnClickListener {
          googleLogin.login()
        }
      }

      companion object {
        const val TAG: String = "SIGN_UP_OPTIONS_ACTIVITY"

      }
    }
