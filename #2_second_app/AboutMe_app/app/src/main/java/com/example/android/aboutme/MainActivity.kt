package com.example.android.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
//import android.view.inputmethod.InputMethodManager
//import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var context = this

    lateinit var binding: ActivityMainBinding

    var myName: MyName = MyName("Hashem Alkeshawi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.name = myName
//        findViewById<Button>(R.id.done_button).setOnClickListener{
//            addNickname(it)
//
//        }
        binding.doneButton.setOnClickListener { addNickname() }

    }
    private fun addNickname(){
        binding.apply {
            myName?.nickName = binding.nickNameEdit.text.toString()
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
            nickNameEdit.visibility = View.GONE
            invalidateAll()
        }

//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//            imm.hideSoftInputFromWindow, 0)
    }
}