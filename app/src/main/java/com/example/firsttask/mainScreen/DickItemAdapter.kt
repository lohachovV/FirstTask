package com.example.firsttask.mainScreen

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.R

class DickItemAdapter (private val dickHeaders : List<String>) : RecyclerView.Adapter<DickItemAdapter.DickHolder>{


    class DickHolder (item: View) : RecyclerView.ViewHolder(item){
        var headerOfDick: TextView? = null
        var subtitleOfDick: TextView? = null

        init {
            headerOfDick = item.findViewById(R.id.HeaderOfDick)
            subtitleOfDick = item.findViewById(R.id.SubtitleOfDick)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DickHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DickHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return dickHeaders.size
    }
}