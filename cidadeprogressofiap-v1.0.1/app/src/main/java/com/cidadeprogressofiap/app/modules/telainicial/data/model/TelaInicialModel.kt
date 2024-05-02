package com.cidadeprogressofiap.app.modules.telainicial.`data`.model

import com.cidadeprogressofiap.app.R
import com.cidadeprogressofiap.app.appcomponents.di.MyApp
import kotlin.String

data class TelaInicialModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOlgabrielvoc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ol_gabriel_voc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOlgabrielvoc1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ol_gabriel_voc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPontosCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_25_340_pontos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVocjrealizou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_voc_j_realizou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContribuiesco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_8_contribui_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVejaasltimas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_veja_as_ltimas)

)
