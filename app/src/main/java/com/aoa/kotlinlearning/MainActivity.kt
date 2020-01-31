package com.aoa.kotlinlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnChangeActivity.setOnClickListener { checkValue() }
        btnGoHeros.setOnClickListener{ goheroes() }
        btnGoPrefs.setOnClickListener{ goprefs() }
        btnGoMisNotas.setOnClickListener{ goMisNotas() }
        btnGoToRest.setOnClickListener{ goToDogs() }
        btnGoToFragCa.setOnClickListener{ goToFragCamera() }

    }

    fun checkValue(){
        if(etName.text.toString().isEmpty()){
            Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show()
        }else{
            //Iremos a otra pantalla
            val intent = Intent(this, ShowNameActivity::class.java)
            intent.putExtra("name", etName.text.toString())
            startActivity(intent)
        }
    }


    fun goheroes(){
        val intent = Intent(this, HerosList::class.java)
        startActivity(intent)
    }

    fun goprefs(){
        val intent = Intent(this, persistanceActivity::class.java)
        startActivity(intent)
    }

    fun goMisNotas(){
        val intent = Intent(this, MisNotas::class.java)
        startActivity(intent)
    }

    fun goToDogs(){
        val intent = Intent(this, RestDogActivity::class.java)
        startActivity(intent)
    }

    fun goToFragCamera(){
        val intent = Intent(this, FragmentCameraActivity::class.java)
        startActivity(intent)
    }

}
