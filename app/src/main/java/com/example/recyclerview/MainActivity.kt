package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.row_name_item.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNames.layoutManager = LinearLayoutManager(baseContext)

        val namesAdapter = NamesRecyclerViewAdapter(listOf("sharon" ,"eshe" ,"becky" ,"kamala" ,"shirley" ,"sharifah" ,"holly" ,"shillah","ashley"))

        rvNames.adapter = namesAdapter
    }
}