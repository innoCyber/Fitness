package com.innocyber.fitnesstracker.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.innocyber.fitnesstracker.R
import com.innocyber.fitnesstracker.ui.viewmodels.MainViewModel
import com.innocyber.fitnesstracker.ui.viewmodels.RunStatsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunStatsFragment: Fragment(R.layout.fragment_statistics) {

    private val viewModel: RunStatsViewModel by viewModels()

}