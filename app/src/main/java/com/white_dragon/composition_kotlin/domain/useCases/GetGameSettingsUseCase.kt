package com.white_dragon.composition_kotlin.domain.useCases

import com.white_dragon.composition_kotlin.domain.entity.GameSettings
import com.white_dragon.composition_kotlin.domain.entity.Level
import com.white_dragon.composition_kotlin.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}