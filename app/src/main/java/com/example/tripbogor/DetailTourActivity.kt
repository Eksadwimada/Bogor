package com.example.tripbogor

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tripbogor.ui.home.HomeFragment

class DetailTourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tour)
        supportActionBar?.hide()

        assert(supportActionBar != null)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val Tour = intent.getParcelableExtra<Tour>(HomeFragment.INTENT_PARCELABLE)

        val imageTour = findViewById<ImageView>(R.id.img_item_photo)
        val titleTour = findViewById<TextView>(R.id.tv_item_name)
        val descTour = findViewById<TextView>(R.id.tv_item_description)

        imageTour.setImageResource(Tour?.imageTour!!)
        titleTour.text = Tour.titleTour
        descTour.text = Tour.descTour
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}