package com.sco.appkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton1: Button =findViewById(R.id.btn1)
        boton1.setOnClickListener{calcularProm()}

    }

    private  fun calcularProm(){
        val capturarName: EditText=findViewById(R.id.Capname)
        val mostrarName:TextView=findViewById(R.id.Bienvenido)
        val capturarContraseña: TextInputEditText =findViewById(R.id.contraseña)
        val contraseña=capturarContraseña.text.toString()
        val nombre=capturarName.text.toString()
        mostrarName.text="Hola $nombre su contraseña es: $contraseña"
        val capturarNum1:EditText = findViewById(R.id.nota1)
        val capturarNum2:EditText = findViewById(R.id.nota2)
        val capturarNum3:EditText = findViewById(R.id.nota3)
        val num1=capturarNum1.text.toString().toFloat()
        val num2=capturarNum2.text.toString().toFloat()
        val num3=capturarNum3.text.toString().toFloat()
        val promedio=(num1+num2+num3)/3

        Toast.makeText(this,"Señor/a $nombre el promedio de sus notas son: $promedio",Toast.LENGTH_LONG).show()
    }
}