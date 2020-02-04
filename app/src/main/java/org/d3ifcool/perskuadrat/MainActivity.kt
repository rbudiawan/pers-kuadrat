package org.d3ifcool.perskuadrat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.d3ifcool.perskuadrat.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.bHitung.setOnClickListener {
            val a = binding.etA.text.toString().toDouble()
            val b = binding.etB.text.toString().toDouble()
            val c = binding.etC.text.toString().toDouble()

            val x1 = (-b+ sqrt(b*b-4*a*c))/2*a
            val x2 = (-b- sqrt(b*b-4*a*c))/2*a

            binding.tvHasil.text = getString(R.string.hasil,x1.toString(),x2.toString())
        }
    }
}
