package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saySomething(view: View)= showToast(this, "hellothere")



    fun more(view: View) {
        val countString = textView.text.toString()
        var count: Int = Integer.valueOf(countString)
        count++
        textView.text = count.toString()
        if (count % 10 == 0) {
            val say = Toast.makeText(this, "WOW", Toast.LENGTH_SHORT)
            say.show()

        }

    }

    fun less(view: View) {
        val countString = textView.text.toString()
        var count: Int = Integer.valueOf(countString)
        count--
        textView.text = count.toString()
    }

    fun randomMe(view: View) {

        val randomIntent = Intent(this, SecondActivity::class.java)


        val countString = textView.text.toString()
        val count: Int = Integer.valueOf(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        if (count > 0) {
            startActivity(randomIntent)
        } else {
            Toast.makeText(this, "Нужно число больше 0", Toast.LENGTH_SHORT).show()
        }


    }
}
