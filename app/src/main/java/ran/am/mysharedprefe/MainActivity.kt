package ran.am.mysharedprefe

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edname: EditText
    lateinit var btnsave: Button
    lateinit var sf: SharedPreferences
    lateinit var editor: SharedPreferences.Editor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edname=findViewById(R.id.editTextTextPersonName);
        btnsave=findViewById(R.id.button);
        sf=getSharedPreferences("details", MODE_PRIVATE)
        editor= sf.edit()

        btnsave.setOnClickListener {
            var s = edname.text
            editor.putString("namevalue", s.toString())
            editor.commit()
            Toast.makeText(applicationContext, "data saved to SharedPreferences"+s, Toast.LENGTH_SHORT).show();


            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}