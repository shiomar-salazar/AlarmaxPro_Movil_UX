package com.alarmaxpro.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alarmaxpro.myapplication.databinding.FragmentConfiguraciones1Binding

class configuraciones1 : Fragment() {

    private var _binding: FragmentConfiguraciones1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConfiguraciones1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.spinner3.isEnabled=false
        binding.spinner3.isClickable=false

        if (binding.checkbox4.isActivated){
            binding.spinner3.isEnabled=true
            binding.spinner3.isClickable=true
        }

        binding.back.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_configuraciones1_to_mainMenu)
        }

        binding.btnCerrar.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_configuraciones1_to_FirstFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}