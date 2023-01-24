package com.example.nutempu.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
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
        val dialog = BottomSheetDialog(this, R.style.BottomSheetDialog).apply{
            window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
        }

        val sheetBinding: AddPackageSheetBinding =
            AddPackageSheetBinding.inflate(layoutInflater, null, false)

        sheetBinding.btNewPackage.setOnClickListener {
            dialog.dismiss()
            val trackingNumber = sheetBinding.etTrackingNumber.text.toString()

            //Código abaixo sria pra fazer a requisição rest e fazer minha lista renderizar isso
        // binding.TextView.text = trackingNumber
        }

        dialog.setContentView(sheetBinding.root)
        dialog.show()
    }
}