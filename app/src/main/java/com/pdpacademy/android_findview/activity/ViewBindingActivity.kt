package com.pdpacademy.android_findview.activity

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.pdpacademy.android_findview.R
import com.pdpacademy.android_findview.databinding.ActivityViewbindingBinding

class ViewBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewbindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewbindingBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.bViewbinding.setOnClickListener {
            binding.tvViewbinding.text = "View Binding"
        }
    }
}