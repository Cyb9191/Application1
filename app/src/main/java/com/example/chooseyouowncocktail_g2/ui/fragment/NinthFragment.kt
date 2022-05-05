package com.example.chooseyouowncocktail_g2.ui.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.chooseyouowncocktail_g2.R
import com.example.chooseyouowncocktail_g2.databinding.FragmentNinthBinding
import kotlinx.coroutines.launch
import com.example.chooseyouowncocktail_g2.Birdtestlist

import com.example.chooseyouowncocktail_g2.adapter.BirdCardAdapter
import com.example.chooseyouowncocktail_g2.databinding.FragmentHomeBinding

class NinthFragment: Fragment() {

    private var _binding: FragmentNinthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNinthBinding.inflate(inflater, container, false)
        val birdCardAdapter = BirdCardAdapter(Birdtestlist.birdList())
        binding.birdCardRecyclerView.adapter = birdCardAdapter
        val root: View = binding.root
        return root



        }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



            }


        }
