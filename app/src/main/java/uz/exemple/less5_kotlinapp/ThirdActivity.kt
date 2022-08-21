package uz.exemple.less5_kotlinapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        initViews()
    }
    fun initViews() {
        val remember = findViewById<Button>(R.id.btn_remember)
        remember.setOnClickListener {
            val userId = findViewById<EditText>(R.id.et_userId_third)
            val userPw = findViewById<EditText>(R.id.et_userPw_third)
            userId.setText("2004005605")
            userPw.setText("Pw38h@jF$5")
        }
        val btn_4task = findViewById<Button>(R.id.btn_toFourthTask)
        btn_4task.setOnClickListener { openFourthTask() }
    }

    fun openFourthTask() {
        val intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
        finish()
    }
}