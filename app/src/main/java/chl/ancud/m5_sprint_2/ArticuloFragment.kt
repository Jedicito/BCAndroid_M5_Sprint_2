package chl.ancud.m5_sprint_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import chl.ancud.m5_sprint_2.databinding.FragmentArticuloBinding
import coil.load

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val NOMBRE = "nombre"
private const val PRECIO = "precio"
private const val FOTO = "foto"

/**
 * A simple [Fragment] subclass.
 * Use the [ArticuloFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ArticuloFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var nombre: String? = null
    private var precio: Double? = null
    private var foto: String? = null

    private lateinit var binding: FragmentArticuloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            nombre = it.getString(NOMBRE)
            precio = it.getDouble(PRECIO)
            foto = it.getString(FOTO)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentArticuloBinding.inflate(LayoutInflater.from(activity))

        bind()

        return binding.root

    }

    fun bind() {
        binding.tvNombreArticulo.text = nombre
        binding.tvPrecioArticulo.text = precio.toString()
        binding.imgFotoArticulo.load(foto)

        binding.btnCarritoArticulo.setOnClickListener {
            Toast.makeText(this.context, "Producto $nombre agregado al carrito", Toast.LENGTH_SHORT).show()
        }

    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ArticuloFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ArticuloFragment().apply {
                arguments = Bundle().apply {
                    putString(NOMBRE, nombre)
                    putDouble(PRECIO, precio!!)
                    putString(FOTO, foto)

                }
            }
    }
}