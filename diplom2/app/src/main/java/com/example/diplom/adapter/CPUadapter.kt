package com.example.diplom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.diplom.R
import com.example.diplom.databinding.ItemCpuBinding
import com.example.diplom.model.CPU

interface OnItemClick {
    fun onClick(userId: Int)
}

class CPUadapter(private val onItemClick: OnItemClick) :
    ListAdapter<CPU, CPUadapter.ProfileHolder>(object : DiffUtil.ItemCallback<CPU>() {
        override fun areItemsTheSame(
            oldItem: CPU,
            newItem: CPU
        ): Boolean = oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: CPU,
            newItem: CPU
        ): Boolean = oldItem == newItem
    }) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileHolder {
        return ProfileHolder(ItemCpuBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ProfileHolder, position: Int) {
        holder.bind(getItem(position), holder.itemView.context)
    }

    inner class ProfileHolder(binding: ItemCpuBinding) : RecyclerView.ViewHolder(binding.root) {
        private val nameTextView: TextView = binding.
//        private val onlineStatusTextView: TextView = binding.
//        private val profileImageView: ImageView = binding.

        fun bind(item: CPU, context: Context) {
            nameTextView.text = item.cpuBrand
   //         onlineStatusTextView.text = item.cpuCashMemory
            Glide.with(context)
                .load(item.cpuImage)
                .error(R.drawable.ic_launcher_background)
                .into(ima)
            itemView.setOnClickListener {
                onItemClick.onClick(item.id)
            }
        }
    }
}