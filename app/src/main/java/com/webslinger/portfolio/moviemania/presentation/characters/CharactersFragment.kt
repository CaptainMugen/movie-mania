package com.webslinger.portfolio.moviemania.presentation.characters

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.webslinger.portfolio.moviemania.R
import com.webslinger.portfolio.moviemania.application.viewmodel.characters.CharacterViewModelFactory
import com.webslinger.portfolio.moviemania.application.viewmodel.characters.CharactersViewModel
import com.webslinger.portfolio.moviemania.presentation.BaseFragment
import javax.inject.Inject

class CharactersFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: CharacterViewModelFactory
    private lateinit var viewModel: CharactersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.characters_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        injector.createCharacterComponent().inject(this)
        viewModel = ViewModelProvider(this, viewModelFactory).get(CharactersViewModel::class.java)
    }

    companion object {
        fun newInstance() = CharactersFragment()
    }
}