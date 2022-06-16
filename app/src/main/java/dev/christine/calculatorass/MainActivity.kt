package dev.christine.calculatorass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tvRes: TextView
    lateinit var tilNum1: TextInputLayout
    lateinit var tilNum2: TextInputLayout
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnDivision: Button
    lateinit var btnModulus: Button
    lateinit var etNum1: TextInputEditText
    lateinit var etNum2: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvRes = findViewById(R.id.tvRes)
        tilNum1 = findViewById(R.id.tilNum1)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tilNum2 = findViewById(R.id.tilNum2)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnDivision = findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)

        btnAddition.setOnClickListener {
            var number1 = etNum1.text.toString()
            var number2 = etNum2.text.toString()
            validateaddition(number1.toInt(), number2.toInt())
        }
        btnSubtraction.setOnClickListener {
            var number1 = etNum1.text.toString()
            var number2 = etNum2.text.toString()
            validatesubtraction(number1.toInt(), number2.toInt())}
        btnModulus.setOnClickListener {
            var number1 = etNum1.text.toString()
            var number2 = etNum2.text.toString()
            validatemodulus(number1.toInt(), number2.toInt())
        }
        btnDivision.setOnClickListener {
            var number1 = etNum1.text.toString()
            var number2 = etNum2.text.toString()
            validatedivision(number1.toInt(), number2.toInt())
        }
    }

    fun validateaddition(num1: Int, num2: Int) {
        var addition = num1 + num2
        tvRes.text = addition.toString()

    }

    fun validatesubtraction(num1: Int, num2: Int) {
        var subtraction = num1 - num2
        tvRes.text = subtraction.toString()
    }

    fun validatemodulus(num1: Int, num2: Int) {
        var modulus = num1 % num2
        tvRes.text = modulus.toString()
    }

    fun validatedivision(num1: Int, num2: Int) {
        var division = num1 / num2
        tvRes.text = division.toString()
    }
}


