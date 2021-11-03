package uz.hamroev.mediatsiyanizolarinihaletish.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.pdfview.PDFView
import uz.hamroev.mediatsiyanizolarinihaletish.R
import uz.hamroev.mediatsiyanizolarinihaletish.cache.Cache
import uz.hamroev.mediatsiyanizolarinihaletish.databinding.ActivitySlaydBinding

class SlaydActivity : AppCompatActivity() {
    lateinit var binding: ActivitySlaydBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivitySlaydBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Cache.init(this)
        loadPdf()
    }

    private fun loadPdf() {
        when (Cache.position) {
            "0" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd1.pdf").show()
            }
            "1" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd2.pdf").show()
            }
            "2" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd3.pdf").show()
            }
            "3" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd4.pdf").show()
            }
            "4" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd5.pdf").show()
            }
            "5" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd6.pdf").show()
            }
            "6" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd7.pdf").show()
            }
            "7" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd8.pdf").show()
            }
            "8" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd9.pdf").show()
            }
            "9" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd10.pdf").show()
            }
            "10" -> {
                 findViewById<PDFView>(R.id.pdf_view).fromAsset("slayd11.pdf").show()
            }


        }
    }
}