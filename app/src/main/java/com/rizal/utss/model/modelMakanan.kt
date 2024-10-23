package com.rizal.utss.model

import com.rizal.utss.R

data class modelMakanan(
    val gambar : Int,
    val judul : String,
    val keterangan : String
)

object MockList{
    fun getModel() : List<modelMakanan>{
        val itemModel1 =modelMakanan(
            R.drawable.makanan00,
            "Chicken Curry",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemModel2 =modelMakanan(
            R.drawable.makanan01,
            "Chicken Burger",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemModel3 =modelMakanan(
            R.drawable.makanan02,
            "Broccoli Lasagna",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemModel4 =modelMakanan(
            R.drawable.makanan03,
            "Mexican Appetizer",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemModel5 =modelMakanan(
            R.drawable.makanan04,
            "Baked Chicken Wings",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemModel6 =modelMakanan(
            R.drawable.makanan05,
            "Sweet Milkshake",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemList : ArrayList<modelMakanan>  = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}
