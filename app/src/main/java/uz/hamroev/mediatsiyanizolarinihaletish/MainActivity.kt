package uz.hamroev.mediatsiyanizolarinihaletish

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import uz.hamroev.mediatsiyanizolarinihaletish.activity.HomeActivity
import uz.hamroev.mediatsiyanizolarinihaletish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(binding.root)

        startAnimation()


        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }, 3000)


    }

    private fun startAnimation() {
        val anim_intro = AnimationUtils.loadAnimation(this, R.anim.anim_intro)
        val anim_intro2 = AnimationUtils.loadAnimation(this, R.anim.anim_intro2)
        binding.introTv2.setText("")
        binding.introTv2.animateText("МЕДИАЦИЯ ОИЛАВИЙ НИЗОЛАРНИ \n" +
                "ҲАЛ ЭТИШ УСУЛИ ")
        binding.introTv2.setCharacterDeley(50)

        binding.introImg.startAnimation(anim_intro2)
        binding.cardIntro.startAnimation(anim_intro)
    }
}