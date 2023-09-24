package com.alarmaxpro.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alarmaxpro.myapplication.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.spinner1.isEnabled=false
        binding.spinner1.isClickable=false
        binding.spinner2.isEnabled=false
        binding.spinner2.isClickable=false
        binding.timepicker.isClickable = false
        binding.timepicker.isEnabled = false
        binding.button1.isClickable = false
        binding.button2.isClickable = false
        binding.button3.isClickable = false
        binding.button4.isClickable = false
        binding.button5.isClickable = false
        binding.button6.isClickable = false
        binding.button7.isClickable = false
        binding.timepicker.hour = 5
        binding.timepicker.minute = 0


        binding.hamburgerButton.setOnClickListener {
            val popupMenu = PopupMenu(context, binding.hamburgerButton)
            popupMenu.menuInflater.inflate(R.menu.menu_main, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item: MenuItem? ->
                when (item!!.itemId) {
                    R.id.menu_config -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_SecondFragment_to_configuraciones1)
                    }

                    R.id.menu_logout -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_SecondFragment_to_FirstFragment)
                    }
                }
                true
            }
            popupMenu.show()
        }

        binding.back.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_SecondFragment_to_mainMenu)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}