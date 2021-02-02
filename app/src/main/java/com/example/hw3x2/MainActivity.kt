package com.example.hw3x2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val ARG = "Text"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameFragment, FragmentOne())
            addToBackStack(null)
            commit()
        }
    }
}