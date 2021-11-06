package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var editTextTextEmailAddress: EditText
    private lateinit var editTextTextPassword2: EditText
    private lateinit var button: Button
    private lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        surname = findViewById(R.id.surname)
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress)
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2)
        button = findViewById(R.id.button)
        checkBox = findViewById(R.id.checkBox)

        button.setOnClickListener {
            val name1 = name.text.toString().trim()
            val surname1 = surname.text.toString().trim()
            val email = editTextTextEmailAddress.text.toString().trim()
            val password = editTextTextPassword2.text.toString().trim()
            val checkbox1 = checkBox



            if (name1.isEmpty()) {
                name.error = "შეიყვანეთ სახელი"
                return@setOnClickListener
            } else if (surname1.isEmpty()) {
                surname.error = "შეიყვანეთ გვარი"
                return@setOnClickListener
            } else if (email.isEmpty() or ("@" !in email) or !(email.contains(".")) ) {
                editTextTextEmailAddress.error = "შეიყვანეთ Email"
                return@setOnClickListener
            } else if (password.isEmpty() or (password.length < 8)) {
                editTextTextPassword2.error = "შეიყვანეთ პაროლი"
                return@setOnClickListener
            } else if (!(checkbox1.isChecked)) {
                checkBox.error = "მონიშნეთ checkbox"
                return@setOnClickListener
            } else {
                Toast.makeText(this, "მმმმმმმ", Toast.LENGTH_SHORT).show()
            }


        }


    }


}
