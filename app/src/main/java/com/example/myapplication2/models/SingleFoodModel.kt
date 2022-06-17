package com.example.myapplication2.models

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.*
import com.example.myapplication2.R


@SuppressLint("NonConstantResourceId")
@EpoxyModelClass(layout = R.layout.singlefood)
abstract class SingleFoodModel: EpoxyModelWithHolder<SingleFoodModel.FoodHolder>() {

    @EpoxyAttribute
    @DrawableRes
    var image : Int = 0

    @EpoxyAttribute
    var title:String? = ""

    @EpoxyAttribute
    var desc:String? = ""

    override fun bind(holder: FoodHolder) {
        holder.imageView.setImageResource(image)
        holder.titleView.text = title
       // holder.descView.text = desc
    }


    inner class FoodHolder : EpoxyHolder(){

        lateinit var imageView: ImageView
        lateinit var titleView: TextView
        lateinit var descView:TextView

        override fun bindView(itemView: View?) {
            imageView = itemView?.findViewById<ImageView>(R.id.imageView)!!
            titleView = itemView.findViewById<TextView>(R.id.mainDish)!!
            descView = itemView.findViewById<TextView>(R.id.descText)!!
        }

    }
}