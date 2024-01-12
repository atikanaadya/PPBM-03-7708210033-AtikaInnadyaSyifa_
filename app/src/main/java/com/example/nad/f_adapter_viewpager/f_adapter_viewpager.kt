package com.example.nad.f_adapter_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nad.F_dimsum
import com.example.nad.F_sushi

class f_adapter_viewpager (
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle

): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {

        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            F_sushi()
        else
            F_dimsum()
    }
}