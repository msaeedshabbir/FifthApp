package com.app.fifth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns.*
import android.widget.Toast
import com.app.fifth.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnLogin.setOnClickListener {

            var username = binding.etUsername.text.toString().trim();
            var pasword = binding.etPassword.text.toString().trim();

            if (TextUtils.isEmpty(username)) {
                binding.etUsername?.error = "Enter Username"
                binding.etUsername.requestFocus();
            } else if (TextUtils.isEmpty(pasword)) {
                binding.etPassword?.error = "Enter Password"
                binding.etPassword.requestFocus();
            } else {
                Toast.makeText(this, "Login Success", Toast.LENGTH_LONG).show()
                val i = Intent(this, SignUp::class.java)
                startActivity(i)
            }
        }

    }
}

//              binding.etUsername.text.clear();
//              binding.etUsername.text.clear();
