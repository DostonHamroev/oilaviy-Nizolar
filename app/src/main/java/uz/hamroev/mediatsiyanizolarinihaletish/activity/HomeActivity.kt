package uz.hamroev.mediatsiyanizolarinihaletish.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import uz.hamroev.mediatsiyanizolarinihaletish.R
import uz.hamroev.mediatsiyanizolarinihaletish.adapter.MyMenuAdapter
import uz.hamroev.mediatsiyanizolarinihaletish.adapter.OnMyMenuItemClickListener
import uz.hamroev.mediatsiyanizolarinihaletish.cache.Cache
import uz.hamroev.mediatsiyanizolarinihaletish.databinding.ActivityHomeBinding
import uz.hamroev.mediatsiyanizolarinihaletish.model.MyMenu

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    lateinit var myMenuAdapter: MyMenuAdapter
    lateinit var list: ArrayList<MyMenu>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(binding.root)
        Cache.init(this)
        loadData()
        myMenuAdapter =
            MyMenuAdapter(binding.root.context, list, object : OnMyMenuItemClickListener {
                override fun onMyClick(myMenu: MyMenu, position: Int) {
                    when (position) {
                        0 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "0"
                        }
                        1 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "1"
                        }
                        2 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "2"
                        }
                        3 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "3"
                        }
                        4 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "4"
                        }
                        5 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "5"
                        }
                        6 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "6"
                        }
                        7 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "7"
                        }
                        8 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "8"
                        }
                        9 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "9"
                        }
                        10 -> {
                            startActivity(Intent(this@HomeActivity,SlaydActivity::class.java))
                            Cache.position = "10"
                        }
                        11 -> {
                            startActivity(Intent(this@HomeActivity,AboutActivity::class.java))
                        }
                    }
                }
            })

        binding.rvMenu.adapter = myMenuAdapter

    }

    private fun loadData() {
        list = ArrayList()
        list.add(MyMenu("Кириш", R.drawable.ic_01))
        list.add(MyMenu("ALTERNATIVE DISPUTE RESOLUTION", R.drawable.ic_03))
        list.add(MyMenu("МЕДИАЦИЯ", R.drawable.ic_05))
        list.add(MyMenu("МЕДИАЦИЯ ТАРИХИ ", R.drawable.ic_06))
        list.add(MyMenu("МЕДИАЦИЯ БОСҚИЧЛАРИ", R.drawable.ic_07))
        list.add(MyMenu("МЕДИАЦИЯ ТУРЛАРИ ВА МОДЕЛЛАРИ", R.drawable.ic_09))
        list.add(MyMenu("МЕДИАБЕЛЛИК ВА НОМЕДИАБЕЛЛИК", R.drawable.ic_11))
        list.add(MyMenu("ОИЛА МЕДИАЦИЯСИ", R.drawable.ic_13))
        list.add(MyMenu("МЕДИАЦИЯНИНГ БОШҚА ЯРАШТИРУВ УСУЛЛАРИДАН ФАРҚЛИ ЖИҲАТЛАРИ ҲАМДА АФЗАЛЛИГИ", R.drawable.ic_15))
        list.add(MyMenu("ГЛОССАРИЙ", R.drawable.ic_22))
        list.add(MyMenu("МАЪНАВИЙ-ТАРИХИЙ ҚАДРИЯТЛАРДА ТИНЧЛИК, БИРДАМЛИК¸СУЛҲПАРВАРЛИК МАСАЛАЛАРИНИНГ ИФОДАСИ ", R.drawable.ic_25))
        list.add(MyMenu("Илова ҳақида", R.drawable.ic_app_about))
    }
}