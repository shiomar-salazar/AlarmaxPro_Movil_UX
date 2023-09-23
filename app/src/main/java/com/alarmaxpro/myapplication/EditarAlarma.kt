package com.alarmaxpro.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alarmaxpro.myapplication.databinding.FragmentEditarAlarmaBinding

class EditarAlarma : Fragment() {

    private var _binding: FragmentEditarAlarmaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEditarAlarmaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.timepicker.hour = 1
        binding.timepicker.minute = 0

        binding.back.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_editarAlarma_to_mainMenu)
        }

        binding.btnAcpetar.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_editarAlarma_to_mainMenu)
        }

        binding.btnCancelar.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_editarAlarma_to_mainMenu)
        }

        binding.hamburgerButton.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_editarAlarma_to_FirstFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}