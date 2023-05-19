package com.example.tripbogor.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tripbogor.DetailTourActivity
import com.example.tripbogor.Tour
import com.example.tripbogor.TourAdapter


class HomeFragment : Fragment() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var adapter: TourAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var tourArrayList: ArrayList<Tour>

    lateinit var image: Array<Int>
    lateinit var title: Array<String>
    lateinit var description: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.example.tripbogor.R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(com.example.tripbogor.R.id.rv_tour)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = TourAdapter(tourArrayList) {
            val intent = Intent (context, DetailTourActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

    private fun dataInitialize() {
        tourArrayList = arrayListOf<Tour>()

        image = arrayOf(
            com.example.tripbogor.R.drawable.bukit,
            com.example.tripbogor.R.drawable.cibaliung,
            com.example.tripbogor.R.drawable.highland,
            com.example.tripbogor.R.drawable.pancar,
            com.example.tripbogor.R.drawable.img,
            com.example.tripbogor.R.drawable.taman,
        )
        title = arrayOf(
            getString(com.example.tripbogor.R.string.paralayang),
            getString(com.example.tripbogor.R.string.curug_cibaliung),
            getString(com.example.tripbogor.R.string.highland),
            getString(com.example.tripbogor.R.string.taman_wisata),
            getString(com.example.tripbogor.R.string.pemandian_air),
            getString(com.example.tripbogor.R.string.bunga),

        )
        description = arrayOf(
            getString(com.example.tripbogor.R.string.paralayang),
            getString(com.example.tripbogor.R.string.curug_cibaliung),
            getString(com.example.tripbogor.R.string.highland),
            getString(com.example.tripbogor.R.string.taman_wisata),
            getString(com.example.tripbogor.R.string.pemandian_air),
            getString(com.example.tripbogor.R.string.bunga),
        )

        for (i in image.indices) {

            val tour = Tour(image[i], title[i], description[i])
            tourArrayList.add(tour)
        }
    }
}