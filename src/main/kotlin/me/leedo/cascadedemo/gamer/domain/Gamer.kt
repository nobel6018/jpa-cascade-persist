package me.leedo.cascadedemo.gamer.domain

import me.leedo.cascadedemo.BaseTimeEntity
import me.leedo.cascadedemo.gameteam.domain.GameTeam
import javax.persistence.*

@Entity
class Gamer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "game_team_id")
    var gameTeam: GameTeam,
) : BaseTimeEntity() {

    companion object {
        // 생성 메소드
        // 생성시 연관관계 설정도 같이 합니다
        // 객체를 생성하면서 연관관계도 설정해서 "원자적으로" 생성합니다
        fun construct(name: String, gameTeam: GameTeam): Gamer {
            val gamer = Gamer(name = name, gameTeam = gameTeam)
            gamer.setGameTeam(gameTeam)

            return gamer
        }
    }

    // 연관관계 설정 메소드
    // 객체를 생성할 때만 사용합니다
    @JvmName("customSetGameTeam")
    private fun setGameTeam(gameTeam: GameTeam) {
        this.gameTeam = gameTeam
        gameTeam.gamers.add(this)
    }
}
