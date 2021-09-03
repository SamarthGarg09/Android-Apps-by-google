

package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding:FragmentAboutBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_about,container,false
        )
        /*when we use safe args we navigate using direction class instead of
        view.findNavController().navigate(id)*/
        binding.playBtn2.setOnClickListener {
            it.findNavController().navigate(AboutFragmentDirections.actionAboutFragmentToGameFragment())
        }
        return binding.root
    }
}
