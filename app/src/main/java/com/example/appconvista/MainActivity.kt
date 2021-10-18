package com.example.appconvista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etNombre:EditText
    private lateinit var etPassword:EditText
    private lateinit var etN1:EditText
    private lateinit var etN2:EditText
    private var tvR:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNombre = findViewById(R.id.et_Nombre)
        etPassword = findViewById(R.id.et_Password)
        etN1 = findViewById(R.id.et_Numero1)
        etN2 = findViewById(R.id.et_Numero2)
        tvR = findViewById(R.id.tv_Resultado)
    }

    //se creara una funcion para el registro
    fun registro(Vista:View){
        val nombre = etNombre.text.toString()
        val password = etPassword.text.toString()

        if(nombre.length==0){
            Toast.makeText(this,"Debes ingresar un nombre",Toast.LENGTH_LONG).show()
        }
        if(password.length==0){
            Toast.makeText(this,"Debes ingresar una contraseña",Toast.LENGTH_LONG).show()
        }
        if(nombre.length!=0&&password.length!=0){
            Toast.makeText(this,"Procesando el registro...",Toast.LENGTH_LONG).show()
        }
    }

    //funcion para el boton calcular
    fun calcular(Vista: View){
        val valor1 = etN1.text.toString()
        val valor2 = etN2.text.toString()

        val num1:Int = Integer.parseInt(valor1)
        val num2:Int = Integer.parseInt(valor2)

        var suma = num1+num2
        var resultado:String = suma.toString()


        tvR?.setText(resultado)


    }


}