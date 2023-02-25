package com.example.menunijneebymeeeeeeeeemaariiiooooooooo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.menunijneebymeeeeeeeeemaariiiooooooooo.databinding.ActivityMainBinding

lateinit var  bind : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.bottomnavview.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "Open", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 -> {
                    Toast.makeText(this, "Lock", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 -> {
                    Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
        bind.bottomnavview.setOnItemReselectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "Re Open", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "Re Save", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 -> {
                    Toast.makeText(this, "Re Lock", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 -> {
                    Toast.makeText(this, "Re Search", Toast.LENGTH_SHORT).show()
                } //aboba
            }
            true
        }
    }
}
