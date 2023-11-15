package com.mohamedslahsapplication.app.modules.otp.ui

import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivityOtpBinding
import com.mohamedslahsapplication.app.modules.otp.`data`.viewmodel.OtpVM
import com.mohamedslahsapplication.app.modules.otpone.ui.OtpOneActivity
import kotlin.String
import kotlin.Unit

class OtpActivity : BaseActivity<ActivityOtpBinding>(R.layout.activity_otp) {
  private val viewModel: OtpVM by viewModels<OtpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetOtp.setOnClickListener {
      val destIntent = OtpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OTP_ACTIVITY"

  }
}
