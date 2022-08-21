package uz.exemple.less5_kotlinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        initViews()
    }
    fun initViews() {
        val btn_2task = findViewById<Button>(R.id.btn_toSecondTask)
        btn_2task.setOnClickListener { openSecondTask() }
    }

    fun openSecondTask() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}