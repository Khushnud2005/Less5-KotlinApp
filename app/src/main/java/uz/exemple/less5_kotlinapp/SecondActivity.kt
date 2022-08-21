package uz.exemple.less5_kotlinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initViews()
    }
    fun initViews() {
        val btn_3task = findViewById<Button>(R.id.btn_toThirdTask)
        btn_3task.setOnClickListener { openThirdTask() }
    }

    fun openThirdTask() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}