package aad.cafeteriagoya

import aad.cafeteriagoya.databinding.ActivityMainBinding
import aad.cafeteriagoya.databinding.ActivityMenuBinding
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMain.setOnClickListener {
            irMenu()
        }

    }

    fun irMenu() {
        val hora = binding.tvIntroduceHora.text
        if(hora != "") {
            val intent = Intent(this, MenuActivity::class.java).apply {
                putExtra("hora", hora)
            }
            startActivity(intent)
        } else {
            Toast.makeText(this, "Introduce una hora", Toast.LENGTH_SHORT).show()
        }

    }

}



