package com.example.medicaladminapp.Api

data class ProductDataClassItem(
    val Product_id: Int,
    val category: String,
    val isActive: Int,
    val name: String,
    val price: Double,
    val stock: Int
)