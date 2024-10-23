package com.rizal.utss

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rizal.utss.adapter.makananAdapter
import com.rizal.utss.model.MockList
import com.rizal.utss.model.modelMakanan

class Page_Menu_Favorit : AppCompatActivity() {
    private lateinit var rv_favorit : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_menu_favorit)

        rv_favorit = findViewById(R.id.rv_favorit)

        rv_favorit.layoutManager = GridLayoutManager(this,2)
        val adapter = makananAdapter(MockList.getModel() as ArrayList<modelMakanan>,this)
        rv_favorit.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}