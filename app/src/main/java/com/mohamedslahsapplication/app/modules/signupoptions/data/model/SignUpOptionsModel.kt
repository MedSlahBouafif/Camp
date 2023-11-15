package com.mohamedslahsapplication.app.modules.signupoptions.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpOptionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithAOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSignupButtonValue: String? = null
)
