package com.example.idadedecachorro
import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val dados: Bundle? = intent.extras

        val idade = dados?.getString("idade")
        idade?.let { resetar(it) }?.let { calcula(it) }
    }
    fun resetar(valor:String):String{
        var retorno:String =valor
        if ( valor == null || valor.equals("")){
            retorno="0"
        }
        return  retorno
    }
    fun calcula(idade:String){
        val nIdade:Double = idade.toDouble()
        val res =nIdade*7
        resultado.setText(res.toString())

    }
}
