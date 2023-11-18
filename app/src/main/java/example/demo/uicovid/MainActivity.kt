package example.demo.uicovid

import example.demo.uicovid.adapters.MyRecyclerViewAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import example.demo.uicovid.adapters.EditTextAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val recyclerView1: RecyclerView = findViewById(R.id.myRecyclerView)
        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = MyRecyclerViewAdapter()

        val recyclerView2: RecyclerView = findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = LinearLayoutManager(this)
        val dataSet2 = listOf("Heart Rate", "Temprature", "Blood Pressure", "Glucose")
        val textViewAdapter = EditTextAdapter(dataSet2) // Create an instance of TextViewAdapter
        recyclerView2.adapter = textViewAdapter // Set the adapter to recyclerView2


    }
}
