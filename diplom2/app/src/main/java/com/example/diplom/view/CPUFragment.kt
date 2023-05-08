package com.example.diplom.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diplom.R
import com.example.diplom.viewmodel.CPUViewModel

class CPUFragment : Fragment() {

 //   private lateinit var viewModel: CPUViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_c_p_u, container, false)
    }

}