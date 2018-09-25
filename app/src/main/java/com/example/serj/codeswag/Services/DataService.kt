package com.example.serj.codeswag.Services

import com.example.serj.codeswag.Model.Category
import com.example.serj.codeswag.Model.Product


//Creating  a sigleton
object DataService {

//    creating  aray Category

    val category = listOf(
//   need  to add the resourse  the images  that  will apear on the front Item
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    //creating  the hats
    val hats = listOf(
            Product("Devlopes Graphic Benies", "$18", "hat1"),
            Product("Devlopes Hat Black", "$20", "hat2"),
            Product("Devlopes Hat White", "$22", "hat3"),
            Product("Devlopes Hat Snapback", "$32", "hat4")
    )
    // creating  the hoodies
    val hoodies = listOf(
            Product("Devlopes Hoodied Grey", "$18", "hoodie1"),
            Product("Devlopes  Hoodied  Red", "$20", "hoodie2"),
            Product("Devlopes Hoodied Grey ", "$22", "hoodie3"),
            Product("Devlopes Blck Hoodie ", "$32", "hoodie4")
    )
    // creating  the shirts
    val shirts = listOf(
            Product("Devlopes Shirt Black", "$18", "shirt1"),
            Product("Devlopes   Bandge Light Geay", "$20", "shirt2"),
            Product("Devlopes Logo Shirt Red ", "$22", "shirt3"),
            Product("Devlopes Hustle ", "$32", "shirt4")
    )

}