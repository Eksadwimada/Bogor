package com.example.tripbogor.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.R
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.lifecycle.ViewModelProvider
import com.example.tripbogor.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView (inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(com.example.tripbogor.R.layout.fragment_profile, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}