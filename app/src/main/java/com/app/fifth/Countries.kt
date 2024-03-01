package com.app.fifth

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.fifth.R
import com.app.fifth.databinding.ActivityCountriesBinding
import com.app.fifth.databinding.ActivitySplashBinding
import com.google.android.material.appbar.AppBarLayout

class Countries : AppCompatActivity() {
    private lateinit var mBinding:ActivityCountriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityCountriesBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        val arrayAdapter: ArrayAdapter<*>
        val countries = arrayOf("Pakistan", "Afghanistan", "United Kingdom", "United States", "India", "United Arab Emirates", "Kingdom Saudi Arabia")
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, countries)
        mBinding.listCountries.adapter = arrayAdapter
    }
}