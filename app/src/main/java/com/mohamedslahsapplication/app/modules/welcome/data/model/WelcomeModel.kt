package com.mohamedslahsapplication.app.modules.welcome.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSignupButtonValue: String? = null
)
