package com.cidadeprogressofiap.app.modules.contribuies.`data`.model

import com.cidadeprogressofiap.app.R
import com.cidadeprogressofiap.app.appcomponents.di.MyApp
import kotlin.String

data class ContribuiEsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEscolhaotipo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_escolha_o_tipo_da)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReparode: String? = MyApp.getInstance().resources.getString(R.string.msg_reparo_de_buracos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPedidopontode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pedido_ponto_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSugestode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sugest_o_de_sinaliza_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPedidode: String? = MyApp.getInstance().resources.getString(R.string.msg_pedido_de_rampas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCasoseupedido: String? =
      MyApp.getInstance().resources.getString(R.string.msg_caso_seu_pedido)

)
