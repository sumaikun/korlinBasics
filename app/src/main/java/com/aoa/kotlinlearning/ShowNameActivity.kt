package com.aoa.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_name.*

class ShowNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_name)
        getAndShowName()
        btnBack.setOnClickListener { onBackPressed() }
    }

    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("name")
        tvGreeting.text = getString(R.string.welcome, name)
    }
}
