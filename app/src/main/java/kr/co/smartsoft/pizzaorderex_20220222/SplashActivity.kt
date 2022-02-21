package kr.co.smartsoft.pizzaorderex_20220222

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val myHandle = Handler(Looper.getMainLooper())

        myHandle.postDelayed( {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

            finish()
        },2500)

    }
}