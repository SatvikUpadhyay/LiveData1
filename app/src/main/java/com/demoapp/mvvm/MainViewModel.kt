package com.demoapp.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var St : String = "Hello"
    var LiveDataOb : MutableLiveData<String> = MutableLiveData()
    var LiveDataOb2 : MutableLiveData<Port> = MutableLiveData()

    fun emitValue(){
        LiveDataOb.value = "Hello World 1"
    }

    fun emitValue2(){
        LiveDataOb.value = "Hello World 2"
    }

    fun emitValue3(){
        LiveDataOb2.value = Port(1, "Checking!")
    }
    // Rest of the ViewModel...

}