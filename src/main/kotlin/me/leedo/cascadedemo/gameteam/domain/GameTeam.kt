package me.leedo.cascadedemo.gameteam.domain

import me.leedo.cascadedemo.BaseTimeEntity
import me.leedo.cascadedemo.gamer.domain.Gamer
import javax.persistence.*

@Entity
class GameTeam(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,

    @OneToMany(mappedBy = "gameTeam", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val gamers: MutableList<Gamer> = ArrayList(),
) : BaseTimeEntity() {

    companion object {
        fun construct(name: String): GameTeam {
            return GameTeam(name = name)
        }
    }
}