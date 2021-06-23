package com.fuyaojun.entertainment2.fragment.filmfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fuyaojun.entertainment2.R
import com.fuyaojun.entertainment2.databinding.FragmentFilmBinding
import com.fuyaojun.entertainment2.databinding.FragmentShowFilmBinding

class ShowFilmFragment : Fragment() {
    private lateinit var binding: FragmentShowFilmBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentShowFilmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}