package com.example.empregaeu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.empregaeu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val edTexto = findViewById<EditText>(R.id.edNome)
        val edNome = binding.edNome

        //val edButton = findViewById<Button>(R.id.button)
        val edButton = binding.button

        //val edSenha = findViewById<EditText>(R.id.edSenha)
        val edSenha = binding.edSenha

        //val tvTitulo = findViewById<TextView>(R.id.textView2)
        val tvTitulo = binding.textView2

        edButton.setOnClickListener{
            //val texto = edNome.text.toString()
            //Toast.makeText(this,texto, Toast.LENGTH_SHORT).show()

            if(edNome.text.toString()=="admin"){
                val intent = Intent(this, SegundaTelaActivity::class.java)
                intent.putExtra("intentNomeUsuario", edNome.text.toString())
                intent.putExtra("intentSenhaUsuario", edSenha.text.toString())
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"error user",Toast.LENGTH_SHORT).show()
            }


        }

        setContentView(R.layout.activity_main)
    }
}