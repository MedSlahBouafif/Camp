package com.mohamedslahsapplication.app.modules.otptwo.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpTwoModel(
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
  var txtSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntyourece: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_you_rece)

)
