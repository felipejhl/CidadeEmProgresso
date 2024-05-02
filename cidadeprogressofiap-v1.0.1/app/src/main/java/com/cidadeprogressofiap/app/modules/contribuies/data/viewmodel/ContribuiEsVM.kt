package com.cidadeprogressofiap.app.modules.contribuies.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cidadeprogressofiap.app.modules.contribuies.`data`.model.ContribuiEsModel
import org.koin.core.KoinComponent

class ContribuiEsVM : ViewModel(), KoinComponent {
  val contribuiEsModel: MutableLiveData<ContribuiEsModel> = MutableLiveData(ContribuiEsModel())

  var navArguments: Bundle? = null
}
