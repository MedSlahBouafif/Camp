package com.mohamedslahsapplication.app.modules.profiletyping.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileTypingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFortySevenValue: String? = null
)
