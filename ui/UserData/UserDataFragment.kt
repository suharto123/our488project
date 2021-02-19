package com.example.ui.ui.UserData

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ui.R
import com.google.firebase.firestore.FirebaseFirestore





class UserDataFragment : Fragment() {

    var db = FirebaseFirestore.getInstance()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user_history, container, false)
    }
}