package hildatulwardah.game_gunting_batu_kertas

import org.junit.Assert
import org.junit.Test

class GameTest {
    @Test
    fun testPickRandomOption() {
        val option = listOf("ROCK", "PAPER", "SCISSORS")
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
        Assert.assertTrue(option.contains(Game.pickRandomOption()))

    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.paper, Game.pickDraweble("PAPER"))
        Assert.assertEquals(R.drawable.rock, Game.pickDraweble("ROCK"))
        Assert.assertEquals(R.drawable.scissors, Game.pickDraweble("SCISSORS"))
    }

    @Test
    fun testIsDraw() {
        Assert.assertTrue(Game.isDraw("ROCK", "ROCK"))
        Assert.assertTrue(Game.isDraw("PAPER", "PAPER"))
        Assert.assertTrue(Game.isDraw("SCISSORS", "SCISSORS"))

        Assert.assertFalse(Game.isDraw("PAPER", "ROCK"))
        Assert.assertFalse(Game.isDraw("ROCK", "SCISSORS"))
        Assert.assertFalse(Game.isDraw("SCISSORS", "ROCK"))
    }

    @Test
    fun testIsWin() {
        Assert.assertTrue(Game.isWin("ROCK", "SCISSORS"))
        Assert.assertTrue(Game.isWin("PAPER", "ROCK"))
        Assert.assertTrue(Game.isWin("SCISSORS", "PAPER"))

        Assert.assertFalse(Game.isWin("ROCK", "PAPER"))
        Assert.assertFalse(Game.isWin("PAPER", "SCISSORS"))
        Assert.assertFalse(Game.isWin("SCISSORS", "ROCK"))
    }
}