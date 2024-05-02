package com.cidadeprogressofiap.app.modules.login.`data`.model

import com.cidadeprogressofiap.app.R
import com.cidadeprogressofiap.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEmprogresso: String? = MyApp.getInstance().resources.getString(R.string.lbl_em_progresso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCidade: String? = MyApp.getInstance().resources.getString(R.string.lbl_cidade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntrepara: String? =
      MyApp.getInstance().resources.getString(R.string.msg_entre_para_contribuir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCpf: String? = MyApp.getInstance().resources.getString(R.string.lbl_cpf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenha: String? = MyApp.getInstance().resources.getString(R.string.lbl_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrimeiroacesso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_primeiro_acesso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEdittextValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFluenteyehideTwValue: String? = null
)
