package com.example.firsttask.mainScreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.R
import com.example.firsttask.mainScreen.ObjectsForDickList.Dick

class DickItemAdapter (private val dickHeaders : List<Dick>) :
    RecyclerView.Adapter<DickItemAdapter.DickHolder>() {


    class DickHolder (item: View) : RecyclerView.ViewHolder(item){
        var headerOfDick: TextView? = null
        var subtitleOfDick: TextView? = null

        init {
            headerOfDick = item.findViewById(R.id.HeaderOfDick)
            subtitleOfDick = item.findViewById(R.id.SubtitleOfDick)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DickHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.dick_item, parent, false)
        return DickHolder(itemView)
    }

    /** I can't understand how send the fields */
    override fun onBindViewHolder(holder: DickHolder, position: Int) {
        holder.headerOfDick?.text = dickHeaders[position].headerOfDick
    }

    override fun getItemCount(): Int {
        return dickHeaders.size
    }
}