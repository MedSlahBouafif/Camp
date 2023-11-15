package com.mohamedslahsapplication.app.modules.home.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMattyIce: String? = MyApp.getInstance().resources.getString(R.string.lbl_mattyice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCampingRecanto: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_camping_recanto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItaguCamping: String? = MyApp.getInstance().resources.getString(R.string.lbl_itagu_camping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtState: String? = MyApp.getInstance().resources.getString(R.string.lbl_state)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)

)
