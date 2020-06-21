package com.yaroshevich.rvacda.rv

import android.graphics.Rect
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.yaroshevich.rvacda.R
import com.yaroshevich.rvacda.rv.model.DataItem
import kotlinx.android.synthetic.main.item_rv.view.*


class CoolAdapter(val listener: OnLastItemListener) : RecyclerView.Adapter<CoolViewHolder>() {

    var list = listOf<DataItem>()

    fun setData(items: List<DataItem>) {
        this.list = items
        Handler().postDelayed({ notifyDataSetChanged() }, 1000)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoolViewHolder {
        return CoolViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        )
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: CoolViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun onViewAttachedToWindow(holder: CoolViewHolder) {
        super.onViewAttachedToWindow(holder)
        val layoutPosition = holder.layoutPosition
        if(layoutPosition >= list.size - 1 && layoutPosition < 100){
            listener.onLast()
        }
    }
}


class CoolViewHolder(view: View) : RecyclerView.ViewHolder(view) {


    fun bind(item: DataItem) {
        itemView.textView.text = item.name
    }


}
