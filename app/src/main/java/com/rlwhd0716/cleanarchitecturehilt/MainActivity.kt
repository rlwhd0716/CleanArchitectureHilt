package com.rlwhd0716.cleanarchitecturehilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rlwhd0716.cleanarchitecturehilt.lib.TestObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestObject.showToast(this@MainActivity, "Test")
    }
}