package com.example.hellowrold

import android.annotation.SuppressLint
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val tag="20212005364,firstActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startSecondActivity.setOnClickListener{
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        startFirstActivity.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            intent.setFlags(FLAG_ACTIVITY_CLEAR_TOP)
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