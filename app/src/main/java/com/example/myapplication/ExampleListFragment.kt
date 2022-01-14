package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class ExampleListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar layout
        val root = inflater.inflate(R.layout.fragment_example_list, container, false)
        setupNavigation (root)
        return root
    }

    private fun setupNavigation(root: View) {
        val detailButton = root.findViewById<Button>(R.id.detail_button)
        val createButton = root.findViewById<Button>(R.id.create_button)
        detailButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_List_to_Detail)
        }
        createButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_List_to_Add )
        }
    }
}