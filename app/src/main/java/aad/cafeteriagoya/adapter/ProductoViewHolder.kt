package aad.cafeteriagoya.adapter

import aad.cafeteriagoya.R
import aad.cafeteriagoya.entidades.Producto
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.io.File

class ProductoViewHolder(view : View) : RecyclerView.ViewHolder(view){

    val imagenView = itemView.findViewById<ImageView>(R.id.imgProducto)
    var textViewProducto = itemView.findViewById<TextView>(R.id.textoProducto)
    var textViewPrecio = itemView.findViewById<TextView>(R.id.precioProducto)
    var button = itemView.findViewById<Button>(R.id.buttonAnadir)

    fun render(
        producto: Producto,
        onClickListener: (Producto) -> Unit,
        onClickDelete: (Int) -> Unit
    ){
        itemView.setOnClickListener { onClickListener(producto)}
        button.setOnClickListener { onClickDelete(adapterPosition)}

        textViewProducto.text = producto.nombre
        textViewPrecio.text = producto.precio.toString()

        val imageFile = File( "/home/alumno/AndroidStudioProjects/CafeteriaGoya/app/src/main/res/drawable${producto.categoria}.png")
        if (imageFile.exists()) {
            val uriImage = Uri.fromFile(imageFile)
            Picasso.with(imagenView.context).load(uriImage).fit().centerCrop().into(imagenView)
        }
    }

}