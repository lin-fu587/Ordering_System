package com.example.lab04_kt
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            startActivityForResult(Intent (this, MainActivity2::class.java),1)
        }
    }
    override fun onActivityResult( requestCode:Int, resultCode:Int,data:Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(data==null) return
        if(requestCode==1){
            if(resultCode==101){
                var b = data.getExtras()!!
                val str1 = b.getString("drink")
                val str2 = b.getString("sugar")
                val str3 = b.getString("ice")
                val tv_meal = findViewById<TextView>(R.id.textView3);
                tv_meal.setText(String.format("飲料: %s\n\n甜度: %s\n\n冰塊: %s\n\n",str1,str2,str3))
            }
        }
    }
}