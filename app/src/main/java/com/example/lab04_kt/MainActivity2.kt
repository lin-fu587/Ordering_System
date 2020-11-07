package com.example.lab04_kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup

import kotlin.Int

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var sugar ="無糖"
        var ice ="去冰"

        val rg1 =findViewById<RadioGroup>(R.id.radioGroup)
        rg1.setOnCheckedChangeListener { radioGroup: RadioGroup, i: Int ->
            when(i){
                R.id.radioButton9-> {
                    sugar = "無糖"
                }
                R.id.radioButton11-> {
                    sugar = "少糖"
                }
                R.id.radioButton12-> {
                    sugar = "半糖"
                }
                R.id.radioButton13-> {
                    sugar = "全糖"
                }
            }
        }
        val rg2 =findViewById<RadioGroup>(R.id.radioGroup2)
        rg2.setOnCheckedChangeListener { radioGroup: RadioGroup, i: Int ->
            when(i){
                R.id.radioButton16-> {
                    ice = "微冰"
                }
                R.id.radioButton17-> {
                    ice = "少冰"
                }
                R.id.radioButton18-> {
                    ice = "正常冰"
                }
            }
        }
        val send_btn =findViewById<Button>(R.id.button2)
        send_btn.setOnClickListener {
                val set_drink =findViewById<EditText>(R.id.editTextTextPersonName)
                val drink =set_drink.getText().toString()
                val i =Intent()
                val b =Bundle()
                b.putString("sugar",sugar)
                b.putString("drink",drink)
                b.putString("ice",ice)
                i.putExtras(b)
                setResult(101,i)
                finish()
        }
    }
}