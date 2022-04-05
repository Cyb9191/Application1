package com.example.myapplication4

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication4.databinding.FragmentSixthBinding


class SixthFragment : Fragment()  {

    private var _binding: FragmentSixthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSixthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSixth.setOnClickListener {
            Toast.makeText(
                getActivity(), "Little owl, owl of Athena or owl of Minerva.",
                Toast.LENGTH_LONG
            ).show();
        }
        binding.buttonSixth2.setOnClickListener {
            Toast.makeText(getActivity(), "Europe, Asia and North Africa.",
                Toast.LENGTH_LONG).show();

        }
        binding.buttonSixth3.setOnClickListener {
            Toast.makeText(getActivity(),"Agricultural land with hedgerows and trees, orchards, woodland verges, parks and gardens, as well as steppes and stony semi-deserts."  ,
                Toast.LENGTH_LONG).show();

        }
        binding.buttonSixth4.setOnClickListener {
            var soundOwl = MediaPlayer.create(getActivity(), com.example.myapplication4.R.raw.owl)
            //suo.setLooping(true);
            soundOwl.start();
        }


    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}


