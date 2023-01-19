package aad.cafeteriagoya

import aad.cafeteriagoya.adapter.MenuAdaptador
import aad.cafeteriagoya.databinding.ActivityMainBinding
import aad.cafeteriagoya.databinding.ActivityMenuBinding
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    private lateinit var menuAdaptador: MenuAdaptador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCarrito.setOnClickListener {
            irCarrito()
        }

        setContentView(R.layout.activity_menu)
        rellenarSpinner()
    }

    fun initRecyclerView() {
        menuAdaptador = menuAdaptador
    }
    fun rellenarSpinner() {
        val categorias = arrayOf("Todas", "pincho", "cafe", "refresco", "bocadillo")

        var adaptador: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, categorias)
        binding.spinner.adapter = adaptador
    }

    fun irCarrito() {

        val intent = Intent(this, CarritoActivity::class.java).apply {
            val hora = intent.getStringExtra("hora")
            putExtra("hora", hora)
        }
        startActivity(intent)

    }

}