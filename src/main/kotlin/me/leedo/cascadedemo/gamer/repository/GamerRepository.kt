package me.leedo.cascadedemo.gamer.repository

import me.leedo.cascadedemo.gamer.domain.Gamer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GamerRepository : CrudRepository<Gamer, Long>