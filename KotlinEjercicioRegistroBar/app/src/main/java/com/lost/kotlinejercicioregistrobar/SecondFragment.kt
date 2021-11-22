package com.lost.kotlinejercicioregistrobar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.lost.kotlinejercicioregistrobar.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.numberPicker.minValue = 1
        binding.numberPicker.maxValue = 20

        binding.numberPicker.setOnValueChangedListener(object: NumberPicker.OnValueChangeListener{

            override fun onValueChange(p0: NumberPicker?, p1: Int, p2: Int) {
                TODO("Not yet implemented")
            }

            //picker, oldVal, newVal -> total(newVal)

        })

        binding.btnAgregar.setOnClickListener {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun total(newValue:Int){

        var total:Int

        if(binding.etPrecio.text.toString().isBlank()){

            total = 0
        }
        else{
            total = binding.etPrecio.text.toString().toInt()
        }

        binding.tvTotalActual.text = "$${total * newValue }"
    }
}