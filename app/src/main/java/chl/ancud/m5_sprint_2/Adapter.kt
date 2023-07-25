package chl.ancud.m5_sprint_2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import chl.ancud.m5_sprint_2.databinding.FragmentItemBinding
import coil.load

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {

    private var listado = mutableListOf<Zapato>()


    class ViewHolder(private val binding: FragmentItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(zapato: Zapato) {
            binding.tvNombre.text = zapato.nombre
            binding.tvPrecio.text = zapato.precio.toString()
            binding.imgFoto.load(zapato.foto)

            binding.constraintLayoutItem.setOnClickListener{
                Toast.makeText(this.itemView.context,"${zapato.nombre} presionado", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding: FragmentItemBinding = FragmentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = listado[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return listado.size
    }

    fun setData(lista: MutableList<Zapato>) {
        this.listado = lista.toMutableList()
    }

}