package com.example.nutempu.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nutempu.R
import com.example.nutempu.databinding.ActivityMainBinding
import com.example.nutempu.databinding.AddPackageSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNewPackage.setOnClickListener {
            showBtnSheetDialog()
        }

    }

    private fun showBtnSheetDialog() {
        val dialog = BottomSheetDialog(this, R.style.BottomSheetDialog)

        val sheetBinding: AddPackageSheetBinding =
            AddPackageSheetBinding.inflate(layoutInflater, null, false)

        dialog.setContentView(sheetBinding.root)
        dialog.show()
    }
}