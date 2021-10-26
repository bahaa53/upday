package com.task.updayTask.presentation.imagesStory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task.updayTask.databinding.ItemImageLayoutBinding
import com.task.updayTask.databinding.ProgressLoadingBinding
import com.task.updayTask.domain.entities.imagesResponse.Data
import javax.inject.Inject

private const val VIEW_TYPE_ITEM = 0
private const val VIEW_TYPE_LOADING = 1

class ImagesAdapter @Inject constructor() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var itemsCells = ArrayList<Data?>()

    class ItemViewHolder(val binding: ItemImageLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    class LoadingViewHolder(val binding: ProgressLoadingBinding) :
        RecyclerView.ViewHolder(binding.root)

    fun addData(dataViews: ArrayList<Data>) {
        this.itemsCells.addAll(dataViews)
        notifyDataSetChanged()
    }

    fun addLoadingView() {
        //add loading item
        itemsCells.add(null)
        notifyItemInserted(itemsCells.size - 1)
    }

    fun removeLoadingView() {
        //Remove loading item
        if (itemsCells.size != 0) {
            itemsCells.removeAt(itemsCells.size - 1)
            notifyItemRemoved(itemsCells.size)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_ITEM) {
            val binding =
                ItemImageLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ItemViewHolder(binding)
        } else {
            val binding =
                ProgressLoadingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return LoadingViewHolder(binding)
        }
    }

    override fun getItemCount(): Int {
        return itemsCells.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (itemsCells[position] == null) {
            VIEW_TYPE_LOADING
        } else {
            VIEW_TYPE_ITEM
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder.itemViewType == VIEW_TYPE_ITEM) {
            val data = itemsCells[position]
            bindItemViewHolder((holder as ItemViewHolder), data)
        } else if (holder.itemViewType == VIEW_TYPE_LOADING) {
            bindProgressViewHolder((holder as LoadingViewHolder))
        }
    }

}