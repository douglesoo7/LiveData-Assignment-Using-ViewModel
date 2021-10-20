package com.example.livedataassignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val data1: MutableLiveData<Int> = MutableLiveData<Int>()
    private val data2: MutableLiveData<Int> = MutableLiveData<Int>()

    init {
        data1.value = 0
        data2.value = 0
    }

    val livedata1: LiveData<Int> = data1
    val livedata2: LiveData<Int> = data2
    fun incrementValue1() {
        data1.value = data1.value!! + 1;
    }

    fun incrementValue2() {
        data2.value = data2.value!! + 1;
    }


}