package ran.am.mysharedprefe

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var txt: TextView
    lateinit var sf: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txt= findViewById(R.id.textView)
        sf=getSharedPreferences("details", MODE_PRIVATE)

        var s = sf.getString("namevalue","no data")

        txt.setText(s.toString())

    }
}