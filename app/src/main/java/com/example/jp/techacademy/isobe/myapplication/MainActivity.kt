package com.example.jp.techacademy.isobe.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }


    override fun onClick(v: View) {
        val a=0
        val b=0
        if(a==null && b==null){
            val snackbar = Snackbar.make(v , "何か値を入力してください" , Snackbar.LENGTH_LONG)
            snackbar.show()
        }
        when (v.id) {
            R.id.button1 -> add()
            R.id.button3 -> sub()
            R.id.button2 -> mul()
            R.id.button4 -> div()
        }
    }

    private fun add() {
        val intent = Intent(this, SecondActivity::class.java)

        val a = editText.text.toString().toDouble()
        val b = editText2.text.toString().toDouble()

        intent.putExtra("VALUE1", a + b)
        startActivity(intent)
    }

    private fun sub() {
        val intent = Intent(this, SecondActivity::class.java)

        val c = editText.text.toString().toDouble()
        val d = editText2.text.toString().toDouble()
        intent.putExtra("VALUE1", c - d)
        startActivity(intent)

    }

    private fun mul() {
        val intent = Intent(this, SecondActivity::class.java)
        val i = editText.text.toString().toDouble()
        val f = editText2.text.toString().toDouble()
        intent.putExtra("VALUE1", i * f)

        startActivity(intent)

    }

    private fun div() {
        val intent = Intent(this, SecondActivity::class.java)
        val g = editText.text.toString().toDouble()
        val h = editText2.text.toString().toDouble()
        intent.putExtra("VALUE1", g / h)

        startActivity(intent)
    }
}






