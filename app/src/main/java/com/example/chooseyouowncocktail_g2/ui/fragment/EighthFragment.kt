package com.example.chooseyouowncocktail_g2.ui.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.chooseyouowncocktail_g2.R
import com.example.chooseyouowncocktail_g2.databinding.FragmentEighthBinding
import kotlinx.coroutines.launch


class EighthFragment : Fragment() {

    private var _binding: FragmentEighthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentEighthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.testButtonanswer2.setOnClickListener {



                var answer1: String? = binding.testInput2.getText().toString()
                if (((answer1!!) == "Little owl") || ((answer1!!) == "Owl of Athena") || ((answer1!!) == "owl of Minerva")) {
                    findNavController().navigate(R.id.to_ninth)

                } else {
                    Toast.makeText(
                        getActivity(), "Try again!",
                        Toast.LENGTH_LONG
                    ).show();
                }
            }



        binding.testButtonback2.setOnClickListener {
                findNavController().navigate(R.id.to_home)
            }


        }


    }


