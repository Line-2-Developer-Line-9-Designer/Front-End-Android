package com.heesungum.sojuton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.heesungum.sojuton.databinding.ItemDetailFirstBinding
import com.heesungum.sojuton.databinding.ItemDetailOtherBinding

class PaperDetailAdapter(private val list: List<DetailEntity>) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when (viewType) {
            0 -> FirstItemViewHolder(
                ItemDetailFirstBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> OtherItemViewHolder(
                ItemDetailOtherBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (holder) {
            is FirstItemViewHolder -> {
                holder.onBind(list[position])
            }
            is OtherItemViewHolder -> {
                holder.onBind(list[position])
            }
        }
    }

    override fun getItemViewType(position: Int) = if (position == 0) 0 else 1

    class FirstItemViewHolder(private val binding: ItemDetailFirstBinding) :
        ViewHolder(binding.root) {
        fun onBind(entity: DetailEntity) {
            binding.title.text = entity.title
            binding.author.text = entity.author
            binding.date.text = entity.date
            binding.description.text = entity.desc
            binding.heartCount.text = "이 소주편지는 현재 ${entity.heartCount}도"
            binding.count.text = "${entity.letterCount}명이 이어씀"
        }
    }

    class OtherItemViewHolder(private val binding: ItemDetailOtherBinding) :
        ViewHolder(binding.root) {
        fun onBind(entity: DetailEntity) {
            binding.title.text = entity.title
            binding.description.text = entity.desc
            binding.date.text = entity.date
        }
    }
}