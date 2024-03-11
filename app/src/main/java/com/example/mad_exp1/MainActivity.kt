package com.example.mad_exp1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout:LinearLayout=findViewById(R.id.layout)
        val tv1:TextView =findViewById(R.id.tv)
        val btn1:Button =findViewById(R.id.btn1)
        val btn2:Button=findViewById(R.id.btn2)
        val btn3:Button=findViewById(R.id.btn3)
        var size:Float=10f
        var x:Int=0
        var y:Int=0
        //change1

        btn1.setOnClickListener {
            tv1.setTextSize(size)
            size=(size+5)%50
        }
        btn2.setOnClickListener {
            when(x%3){
                0->tv1.setTextColor(Color.RED)
                1->tv1.setTextColor(Color.MAGENTA)
                2->tv1.setTextColor(Color.BLACK)
            }
            x=x+1
        }
        btn3.setOnClickListener {
            when(y%3){
                0->layout.setBackgroundColor(Color.YELLOW)
                1->layout.setBackgroundColor(Color.CYAN)
                2->layout.setBackgroundColor(Color.GREEN)
            }
            y=y+1
        }
    }
}
