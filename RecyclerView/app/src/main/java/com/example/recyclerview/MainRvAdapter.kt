package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.MainRvItemBinding


class MainRvAdapter(private val dogList: ArrayList<Dog>)
: RecyclerView.Adapter<MainRvAdapter.MyViewHolder>() {

    inner class MyViewHolder(binding: MainRvItemBinding ):
    RecyclerView.ViewHolder(binding.root) {
        val breedTv = binding.dogBreedTv
        val genderTv = binding.dogGenderTv
        val ageTv = binding.dogAgeTv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: MainRvItemBinding = MainRvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dogData = dogList[position]
        holder.ageTv.text = dogData.age
        holder.breedTv.text = dogData.breed
        holder.genderTv.text = dogData.gender
    }

    override fun getItemCount(): Int {
        return dogList.size
    }
}