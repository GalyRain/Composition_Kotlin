package com.white_dragon.composition_kotlin.domain.entity

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
) {

    val rightAnswer: Int
        get() = sum - visibleNumber
}