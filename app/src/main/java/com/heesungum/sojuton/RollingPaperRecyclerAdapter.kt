package com.heesungum.sojuton

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.heesungum.sojuton.databinding.ItemRollingPaperBinding

class RollingPaperRecyclerAdapter(
    private val list: List<RollingPaperEntity>,
    private val onItemClick: () -> Unit,
) :
    RecyclerView.Adapter<RollingPaperRecyclerAdapter.ItemViewHolder>() {

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            ItemRollingPaperBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    class ItemViewHolder(
        private val binding: ItemRollingPaperBinding,
        private val onItemClick: () -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                onItemClick.invoke()
            }
        }

        fun onBind(entity: RollingPaperEntity) {
            binding.title.text = entity.title

            @ColorInt
            val cardColor = when (adapterPosition % 4) {
                0 -> Color.parseColor("#2D79E9")
                1 -> Color.parseColor("#E9B749")
                2 -> Color.parseColor("#84D396")
                3 -> Color.parseColor("#E5895A")
                else -> Color.parseColor("#2D79E9")
            }
            binding.card.setCardBackgroundColor(cardColor)
        }
    }
}