package com.example.tripbogor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TourAdapter (private val tourList: ArrayList<Tour>, val listener: (Tour) -> Unit)
    : RecyclerView.Adapter<TourAdapter.TourViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return TourViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
        holder.bindView(tourList[position],listener)

        val currentItem = tourList[position]
        holder.imageView.setImageResource(currentItem.imageTour)
        holder.titleTour.text = currentItem.titleTour
        holder.descTour.text = currentItem.descTour
        itemCount
    }

    override fun getItemCount(): Int {
        return tourList.size
    }

    class TourViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.iv_img)
        val titleTour : TextView = itemView.findViewById(R.id.tv_title)
        val descTour : TextView = itemView.findViewById(R.id.tv_desc)

        fun bindView (Tour: Tour, listener: (Tour) -> Unit) {
            imageView.setImageResource(Tour.imageTour)
            titleTour.text = Tour.titleTour
            descTour.text =Tour.descTour
            itemView.setOnClickListener {
                listener(Tour)
            }
        }
    }
}