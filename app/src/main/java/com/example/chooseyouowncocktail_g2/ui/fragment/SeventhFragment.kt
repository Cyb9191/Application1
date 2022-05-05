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
import com.example.chooseyouowncocktail_g2.databinding.FragmentSeventhBinding
import kotlinx.coroutines.launch


class SeventhFragment : Fragment() {

    private var _binding: FragmentSeventhBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSeventhBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.testButtonanswer1.setOnClickListener {



                var answer1: String? = binding.testInput1.getText().toString()
                if (((answer1!!) == "Australian pelican") || ((answer1!!) == "australian pelican") || ((answer1!!) == "Australian Pelican")) {
                    findNavController().navigate(R.id.to_eighth)

                } else {
                    Toast.makeText(
                        getActivity(), "Try again!",
                        Toast.LENGTH_LONG
                    ).show();
                }
            }



        binding.testButtonback1.setOnClickListener {
                findNavController().navigate(R.id.to_home)
            }


        }


    }






