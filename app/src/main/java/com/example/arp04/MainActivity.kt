package com.example.arp04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() { //another comment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentConteiner, FragmentFirst())
            .commit()

        buttonFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentConteiner, FragmentFirst())
                .commit()
        }

        buttonFragment2.setOnClickListener{     //some comment to git
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentConteiner, FragmentSecond())
                .commit()
        }
    }
}