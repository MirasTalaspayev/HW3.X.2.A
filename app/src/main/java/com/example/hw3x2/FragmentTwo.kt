package com.example.hw3x2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FragmentTwo : Fragment(R.layout.fragment_two) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val s: String
        arguments.let {
            s = it?.getString(ARG).toString()
        }

        view.findViewById<Button>(R.id.show_messages).setOnClickListener() {
            Toast.makeText(view.context, "Text from FragmentOne: $s", Toast.LENGTH_SHORT).show()
        }
    }
}