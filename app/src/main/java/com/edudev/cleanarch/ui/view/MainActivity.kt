package com.edudev.cleanarch.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.edudev.cleanarch.data.model.sanitized
import com.edudev.cleanarch.databinding.ActivityMainBinding
import com.edudev.cleanarch.ui.viewmodel.ChuckQuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val chuckQuoteViewModel: ChuckQuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        chuckQuoteViewModel.getRandomChuckQuote()
        binding.rootMain.setOnClickListener {
            chuckQuoteViewModel.getRandomChuckQuote()
        }

        chuckQuoteViewModel.chuckQuote.observe(this) { quote ->
            quote?.let {
                binding.tvChuckQuote.text = it.sanitized()
            }
        }
    }
}