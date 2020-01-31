package com.aoa.kotlinlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FragmentCameraActivity : AppCompatActivity() , OnFragmentActionsListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_camera)
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this, "El botón ha sido pulsado", Toast.LENGTH_SHORT).show()
    }

    override fun onClickFragmentButton2() {
        val intent = Intent(this, CameraTest::class.java)
        startActivity(intent)
    }
}
