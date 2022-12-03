package com.heesungum.sojuton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.heesungum.sojuton.databinding.ItemRollingPaperBinding

class RollingPaperRecyclerAdapter(private val list: List<RollingPaperEntity>) :
    RecyclerView.Adapter<RollingPaperRecyclerAdapter.ItemViewHolder>() {

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            ItemRollingPaperBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    class ItemViewHolder(private val binding: ItemRollingPaperBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(entity: RollingPaperEntity) {
            binding.title.text = entity.title
            binding.description.text = entity.desc
        }
    }
}