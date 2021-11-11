package com.white_dragon.composition_kotlin.domain.useCases

import com.white_dragon.composition_kotlin.domain.entity.Question
import com.white_dragon.composition_kotlin.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {

        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {

        private const val COUNT_OF_OPTIONS = 6
    }
}