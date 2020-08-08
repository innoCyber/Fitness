package com.innocyber.fitnesstracker.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.innocyber.fitnesstracker.repository.MainRepository

class MainViewModel @ViewModelInject constructor(mainRepository: MainRepository) : ViewModel(){
}