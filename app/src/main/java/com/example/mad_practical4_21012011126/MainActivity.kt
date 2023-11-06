package com.example.mad_practical4_21012011126

import android.R
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun1()
    }
    private  fun fun1(){
    val login:Button=findViewById(R.id.login);
    val signup:Button=findViewById(R.id.signup);
    login.setOnClickListener{
        Intent(this,loginActivity::class.java).also { startActivity(it) }
    }
    signup.setOnClickListener{
        Intent(this,signupActivity::class.java).also{startActivity(it)}
    }


}

}