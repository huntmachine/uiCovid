package example.demo.uicovid.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import example.demo.uicovid.R

class EditTextAdapter(private val dataSet: List<String>) :
    RecyclerView.Adapter<EditTextAdapter.TextviewViewHolder>() {

    inner class TextviewViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textview1: TextView = view.findViewById(R.id.ibBlood)
        val textview2: TextView = view.findViewById(R.id.ibTemp)
        val textview3: TextView = view.findViewById(R.id.ibHeart)
        val textView4: TextView = view.findViewById(R.id.ibGlucose)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextviewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_text_box, parent, false)
        return TextviewViewHolder(view)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: TextviewViewHolder, position: Int) {

        dataSet[position]

             holder.textview1.setOnClickListener {

        }

        holder.textview2.setOnClickListener {

        }

        holder.textview3.setOnClickListener {

        }

        holder.textView4.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}
