package com.yaroshevich.rvacda

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yaroshevich.rvacda.rv.CoolAdapter
import com.yaroshevich.rvacda.rv.OnLastItemListener
import com.yaroshevich.rvacda.rv.repository.DataItemRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnLastItemListener {

    val repository = DataItemRepository()
    val coolAdapter = CoolAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = coolAdapter
            addItemDecoration(DividerItemDecoration(this@MainActivity, 1))
        }

        repository.list.observe(this, Observer {


            coolAdapter.setData(it)
        })

    }

    override fun onLast() {
        repository.update()
    }
}
