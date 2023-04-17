package com.example.hellowrold

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.third_layout.*

class thirdActivity : AppCompatActivity() {
    private val tag="20212005364,ThirdActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)

        startFirstActivity.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    @SuppressLint("LongLogTag")
    override fun onStart(){
        super.onStart()
        Log.d(tag,"onStart,Task id is $taskId")
    }

    @SuppressLint("LongLogTag")
    override fun onResume(){
        super.onResume()
        Log.d(tag,"onResume,Task id is $taskId")
    }

    @SuppressLint("LongLogTag")
    override fun onPause() {
        super.onPause()
        Log.d(tag,"onPause,Task id is $taskId")
    }

    @SuppressLint("LongLogTag")
    override fun onStop() {
        super.onStop()
        Log.d(tag,"onStop,Task id is $taskId")
    }

    @SuppressLint("LongLogTag")
    override fun onRestart(){
        super.onRestart()
        Log.d(tag,"onRestart,Task id is $taskId")
    }

    @SuppressLint("LongLogTag")
    override fun onDestroy(){
        super.onDestroy()
        Log.d(tag,"onDestroy,Task id is $taskId")
    }
}