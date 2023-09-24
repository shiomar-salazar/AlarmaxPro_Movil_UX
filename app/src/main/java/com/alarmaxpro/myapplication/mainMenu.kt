package com.alarmaxpro.myapplication

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alarmaxpro.myapplication.databinding.FragmentMainMenuBinding


/**
 * A simple [Fragment] subclass.
 * Use the [mainMenu.newInstance] factory method to
 * create an instance of this fragment.
 */
class mainMenu : Fragment() {

    private var _binding: FragmentMainMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.hamburgerButton.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_FirstFragment)
        }

        binding.card1.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_SecondFragment)
        }

        binding.card2.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_editarAlarma)
        }

        binding.card3.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_nuevaAlarma)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}