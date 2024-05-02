package com.cidadeprogressofiap.app.modules.login.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.cidadeprogressofiap.app.R
import com.cidadeprogressofiap.app.appcomponents.base.BaseActivity
import com.cidadeprogressofiap.app.databinding.ActivityLoginBinding
import com.cidadeprogressofiap.app.modules.login.`data`.viewmodel.LoginVM
import com.cidadeprogressofiap.app.modules.telainicial.ui.TelaInicialActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private val REQUEST_CODE_TELA_INICIAL_ACTIVITY: Int = 498

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = TelaInicialActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnEntrar.setOnClickListener {
        val destIntent = TelaInicialActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_TELA_INICIAL_ACTIVITY)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_ACTIVITY"

    }
  }
