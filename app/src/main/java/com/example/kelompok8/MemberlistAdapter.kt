package com.example.kelompok8

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberlistAdapter(private val context: Context, private val memberlist: List<Memberlist>, val listener: (Memberlist) -> Unit)
    : RecyclerView.Adapter<MemberlistAdapter.MemberlistViewHolder>(){
    class MemberlistViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgMemberlist = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMemberlist = view.findViewById<TextView>(R.id.tv_name)
        val nimMemberlist = view.findViewById<TextView>(R.id.tv_nim)
        val emailMemberlist = view.findViewById<TextView>(R.id.tv_email)
        val alamatMemberlist = view.findViewById<TextView>(R.id.tv_alamat)

        fun bindView(memberlist: Memberlist, listener: (Memberlist) -> Unit) {
            imgMemberlist.setImageResource(memberlist.imgMemberlist)
            nameMemberlist.text = memberlist.nameMemberlist
            nimMemberlist.text = memberlist.nimMemberlist
            emailMemberlist.text = memberlist.emailMemberlist
            alamatMemberlist.text = memberlist.alamatMemberlist
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberlistViewHolder {
        return MemberlistViewHolder(
            LayoutInflater.from(context).inflate(R.layout.memberlist, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MemberlistViewHolder, position: Int) {
        holder.bindView(memberlist[position], listener)
    }

    override fun getItemCount(): Int = memberlist.size

}