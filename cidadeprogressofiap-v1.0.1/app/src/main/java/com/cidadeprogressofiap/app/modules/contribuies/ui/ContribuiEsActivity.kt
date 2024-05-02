package com.cidadeprogressofiap.app.modules.contribuies.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.cidadeprogressofiap.app.R
import com.cidadeprogressofiap.app.appcomponents.base.BaseActivity
import com.cidadeprogressofiap.app.databinding.ActivityContribuiEsBinding
import com.cidadeprogressofiap.app.modules.contribuies.`data`.viewmodel.ContribuiEsVM
import kotlin.String
import kotlin.Unit

class ContribuiEsActivity : BaseActivity<ActivityContribuiEsBinding>(R.layout.activity_contribui_es)
    {
  private val viewModel: ContribuiEsVM by viewModels<ContribuiEsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.contribuiEsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONTRIBUI_ES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContribuiEsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
