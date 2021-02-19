package com.example.ui.ui.IDK

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ui.R
import com.google.firebase.firestore.FirebaseFirestore





class IDKFragment : Fragment() {
    var db = FirebaseFirestore.getInstance()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_idk, container, false)
    }
}