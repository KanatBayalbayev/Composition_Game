package com.example.composition_game.domain.repository

import com.example.composition_game.domain.entities.GameSettings
import com.example.composition_game.domain.entities.Level
import com.example.composition_game.domain.entities.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}