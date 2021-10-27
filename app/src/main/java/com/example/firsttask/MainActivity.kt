package com.example.firsttask

import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.mainScreen.DickItemAdapter
import com.example.firsttask.mainScreen.objectsForDickList.ItemsForApp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.addItemDecoration()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DickItemAdapter(ItemsForApp.listOfDicks)
    }

    class ItemDec: RecyclerView.ItemDecoration(){
        override fun onDraw(c: Canvas, parent: RecyclerView) {
            super.onDraw(c, parent)
        }
    }
}