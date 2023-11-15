package com.mohamedslahsapplication.app.modules.homespot.`data`.model

import com.mohamedslahsapplication.app.R
import com.mohamedslahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeSpotModel(
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
  var txtCampingRecantoOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_camping_recanto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvBeiraMar: String? = MyApp.getInstance().resources.getString(R.string.msg_av_beira_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoute: String? = MyApp.getInstance().resources.getString(R.string.lbl_route)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_call)

)
