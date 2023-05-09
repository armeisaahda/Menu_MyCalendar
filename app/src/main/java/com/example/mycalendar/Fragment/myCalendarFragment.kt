package com.example.mycalendar.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.mycalendar.BeratBadanActivity
import com.example.mycalendar.MoodActivity
import com.example.mycalendar.R

class myCalendarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_calendar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val suasanahati: Button = view.findViewById(R.id.suasanaHati)
        val beratbadan : Button = view.findViewById(R.id.berat_badan)

        suasanahati.setOnClickListener {
            val moodActivityIntent = Intent(requireContext(), MoodActivity::class.java)
            activity?.startActivity(moodActivityIntent)
        }

        beratbadan.setOnClickListener {
            val beratbadanActivityIntent = Intent(requireContext(), BeratBadanActivity::class.java)
            activity?.startActivity(beratbadanActivityIntent)
        }

    }
}




