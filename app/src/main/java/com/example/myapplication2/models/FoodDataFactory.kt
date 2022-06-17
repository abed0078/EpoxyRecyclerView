package com.example.myapplication2.models

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import com.example.myapplication2.R
import java.util.*

object FoodDataFactory{

    //region Random Data Generators
    private val random = Random()

    private val titles = arrayListOf<String>("Nachos", "Fries", "Cheese Balls", "Pizza")

    private fun randomTitle() : String {
        val title = random.nextInt(4)
        return titles[title]
    }

    private fun randomPicture() : Int{
        val grid = random.nextInt(7)

        return when(grid) {
            0 -> R.drawable.nachos1
            1 -> R.drawable.nachos2
            2 -> R.drawable.nachos3
            3 -> R.drawable.nachos4
            4 -> R.drawable.nachos5
            5 -> R.drawable.nachos6
            6 -> R.drawable.nachos7
            else -> R.drawable.nachos8
        }
    }
    //endregion

    @SuppressLint("SupportAnnotationUsage")
    fun getFoodItems(count:Int) : List<Food>{
        var foodItems = mutableListOf<Food>()
        repeat(count){
            val image = randomPicture()
            val title = randomTitle()
            @StringRes val desc = "this is originated in some\n" +
                    "        country that know how to cook\n" +
                    "    fries"
            foodItems.add(Food(image,title,desc))
        }
        return foodItems
    }
}