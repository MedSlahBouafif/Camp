package com.mohamedslahsapplication.app.modules.otptwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivityOtpTwoBinding
import com.mohamedslahsapplication.app.modules.otptwo.`data`.viewmodel.OtpTwoVM
import com.mohamedslahsapplication.app.modules.profile.ui.ProfileActivity
import kotlin.String
import kotlin.Unit

class OtpTwoActivity : BaseActivity<ActivityOtpTwoBinding>(R.layout.activity_otp_two) {
  private val viewModel: OtpTwoVM by viewModels<OtpTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVerify.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OTP_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OtpTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
