package com.rizal.utss.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizal.utss.DetailMakanan
import com.rizal.utss.MainActivity
import com.rizal.utss.Page_Menu_Favorit
import com.rizal.utss.R
import com.rizal.utss.model.modelMakanan

class makananAdapter(
    val itemList: ArrayList<modelMakanan>,
    val getActivity: Page_Menu_Favorit
): RecyclerView.Adapter<makananAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemGambar : ImageView
        var itemJudul : TextView
        var itemKeterangan : TextView

        init {
                itemGambar = itemView.findViewById(R.id.imgMakanan) as ImageView
                itemJudul = itemView.findViewById(R.id.txtJudul) as TextView
                itemKeterangan = itemView.findViewById(R.id.txtKeterangan) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_favorit, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemGambar.setImageResource(itemList[position].gambar)
        holder.itemJudul.setText(itemList[position].judul)
        holder.itemKeterangan.setText(itemList[position].keterangan)

        holder.itemView.setOnClickListener(){
            //inten
            //context atau this --> getActivity
            val intent = Intent(getActivity,DetailMakanan::class.java)

            //kita put data untuk kita passed ke detail
            intent.putExtra("gambar",itemList[position].gambar)
            intent.putExtra("judul",itemList[position].judul)

            //passed ke detail
            getActivity.startActivity(intent)
        }
    }
}