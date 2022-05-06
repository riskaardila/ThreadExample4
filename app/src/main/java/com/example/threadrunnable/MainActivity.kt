package com.example.threadrunnable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            doAsync {
                for (i in 1..15) {
                    Thread.sleep(2000)
                    activityUiThread {
                        textView.text = i.toString()
                    }
                }
            }
        }
    }
}