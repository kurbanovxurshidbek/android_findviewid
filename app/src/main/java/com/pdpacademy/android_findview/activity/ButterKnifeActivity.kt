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


class ButterKnifeActivity : AppCompatActivity() {
    @BindView(R.id.b_butter) lateinit var b_butter: Button
    @BindView(R.id.tv_butter) lateinit var tv_butter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butterknife)
        ButterKnife.bind(this)
        initViews()
    }

    private fun initViews() {
        b_butter.setOnClickListener {
            tv_butter.text = "Butter Knife"
        }
    }
}