package com.tikhomirov.red_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tikhomirov.base.BaseFragment
import com.tikhomirov.mmac.red_screen.R
import kotlinx.android.synthetic.main.fragment_red_screen.*

class RedScreenFragment : BaseFragment() {

    companion object {
        fun newInstance() = RedScreenFragment()
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_red_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupListeners()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setupListeners() {
        btnGoToFragment.setOnClickListener {
            //router.navigateTo(screenList.openBlueScreen(24))
            router.backTo(null)
        }
    }
}