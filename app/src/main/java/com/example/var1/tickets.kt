package com.example.var1

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tickets : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tickets)
    }

    public fun goToProgram (view: View) {
        setContentView(R.layout.activity_program)
    }

    public fun goToInformation (view: View) {
        setContentView(R.layout.activity_information)
    }

}