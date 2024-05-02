package com.cidadeprogressofiap.app.modules.telainicial.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cidadeprogressofiap.app.modules.telainicial.`data`.model.TelaInicialModel
import org.koin.core.KoinComponent

class TelaInicialVM : ViewModel(), KoinComponent {
  val telaInicialModel: MutableLiveData<TelaInicialModel> = MutableLiveData(TelaInicialModel())

  var navArguments: Bundle? = null
}
