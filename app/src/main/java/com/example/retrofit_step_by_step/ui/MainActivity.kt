package com.example.retrofit_step_by_step.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofit_step_by_step.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import ui.model.login.RegesterViewModel

class MainActivity : AppCompatActivity() {
    val regesterViewModel : RegesterViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        var a = findViewById<TextView>(R.id.textView2)
//        a.text = loginViewModel.user.name

    }
}