package me.leedo.cascadedemo.gamer.domain

import me.leedo.cascadedemo.gamer.repository.GamerRepository
import me.leedo.cascadedemo.gameteam.domain.GameTeam
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
internal class GamerTest {

    @Autowired
    private lateinit var gamerRepository: GamerRepository

    @Test
    fun `test cascade persist`() {
        val gameTeam = GameTeam.construct("Damwon KIA")

        val gamer1 = Gamer.construct("Showmaker", gameTeam)
        val gamer2 = Gamer.construct("Canyon", gameTeam)

        gamerRepository.save(gamer1)
    }
}
