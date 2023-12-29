package com.pnautomation.bdforce.presentation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.beerapp.R
import dagger.hilt.android.AndroidEntryPoint
import com.example.beerapp.databinding.FragmentDashboardBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DashboardFragment : Fragment() {

    private val viewModel: BDFViewModel by viewModels()

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.title = getString(R.string.txt_dashboard)
        viewModel.getCardsData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.resultList.collectLatest {
                // TODO : Submit data to adapter
                // adapter.submitData(lifecycle, it)
            }
        }

        // TODO : Reload adapter data
         viewModel.reloadClick.observe(viewLifecycleOwner) {
            // Refresh Adapter
            // adapter.refresh()
         }

    }

}