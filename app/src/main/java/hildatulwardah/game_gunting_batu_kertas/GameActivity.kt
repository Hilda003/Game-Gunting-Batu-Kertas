package hildatulwardah.game_gunting_batu_kertas

import android.os.Bundle

import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    lateinit var computerImageView : ImageView
    lateinit var rockImageButton: ImageButton
    lateinit var paperImageButton: ImageButton
    lateinit var scissorsImageButton: ImageButton
    lateinit var resultImageView: ImageView



    private fun initComponent () {
        computerImageView = findViewById(R.id.computerImageView)
        rockImageButton = findViewById(R.id.ImageButtonRock)
        paperImageButton = findViewById(R.id.ImageButtonPaper)
        scissorsImageButton = findViewById(R.id.ImageButtonScissors)
        resultImageView = findViewById(R.id.ResultImageView)
    }



    //function untuk membuat aksi -> ketika diklik maka game akan dimulai
    private fun initListener () {
        rockImageButton.setOnClickListener {  startGame("PAPER")}
        paperImageButton.setOnClickListener { startGame("ROCK")  }
        scissorsImageButton.setOnClickListener {  startGame("SCISSORS")}
    }

    //fun untuk memulai game
    private fun startGame (Option : String) {
        val computerOption = Game.pickRandomOption()
        computerImageView.setImageResource(Game.pickDraweble(computerOption))
        when {
            Game.isDraw(Option, computerOption) -> resultImageView.setImageResource(R.drawable.draw)
            Game.isWin(Option, computerOption) -> resultImageView.setImageResource(R.drawable.win)
            else -> resultImageView.setImageResource(R.drawable.lose)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        initComponent()
        initListener()
    }
}