package com.example.empregaeu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.empregaeu.databinding.ActivitySegundaTelaBinding

class SegundaTelaActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeUsuario = binding.textView
        val nome = intent.getStringExtra("intentNomeUsuario")
        nomeUsuario.text = nome
        val btParaTela3 = binding.button2

        btParaTela3.setOnClickListener {
            val intent = Intent(this, TerceiraTelaActivity::class.java)
            startActivity(intent)
        }



    }
}