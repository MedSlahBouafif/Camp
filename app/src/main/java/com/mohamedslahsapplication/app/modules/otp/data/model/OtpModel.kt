package com.mohamedslahsapplication.app.modules.otp.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOTPVerificatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_verificatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWewillsendto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_will_send_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterMobileNu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_mobile_nu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2015550124: String? = MyApp.getInstance().resources.getString(R.string.lbl_201_555_0124)

)
