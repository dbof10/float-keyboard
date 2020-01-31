package com.blackcj.customkeyboard

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        settingButtonIME.setOnClickListener {
            val intent = Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)
            startActivityForResult(intent, 0)
        }

        settingButtonGeneral.setOnClickListener {
            val imeManager = applicationContext.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imeManager.showInputMethodPicker()
        }

    }

}
