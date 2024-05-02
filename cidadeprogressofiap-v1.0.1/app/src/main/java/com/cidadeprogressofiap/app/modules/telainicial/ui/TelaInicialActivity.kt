package com.cidadeprogressofiap.app.modules.telainicial.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.cidadeprogressofiap.app.R
import com.cidadeprogressofiap.app.appcomponents.base.BaseActivity
import com.cidadeprogressofiap.app.databinding.ActivityTelaInicialBinding
import com.cidadeprogressofiap.app.modules.contribuies.ui.ContribuiEsActivity
import com.cidadeprogressofiap.app.modules.telainicial.`data`.viewmodel.TelaInicialVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TelaInicialActivity : BaseActivity<ActivityTelaInicialBinding>(R.layout.activity_tela_inicial)
    {
  private val viewModel: TelaInicialVM by viewModels<TelaInicialVM>()

  private val REQUEST_CODE_CONTRIBUI_ES_ACTIVITY: Int = 607


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaInicialVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnIconbutton.setOnClickListener {
      val destIntent = ContribuiEsActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CONTRIBUI_ES_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "TELA_INICIAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TelaInicialActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
