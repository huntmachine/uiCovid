package example.demo.uicovid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import example.demo.uicovid.R

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {
    private var buttonLabels = arrayOf("Difficult Breathing", "Sore Throat", "Fever")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.rv_buttons, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        when (position) {
            0 -> holder.button1.text = buttonLabels[position]
            1 -> holder.button2.text = buttonLabels[position]
            2 -> holder.button3.text = buttonLabels[position]
        }
    }

    override fun getItemCount(): Int {
        return buttonLabels.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button1: Button = itemView.findViewById(R.id.rvbut1)
        val button2: Button = itemView.findViewById(R.id.rvbut2)
        val button3: Button = itemView.findViewById(R.id.rvbut3)
    }
}

