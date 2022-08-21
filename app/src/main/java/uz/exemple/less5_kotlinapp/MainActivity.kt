package uz.exemple.less5_kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews() {
        val btn_tasks = findViewById<Button>(R.id.btn_toTasks)
        btn_tasks.setOnClickListener { openFirstTask() }
    }

    fun openFirstTask() {
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
    }
}