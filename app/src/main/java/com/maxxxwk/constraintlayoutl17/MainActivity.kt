package com.maxxxwk.constraintlayoutl17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.maxxxwk.constraintlayoutl17.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupListeners()
    }

    private fun setupListeners() {
        val onClickListener = View.OnClickListener {
            it.visibility = View.GONE

        }
        binding.tvMe.setOnClickListener(onClickListener)
        binding.tvSister.setOnClickListener(onClickListener)
        binding.tvBrother.setOnClickListener(onClickListener)
        binding.tvMother.setOnClickListener(onClickListener)
        binding.tvFather.setOnClickListener(onClickListener)
        binding.tvGrandmother1.setOnClickListener(onClickListener)
        binding.tvGrandmother2.setOnClickListener(onClickListener)
        binding.tvGrandfather1.setOnClickListener(onClickListener)
        binding.tvGrandfather2.setOnClickListener(onClickListener)
        binding.tvGreatGrandmother1.setOnClickListener(onClickListener)
        binding.tvGreatGrandmother2.setOnClickListener(onClickListener)
        binding.tvGreatGrandmother3.setOnClickListener(onClickListener)
        binding.tvGreatGrandmother4.setOnClickListener(onClickListener)
        binding.tvGreatGrandfather1.setOnClickListener(onClickListener)
        binding.tvGreatGrandfather2.setOnClickListener(onClickListener)
        binding.tvGreatGrandfather3.setOnClickListener(onClickListener)
        binding.tvGreatGrandfather4.setOnClickListener(onClickListener)
    }
}