
package com.example.chooseyouowncocktail_g2.ui.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.chooseyouowncocktail_g2.databinding.FragmentFourthBinding


class FourthFragment : Fragment() {

    private var _binding: FragmentFourthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFourth.setOnClickListener {
            Toast.makeText(
                getActivity(), "Peregrine falcon, peregrine or duck hawk.",
                Toast.LENGTH_LONG
            ).show();
        }
        binding.buttonFourth2.setOnClickListener {
            Toast.makeText(
                getActivity(), "Almost all over the world especially in Europe, North America, Central America and Australia.",
                Toast.LENGTH_LONG
            ).show();

        }
        binding.buttonFourth3.setOnClickListener {
            Toast.makeText(
                getActivity(), "It prefers open habitats, such as grasslands, tundra and fields, but can nest up to heights of 3600 meters.",
                Toast.LENGTH_LONG
            ).show();

        }
        binding.buttonFourth4.setOnClickListener {
            var soundFalcon = MediaPlayer.create(getActivity(), com.example.chooseyouowncocktail_g2.R.raw.falcon)
            //suo.setLooping(true);
            soundFalcon.start();

        }
    }



}
