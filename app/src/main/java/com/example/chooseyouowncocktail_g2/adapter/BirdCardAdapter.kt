package com.example.chooseyouowncocktail_g2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chooseyouowncocktail_g2.databinding.BirdCardBinding
import co.develhope.chooseyouowncocktail_g2.model.Birdtest
import androidx.navigation.findNavController
import android.view.View
import android.widget.Toast



import com.example.chooseyouowncocktail_g2.Birdtestlist
import com.example.chooseyouowncocktail_g2.R
import com.google.android.material.internal.ContextUtils.getActivity
import androidx.navigation.fragment.findNavController

class BirdCardAdapter(
    val birdListForAdapter: List<Birdtest>,
) :
    RecyclerView.Adapter<BirdCardAdapter.ViewHolder>() {
    private lateinit var binding: BirdCardBinding

    inner class ViewHolder(val binding: BirdCardBinding) : RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BirdCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    // bind the items with each item
    // of the list languageList
    // which than will be
    // shown in recycler view
    // to keep it simple we are
    // not setting any image data to view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(receiver = holder) {
            with(Birdtestlist.birdList()[position]) {
                binding.birdName.text = this.name
                binding.birdHabitat.text = this.habitat
                binding.birdDistribution.text = this.distribution
                binding.birdImage.setImageResource(this.img)
                binding.birdButton.setOnClickListener { view ->


                    if (this.correct) {
                        view.findNavController().navigate(R.id.to_next)
                    }

                    }

                }

            }
        }
    


    // return the size of languageList
    override fun getItemCount(): Int {
        return Birdtestlist.birdList().size
    }
}
