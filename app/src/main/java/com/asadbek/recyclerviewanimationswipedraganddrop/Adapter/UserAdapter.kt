package com.asadbek.recyclerviewanimationswipedraganddrop.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.asadbek.recyclerviewanimationswipedraganddrop.Models.User
import com.asadbek.recyclerviewanimationswipedraganddrop.R

class UserAdapter: ListAdapter<User,UserAdapter.VH>(MyDifUtils()){
    inner class VH(itemView: View):RecyclerView.ViewHolder(itemView){
        fun onBind(user: User){
            itemView.findViewById<TextView>(R.id.txt_1).text = user.userName
            itemView.findViewById<TextView>(R.id.txt_2).text=  user.password
        }
    }
    class MyDifUtils:DiffUtil.ItemCallback<User>(){
        // kelayotgan itemlar birxilligi
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.id == newItem.id
        }

        // kelayotgan ma`lumotlar birxilligi
        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.equals(newItem)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
       holder.onBind(getItem(position))
    }
}