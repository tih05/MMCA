package com.tikhomirov.blue_screen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tikhomirov.base.BaseFragment
import com.tikhomirov.domain.KekUseCase
import com.tikhomirov.mmac.blue_screen.R
import kotlinx.android.synthetic.main.fragment_blue_screen.*
import org.koin.android.ext.android.inject

class BlueScreenFragment : BaseFragment() {

    companion object {
        private const val PARAM_KEY = "PARAM_KEY"
        fun newInstance(param: Int): BlueScreenFragment {
            return BlueScreenFragment().apply {
                arguments = Bundle().apply {
                    putInt(PARAM_KEY, param)
                }
            }
        }
    }



    //inject this into viewmodel
    private val kekUseCase: KekUseCase by inject()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blue_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val param = arguments!!.getInt(PARAM_KEY, 0)
        Log.d("Kek", "param = $param")
        setupListeners()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setupListeners() {
        btnGoToFragment.setOnClickListener {
            Log.e("Kek", "${kekUseCase.execute()}")
            router.navigateTo(screenList.red_screen)
        }
    }


}