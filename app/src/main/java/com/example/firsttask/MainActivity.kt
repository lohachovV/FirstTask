package com.example.firsttask

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.mainScreen.DickItemAdapter
import com.example.firsttask.mainScreen.objectsForDickList.ItemsForApp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.addItemDecoration(ItemDec(applicationContext))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DickItemAdapter(ItemsForApp.listOfDicks)
    }

    class ItemDec (context: Context): RecyclerView.ItemDecoration(){
        val paint = Paint().apply { color = ContextCompat.getColor(context, R.color.black) }
        override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
            c.save()
            val itemsCount = parent.childCount
            for (index in 0 until itemsCount) {
                val child = parent.getChildAt(index)
//                c.drawLine(
//                    child.left.toFloat(),
//                    child.bottom.toFloat(),
//                    child.right.toFloat(),
//                    child.bottom.toFloat(),
//                    paint
//                    )
                c.drawRect(Rect().apply {
                    top = child.top
                    bottom = child.bottom
                    right = child.right
                    left = child.left
                }, paint.apply {
                    style = Paint.Style.STROKE
                })
            }
            c.restore()
        }

        override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
            outRect.bottom = 5
        }
    }
}

