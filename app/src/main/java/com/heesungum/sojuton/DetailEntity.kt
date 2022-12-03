package com.heesungum.sojuton

data class DetailEntity(
    val title: String,
    val author: String = "",
    val letterCount: Int = 0,
    val desc: String,
    var heartCount: Int = 0,
    val date: String
) {

}
