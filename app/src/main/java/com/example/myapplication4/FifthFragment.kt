package com.example.myapplication4

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication4.databinding.FragmentFifthBinding


class FifthFragment : Fragment()  {

    private var _binding: FragmentFifthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFifthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFifth.setOnClickListener {
            Toast.makeText(
                getActivity(), "Australian pelican.",
                Toast.LENGTH_LONG
            ).show();
        }
        binding.buttonFifth2.setOnClickListener {
            Toast.makeText(getActivity(), "Expanses of mainland Australia and Tasmania.",
                Toast.LENGTH_LONG).show();

        }
        binding.buttonFifth3.setOnClickListener {
            Toast.makeText(getActivity(), "Large lakes, reservoirs, billabongs and rivers,estuaries, swamps, temporarily flooded areas in arid zones, drainage channels in farmland, salt evaporation ponds and coastal lagoons. ",
                Toast.LENGTH_LONG).show();

        }
        binding.buttonFifth4.setOnClickListener {
            var soundPellican= MediaPlayer.create(getActivity(), com.example.myapplication4.R.raw.pellican)
            //suo.setLooping(true);
            soundPellican.start();

        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}


