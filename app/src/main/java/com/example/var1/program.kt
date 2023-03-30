package com.example.var1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class program : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program)
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