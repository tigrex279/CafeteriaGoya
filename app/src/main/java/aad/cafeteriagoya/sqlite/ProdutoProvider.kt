package aad.cafeteriagoya.sqlite

import aad.cafeteriagoya.DataProvider
import aad.cafeteriagoya.entidades.Producto

class ProdutoProvider {
    companion object{
        fun obtenerTodosProductos() {

            val productos: MutableList<Producto> = DataProvider.listaProductos as MutableList<Producto>
        }
    }
}