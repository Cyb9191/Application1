package com.example.chooseyouowncocktail_g2.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chooseyouowncocktail_g2.databinding.FragmentThirdBinding
import android.widget.Toast;
import android.media.MediaPlayer




class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = ThirdFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding.buttonThird.setOnClickListener {
                Toast.makeText(getActivity(), "Blue-and-yellow macaw or blue-and-gold macaw",
                    Toast.LENGTH_LONG).show();
            }
            binding.buttonThird2.setOnClickListener {
                Toast.makeText(getActivity(), "Colombia, Venezuela, Peru, Brazil, Bolivia, Ecuador and Paraguay.",
                    Toast.LENGTH_LONG).show();

            }
            binding.buttonThird3.setOnClickListener {
                Toast.makeText(getActivity(), "Both dry and humid tropical and subtropical forests. It is also found in savannas.",
                    Toast.LENGTH_LONG).show();

            }
            binding.buttonThird4.setOnClickListener {
                // parrotSound.start()
                val soundParrot = MediaPlayer.create(getActivity(),
                    com.example.chooseyouowncocktail_g2.R.raw.parrot)
                //suo.setLooping(true);
                soundParrot.start();

            }
        }
}







