package com.example.midterm_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClicked = findViewById<Button>(R.id.button)
        val name = findViewById<EditText>(R.id.nameInput)
        val email = findViewById<EditText>(R.id.emailInput)
        val password = findViewById<EditText>(R.id.passwordInput)
        val repeatPassword = findViewById<EditText>(R.id.repeatInput)
        buttonClicked.setOnClickListener{
            if (TextUtils.isEmpty(name.toString())){
                Toast.makeText(this@MainActivity, "შეიყვანე სახელი", Toast.LENGTH_SHORT).show()
            }
            if (password != repeatPassword) {
                Toast.makeText(this@MainActivity, "პაროლები უნდა ემთხვეოდეს ერთმანეთს", Toast.LENGTH_SHORT).show()
            }
            if (TextUtils.isEmpty(password.toString())){
                Toast.makeText(this@MainActivity, "პაროლის გრაფა არ უნდა იყოს ცარიელი", Toast.LENGTH_SHORT).show()
            }
            if (TextUtils.isEmpty(repeatPassword.toString())){
                Toast.makeText(this@MainActivity, "პაროლის გრაფა არ უნდა იყოს ცარიელი", Toast.LENGTH_SHORT).show()
            }
            if ("@" in email.toString()){
                println("success")
            }else{
                Toast.makeText(this@MainActivity, "email არასწორია", Toast.LENGTH_SHORT).show()
            }
        }
    }
}