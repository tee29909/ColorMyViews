package buu.informatics.s59160571.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private  fun makeColored(view: View){
    when (view.id){
        R.id.BonOneText -> view.setBackgroundColor(Color.DKGRAY)
        R.id.text -> view.setBackgroundColor(Color.GRAY)
        R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
        R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
        R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
        else -> view.setBackgroundColor(Color.LTGRAY)
    }

    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.BonOneText)
        val boxTwoText = findViewById<TextView>(R.id.text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constan)

        val ckickebleViews: List<View> = listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout)
        for(item in ckickebleViews){
            item.setOnClickListener { makeColored(it) }
        }
    }


}
