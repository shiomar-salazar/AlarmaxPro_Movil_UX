package com.alarmaxpro.myapplication

import com.alarmaxpro.myapplication.R
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.appcompat.view.menu.MenuBuilder
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
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainMenuBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.card2.isClickable = false
        binding.card3.isClickable = false

        binding.hamburgerButton.setOnClickListener {
            val popupMenu = PopupMenu(context, binding.hamburgerButton)
            popupMenu.menuInflater.inflate(R.menu.menu_main, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item: MenuItem? ->
                when (item!!.itemId) {
                    R.id.menu_config -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_configuraciones1)
                    }

                    R.id.menu_logout -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_FirstFragment)
                    }
                }
                true
            }
            popupMenu.show()
        }

        binding.card1.setOnClickListener {
            val popupMenu = PopupMenu(context, binding.card1)

            popupMenu.menuInflater.inflate(R.menu.menu_alarma, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item: MenuItem? ->
                when (item!!.itemId) {
                    R.id.menu_detalles -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_SecondFragment)
                    }

                    R.id.menu_editar -> {
                        findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_editarAlarma)
                    }
                }
                true
            }
            popupMenu.show()
        }

        binding.plusBtn.setOnClickListener {
            findNavController().navigate(com.alarmaxpro.myapplication.R.id.action_mainMenu_to_nuevaAlarma)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}