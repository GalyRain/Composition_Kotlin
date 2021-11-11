package com.white_dragon.composition_kotlin.domain.repository

import com.white_dragon.composition_kotlin.domain.entity.GameSettings
import com.white_dragon.composition_kotlin.domain.entity.Level
import com.white_dragon.composition_kotlin.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}