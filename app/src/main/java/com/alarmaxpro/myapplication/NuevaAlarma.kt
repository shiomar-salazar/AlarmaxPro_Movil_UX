package com.alarmaxpro.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.navigation.fragment.findNavController
import com.alarmaxpro.myapplication.databinding.FragmentNuevaAlarmaBinding

class NuevaAlarma : Fragment() {

    private var _binding: FragmentNuevaAlarmaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNuevaAlarmaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.timepicker.hour = 12
        binding.timepicker.minute = 0

        binding.back.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_nuevaAlarma_to_mainMenu)
        }

        binding.btnAcpetar.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_nuevaAlarma_to_mainMenu)
        }

        binding.btnCancelar.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_nuevaAlarma_to_mainMenu)
        }

        binding.hamburgerButton.setOnClickListener {
            val popupMenu = PopupMenu(context, binding.hamburgerButton)
            popupMenu.menuInflater.inflate(R.menu.menu_main, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item: MenuItem? ->
                when (item!!.itemId) {
                    R.id.menu_config -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_nuevaAlarma_to_configuraciones1)
                    }

                    R.id.menu_logout -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_nuevaAlarma_to_FirstFragment)
                    }
                }
                true
            }
            popupMenu.show()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}