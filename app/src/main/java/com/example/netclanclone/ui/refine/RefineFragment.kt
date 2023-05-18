package com.example.netclanclone.ui.refine

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.netclanclone.R
import com.example.netclanclone.databinding.FragmentRefineBinding

class RefineFragment : Fragment() {

    private var _binding: FragmentRefineBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentRefineBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var flag=true
        binding.button11.setOnClickListener {
            flag = !flag
            if (flag) {

                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (flag) {
                binding.button11.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button11.setTextColor(resources.getColor(R.color.white))

            }


    }
        var flag1=true
        binding.button7.setOnClickListener {
            flag1 = !flag1
            if (!flag1) {
                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (!flag1) {
                binding.button7.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button7.setTextColor(resources.getColor(R.color.white))

            }


        }
        var flag2=true
        binding.button8.setOnClickListener {
            flag2 = !flag2
            if (flag2) {
                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (flag2) {
                binding.button8.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button8.setTextColor(resources.getColor(R.color.white))

            }

        }
        var flag3=true
        binding.button12.setOnClickListener {
            flag3 = !flag3
            if (flag3) {
                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (flag3) {
                binding.button12.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button12.setTextColor(resources.getColor(R.color.white))

            }


        }
        var flag4=true
        binding.button13.setOnClickListener {
            flag4 = !flag4
            if (flag4) {
                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (flag4) {
                binding.button13.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button13.setTextColor(resources.getColor(R.color.white))

            }


        }
        var flag5=true
        binding.button14.setOnClickListener {
            flag5 = !flag5
            if (flag5) {
                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (flag5) {
                binding.button14.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button14.setTextColor(resources.getColor(R.color.white))

            }


        }
        var flag6=true
        binding.button15.setOnClickListener {
            flag6 = !flag6
            if (flag6) {
                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (flag6) {
                binding.button15.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button15.setTextColor(resources.getColor(R.color.white))

            }


        }
        var flag7=true
        binding.button17.setOnClickListener {
            flag7 = !flag7
            if (flag7) {
                it.setBackgroundResource(R.drawable.button_bg_color)

            } else {
                it.setBackgroundResource(R.drawable.button_on_realesed)

            }
            if (flag7) {
                binding.button17.setTextColor(resources.getColor(R.color.black))

            } else {
                binding.button17.setTextColor(resources.getColor(R.color.white))

            }


        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}