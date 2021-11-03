package uz.hamroev.mediatsiyanizolarinihaletish.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.snackbar.Snackbar
import uz.hamroev.mediatsiyanizolarinihaletish.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(binding.root)

        startAnimation()
        binding.titleAbout1.setOnLongClickListener {
            val snackbar = Snackbar.make(it,"Android Developer - Doston Hamroyev",Snackbar.LENGTH_LONG)
            snackbar.show()
            true
        }
        binding.titleAbout2.setOnLongClickListener {
            val snackbar = Snackbar.make(it,"Android Developer - Doston Hamroyev",Snackbar.LENGTH_LONG)
            snackbar.show()
            true
        }

    }

    private fun startAnimation() {

        binding.titleAbout1.text = """
            Мазкур мультимедиа илова маҳалла ва оила институти соҳасида фаолият олиб бораётган мутахассисларнинг медиацияга оид билим ва тушунчаларини шакллантиришни назарда тутади.

            Мультимедиа илова “Маҳалла ва оила” илмий-тадқиқот институтида JHBL-30 “Маҳалла ва оила тизими мутахассисларининг оилавий низоларни ҳал қилишдаги амалий компетенцияларини такомиллаштиришнинг илмий-услубий асослари” мавзусидаги лойиҳа доирасида тайёрланган.
        """.trimIndent()

        binding.userName.setText("Моҳира Кундибаевна \nХолиқова")
        binding.kasb.setText("Ўзбекистон Республикаси Маҳалла ва оилани қўллаб-қувватлаш вазирлиги ҳузуридаги “Маҳалла ва оила” илмий-тадқиқот институти бўлим бошлиғи, фалсафа доктори, доцент" +
                "\n" +
                "\n")

        binding.userName2.setText("Бекназарова Саида \n" +
                "Сафибуллаевна")
        binding.kasb2.setText("Профессор" +
                "\nт.ф.д." +
                "\nМухаммад ал-Хоразми номидаги Тошкент Ахборот технологиялари университети   Аудиовизуал технологиялар» кафедраси профессори" +
                "\n" +
                "\n")

        binding.titleAbout2.text = "Мультимедиа илова институт Илмий Кенгашининг 2021 йил 4 январдаги 4-сон қарори билан нашрга тавсия этилган “Медиация оилавий низоларни ҳал этиш усули” мавзусидаги услубий қўлланма асосида тайёрланган."

//        binding.userName3.setText("Достон Ҳамроев \n" +
//                "Давронович")
//        binding.kasb3.setText("Андроид дастурчи" +
//                "\nUI дизайнер" +
//                "\nМуҳаммад ал-Хоразмий номидаги Тошкент Ахборот технологиялари университети Телевизион Технологиялари факултети талабаси" +
//                "\n\n")

    }


}