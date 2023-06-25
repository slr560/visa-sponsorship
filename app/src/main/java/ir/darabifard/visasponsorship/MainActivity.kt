package ir.darabifard.visasponsorship

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var countryAdapter: ArrayAdapter<String>
    private lateinit var countOfEmployeeAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun initSpinnersAdapter() {
        val items = listOf("Material", "Design", "Components", "Android")
        val countryAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
    }
}