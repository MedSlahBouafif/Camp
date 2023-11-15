package com.mohamedslahsapplication.app.modules.otpone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.base.BaseActivity
import com.mohamedslahsapplication.app.databinding.ActivityOtpOneBinding
import com.mohamedslahsapplication.app.modules.otpone.`data`.viewmodel.OtpOneVM
import com.mohamedslahsapplication.app.modules.otptwo.ui.OtpTwoActivity
import kotlin.String
import kotlin.Unit

class OtpOneActivity : BaseActivity<ActivityOtpOneBinding>(R.layout.activity_otp_one) {
  private val viewModel: OtpOneVM by viewModels<OtpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewButton.setOnClickListener {
      val destIntent = OtpTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OTP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OtpOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
