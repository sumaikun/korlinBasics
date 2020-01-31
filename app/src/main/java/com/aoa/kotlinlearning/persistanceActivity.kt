package com.aoa.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aoa.kotlinlearning.Config.SharedApp
import kotlinx.android.synthetic.main.activity_persistance.*

class persistanceActivity : AppCompatActivity() {

    val EMPTY_VALUE = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persistance)

        configView()

        btnSaveValue.setOnClickListener {
            SharedApp.prefs.name = etName.text.toString()
            configView() }
        btnDeleteValue.setOnClickListener {
            SharedApp.prefs.name = EMPTY_VALUE
            configView()}
    }

    fun showProfile(){
        tvName.visibility = View.VISIBLE
        tvName.text = "Hola ${SharedApp.prefs.name}"
        btnDeleteValue.visibility = View.VISIBLE
        etName.visibility = View.INVISIBLE
        btnSaveValue.visibility = View.INVISIBLE
    }

    fun showGuest(){
        tvName.visibility = View.INVISIBLE
        btnDeleteValue.visibility = View.INVISIBLE
        etName.visibility = View.VISIBLE
        btnSaveValue.visibility = View.VISIBLE
    }


    fun configView(){
        if(isSavedName()) showProfile() else showGuest()
    }

    fun isSavedName():Boolean{
        val myName = SharedApp.prefs.name
        return myName != EMPTY_VALUE
    }
}
