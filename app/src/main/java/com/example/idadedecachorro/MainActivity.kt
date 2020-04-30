package com.example.idadedecachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botao.setOnClickListener {
            val idade = idade.text.toString()

            val intent = Intent(applicationContext, ResultadoActivity::class.java)

            intent.putExtra("idade", idade)

            startActivity(intent)
        }
    }
}
