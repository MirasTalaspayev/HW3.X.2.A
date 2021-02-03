package com.example.hw3x2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf

class FragmentOne : Fragment(R.layout.fragment_one) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNavigate = view.findViewById<Button>(R.id.btn_navigates)
        val edText = view.findViewById<EditText>(R.id.NameField)
        btnNavigate.setOnClickListener() {
            if (edText.text.isNullOrEmpty()) {
                Toast.makeText(view.context, "Text is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.beginTransaction().apply {
                replace(R.id.FrameFragment, FragmentTwo().apply {
                                                                arguments = bundleOf(Pair(ARG, edText.text.toString()))
                }, FragmentOne::class.java.simpleName)
                commit()
            }
        }
    }
}