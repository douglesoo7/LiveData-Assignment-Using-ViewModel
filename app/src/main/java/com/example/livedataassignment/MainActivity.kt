package com.example.livedataassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*button.setOnClickListener{
            dataClass.getDBNewData()
        }*/
        val viewmodel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewmodel.livedata1.observe(this,{
            count1.text = it.toString()

        })

        viewmodel.livedata2.observe(this,{
            count2.text=it.toString()
        })




        /* dataClass.getMediatorLiveData().observe(this, Observer {
             val data = it
             count2.text = data
         })*/
    }

}