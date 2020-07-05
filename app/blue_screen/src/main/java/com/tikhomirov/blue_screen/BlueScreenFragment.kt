package com.tikhomirov.blue_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tikhomirov.base.BaseFragment
import com.tikhomirov.mmac.blue_screen.R
import kotlinx.android.synthetic.main.fragment_blue_screen.*

class BlueScreenFragment: BaseFragment() {

    companion object {
        fun newInstance() = BlueScreenFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blue_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupListeners()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setupListeners() {
        btnGoToFragment.setOnClickListener { router.navigateTo(screenList.red_screen) }
    }
}