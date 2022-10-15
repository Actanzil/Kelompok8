package com.example.kelompok8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val memberList = listOf<Memberlist>(
            Memberlist(
                R.drawable.img_me1,
                "Tanzilu Adji Arriduwan",
                "225150209111007",
                "anzilu28@student.ub.ac.id",
                "Gang Sakera 2, Gondanglegi Wetan, Malang"
            ),
            Memberlist(
                R.drawable.hadi,
                "Hadi Ikhwanul Fuadi",
                "225150209111002",
                "hadikhwanul@gmail.com",
                "VBT C3-078, Merjosari, Lowokwaru, Kota Malang"
            ),
            Memberlist(
                R.drawable.mamad,
                "Ahmad Madda Iknajah",
                "225150209111013",
                "ahmad_madda58@student.ub.ac.id",
                "Jalan Raya Candi VB, Karangbesuki, Sukun, Kota Malang"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_member)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MemberlistAdapter(this, memberList){

        }
    }
}