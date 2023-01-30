package hildatulwardah.game_gunting_batu_kertas

import kotlin.random.Random

object Game {

    //untuk mengecek pengkondisian dengan menggunakan map
    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false

    )

    private val options = listOf("ROCK", "PAPER", "SCISSORS")

    private val optionsDraweble = mapOf(
        "ROCK" to R.drawable.rock,
        "PAPER" to R.drawable.paper,
        "SCISSORS" to R.drawable.scissors
    )

    //menangkap inputan user
    fun pickRandomOption() : String = options[Random.nextInt(0, 3)]

    //output draweble adalah int, maka dari itu kita perlu mengkonversi dari String ke Int

    fun pickDraweble(option : String) : Int = optionsDraweble[option]!!


    //mengecek apakah sama
    fun isDraw (from: String, to: String) : Boolean = from == to

    //mengecek apakah menang atau tidak
    fun isWin (from: String, to: String) : Boolean= rules["$from-$to"]!! //menggunakan tanda seru untuk memastikan datanya tidak nullable
}