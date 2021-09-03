

package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentRulesBinding

class RulesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding:FragmentRulesBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_rules,container,false
        )
        binding.playBtn.setOnClickListener {
            it.findNavController().navigate(RulesFragmentDirections.actionRulesFragmentToGameFragment())
        }
        return binding.root
    }
}
