package com.example.var1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun goToProgram (view: View) {
        setContentView(R.layout.activity_program)
    }

    public fun goToInformation (view: View) {
        setContentView(R.layout.activity_information)
    }

    public fun goToTickets (view: View) {
        setContentView(R.layout.activity_tickets)
    }

}