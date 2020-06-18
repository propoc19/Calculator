package dev.propoc.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var totalDigits = ""
    var digits = ""
    var temp = ""
    var operacion = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        uno_btn.setOnClickListener(this)
        dos_btn.setOnClickListener(this)
        tres_btn.setOnClickListener(this)
        cuatro_btn.setOnClickListener(this)
        cinco_btn.setOnClickListener(this)
        seis_btn.setOnClickListener(this)
        siete_btn.setOnClickListener(this)
        ocho_btn.setOnClickListener(this)
        nueve_btn.setOnClickListener(this)
        cero_btn.setOnClickListener(this)
        suma_btn.setOnClickListener(this)
        resta_btn.setOnClickListener(this)
        igual_btn.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.getId()){
            R.id.uno_btn -> {
                digits += "1"
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.dos_btn -> {
                digits += "2"
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.tres_btn -> {
                digits += "3"
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.cuatro_btn -> {
                digits += 4
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.cinco_btn -> {
                digits += 5
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.seis_btn -> {
                digits += 6
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.siete_btn -> {
                digits += 7
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.ocho_btn -> {
                digits += 8
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.nueve_btn -> {
                digits += 9
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.cero_btn -> {
                digits += 0
                totalDigits = digits
                digital_screen.text = digits
                digits_screen.text = totalDigits
            }
            R.id.suma_btn -> {
                digits_screen.text = totalDigits + "+"
                temp = digits
                digits = ""
                digital_screen.text = "0"
                operacion = true
            }
            R.id.resta_btn -> {
                digits_screen.text = totalDigits + "-"
                temp = digits
                digits = ""
                digital_screen.text = "0"
                operacion = false
            }
            R.id.igual_btn -> {
                if(operacion){
                    digital_screen.text = suma(temp, digits)
                }else{
                    digital_screen.text = resta(temp, digits)
                }
            }
        }
    }

    fun suma(a:String, b:String): String{
        var suma = a.toInt() + b.toInt()
        digits = suma.toString()
        return suma.toString()
    }

    fun resta(a:String, b:String): String{
        var resta = a.toInt() - b.toInt()
        digits = resta.toString()
        return resta.toString()
    }
}
