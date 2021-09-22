package com.demoapp.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

//Obervable: It is something which will emit the data.
//Observer: It is something which will listen to data emitted by the obervable
//LiveData is an observable data holder class. It is lifecycle aware.

class MainActivity : AppCompatActivity() {

    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.emitValue()
        viewModel.emitValue2()
        viewModel.emitValue3()

        val LD = viewModel.LiveDataOb
        LD.observe(this, Observer{
            Toast.makeText(baseContext, it, Toast.LENGTH_LONG).show()
            Log.d("VM", it)
        })

//        viewModel.emitValue()

    }
}