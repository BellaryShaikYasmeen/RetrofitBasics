package com.example.retrofitbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quotesAPI=RetrofitHelper.getInstance().create(QuotesAPI::class.java)
        GlobalScope.launch {
            val result=quotesAPI.getQuotes()
            if(result!=null)
            {
                Log.d("yasmeen ",result.body().toString())

            }
        }
    }
}