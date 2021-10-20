package com.example.livedataassignment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment(R.layout.fragment_first) {

     private val dataClass=DataClass()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewmodel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        view.button1.setOnClickListener{
            viewmodel.incrementValue1()
            //Log.d("Sachin","button 1 click")
        }
    }
}