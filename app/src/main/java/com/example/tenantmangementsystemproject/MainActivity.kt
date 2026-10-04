package com.example.tenantmangementsystemproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tenantmangementsystemproject.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString().trim()
            val phone = binding.phoneEditText.text.toString().trim()
            val rent = binding.rentEditText.text.toString().trim()

            val tenant = Tenant(
                name = name,
                phone = phone,
                rent = rent
            )

            binding.tenant = tenant
        }
    }
}
