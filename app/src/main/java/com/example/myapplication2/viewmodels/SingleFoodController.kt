package com.example.myapplication2.viewmodels

import com.airbnb.epoxy.EpoxyController
import com.example.myapplication2.models.Food
import com.example.myapplication2.models.FoodDataFactory
import com.example.myapplication2.models.SingleFoodModel_

class SingleFoodController : EpoxyController() {

    var foodItems : List<Food> = FoodDataFactory.getFoodItems(50)

    override fun buildModels() {
        var i:Long =0
        foodItems.forEach {food ->
            SingleFoodModel_()
                .id(i++)
                .image(food.image)
                .title(food.title)
                .addTo(this)
        }

    }
}