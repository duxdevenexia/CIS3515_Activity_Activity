package edu.temple.activities


/*
* step 3, oct/01/2024
*
* */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)



        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        val selectedSize = intent.getIntExtra("SELECTED_SIZE", 20)
        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            textSize = selectedSize.toFloat()
            text = "size: $selectedSize"


        }


    }
}