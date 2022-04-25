package com.pdpacademy.android_findview.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import com.pdpacademy.android_findview.R


import kotlinx.android.synthetic.main.activity_kotlinsynthetics.*

class KotlinSyntheticsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinsynthetics)
        initViews()
    }

    private fun initViews() {
        b_synthetics.setOnClickListener {
            tv_synthetics.text = "Kotlin Synthetics"
        }
    }
}