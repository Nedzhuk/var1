package com.example.var1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class information : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

//        val ggou = findViewById<TextView>(R.id.ggou)
//
//        val contentText = "фестиваля музыки,  проходит на природе в живописном месте под открытым небом в течение 3 ночей — с <font color=>пятницы по воскресенье</font>, где каждый участник фестиваля не просто увидит культовые и интересные картины, а еще и насладится неповторимой атмосферой."
//        val what = SpannableString(contentText)
//
//        val colorBlue = ForegroundColorSpan(Color.rgb(0, 71, 255))
//
//        what.setSpan(colorBlue, 99,111, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
//
//        ggou.text=what
    }

    public fun goToProgram (view: View) {
        setContentView(R.layout.activity_program)
    }


    public fun goToTickets (view: View) {
        setContentView(R.layout.activity_tickets)
    }
}