package aad.cafeteriagoya.adapter

import aad.cafeteriagoya.R
import aad.cafeteriagoya.entidades.Producto
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdaptador(
    val productos: List<Producto>,
    private val onClickListener: (Producto) -> Unit,
    private val onClickDelete: (Int) -> Unit
): RecyclerView.Adapter<ProductoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProductoViewHolder(layoutInflater.inflate(R.layout.item_lista,parent,false))
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val item = productos[position]
        holder.render(item,onClickListener,onClickDelete)
    }

    override fun getItemCount(): Int {
        return productos.size
    }

}