package me.leedo.cascadedemo.gameteam.domain

import me.leedo.cascadedemo.gamer.domain.Gamer
import me.leedo.cascadedemo.gameteam.repository.GameTeamRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
internal class GameTeamTest {

    @Autowired
    private lateinit var gameTeamRepository: GameTeamRepository


    @Test
    fun `test cascade persist`() {
        val gameTeam = GameTeam.construct("Damwon KIA")

        val gamer1 = Gamer.construct("Showmaker", gameTeam)
        val gamer2 = Gamer.construct("Canyon", gameTeam)

        gameTeamRepository.save(gameTeam)
    }
}