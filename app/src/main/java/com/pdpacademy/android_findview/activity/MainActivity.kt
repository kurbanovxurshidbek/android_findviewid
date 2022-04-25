package com.pdpacademy.android_findview.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.pdpacademy.android_findview.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val b_butterknife = findViewById<Button>(R.id.b_butterknife)
        val b_kotlin_synthetics = findViewById<Button>(R.id.b_kotlin_synthetics)
        val b_view_binding = findViewById<Button>(R.id.b_view_binding)

        b_butterknife.setOnClickListener {
            callButterKnifeActivity()
        }
        b_kotlin_synthetics.setOnClickListener {
            callKotlinSyntheticsActivity()
        }
        b_view_binding.setOnClickListener {
            callViewBindingActivity()
        }
    }

    private fun callViewBindingActivity() {
        val intent = Intent(this, ViewBindingActivity::class.java)
        startActivity(intent)
    }

    private fun callKotlinSyntheticsActivity() {
        val intent = Intent(this, KotlinSyntheticsActivity::class.java)
        startActivity(intent)
    }

    private fun callButterKnifeActivity() {
        val intent = Intent(this, ButterKnifeActivity::class.java)
        startActivity(intent)
    }
}