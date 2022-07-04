package me.leedo.cascadedemo.gameteam.repository

import me.leedo.cascadedemo.gameteam.domain.GameTeam
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GameTeamRepository : CrudRepository<GameTeam, Long>