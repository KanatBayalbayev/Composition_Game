package com.example.composition_game.domain.usecases

import com.example.composition_game.domain.entities.GameSettings
import com.example.composition_game.domain.entities.Level
import com.example.composition_game.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}