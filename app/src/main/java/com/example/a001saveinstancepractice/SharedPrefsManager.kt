package com.example.a001saveinstancepractice

import android.content.Context
import android.content.SharedPreferences

class SharedPrefsManager(context: Context) {

    companion object{
        private const val PREFS_NAME = "MyPrefs"
        private const val COUNT_KEY = "countKey"
    }

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun saveCount(count: Int){
        val editor = sharedPreferences.edit()
        editor.putInt(COUNT_KEY, count)
        editor.apply()
    }

    fun loadCount(): Int{
        return sharedPreferences.getInt(COUNT_KEY, 0)
    }
}