package com.mohamedslahsapplication.app.modules.profilecomplete.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileCompleteModel(
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
  var txtComplete: String? = MyApp.getInstance().resources.getString(R.string.lbl_complete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = null
)
