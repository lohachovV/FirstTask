package com.example.firsttask.mainScreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firsttask.R
import com.example.firsttask.mainScreen.objectsForDickList.Dick

class DickItemAdapter(private val dickHeaders: List<Dick>) :
    RecyclerView.Adapter<DickItemAdapter.DickHolder>() {

    class DickHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val headerOfDick: TextView = item.findViewById(R.id.HeaderOfDick)
        private val subtitleOfDick: TextView = item.findViewById(R.id.SubtitleOfDick)
        private val buttonEdit: Button = item.findViewById(R.id.buttonEdit)

        fun onBind(headerOfDick: String, subtitleOfDick: String) {
            this.headerOfDick.text = headerOfDick
            this.subtitleOfDick.text = subtitleOfDick
            this.buttonEdit.setOnClickListener {
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DickHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.dick_item, parent, false)
        return DickHolder(itemView)
    }

    override fun onBindViewHolder(holder: DickHolder, position: Int) {
        holder.onBind(
            dickHeaders[position].headerOfDick,
            dickHeaders[position].subtitleOfDick,
        )
    }

    override fun getItemCount(): Int {
        return dickHeaders.size
    }
}