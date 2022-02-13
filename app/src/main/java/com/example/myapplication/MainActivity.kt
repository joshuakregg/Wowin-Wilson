package com.example.myapplication

import android.content.ClipData
import android.content.Intent
import android.media.MediaDataSource
import android.media.MediaPlayer
import java.nio.file.Path


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Wows>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var wilsonwow:Array<Int>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.wilson1,
            R.drawable.wilson2,
            R.drawable.wilson3,
            R.drawable.wilson4,
            R.drawable.wilson5,
            R.drawable.wilson6,
            R.drawable.wilson7,
            R.drawable.wilson8,
            R.drawable.wilson9,
            R.drawable.wilson10z
        )
        heading = arrayOf(
            "wilson wow 1",
            "wilson wow 2",
            "wilson wow 3",
            "wilson wow 4",
            "wilson wow 5",
            "wilson wow 6",
            "wilson wow 7",
            "wilson wow 8",
            "wilson wow 9",
            "wilson wow 10",
        )

        wilsonwow = arrayOf(
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,
            R.raw.wowa,


        )



        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Wows>()
        getUserData()
    }
    private fun getUserData() {
        for (i in imageId.indices){
            val wows = Wows(imageId[i],heading[i])
            newArrayList.add(wows)
        }
        var adapter = ItemAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : ItemAdapter.onItemClickListener{

            override fun onItemClick(position: Int) {
               // val context = layoutInflater.inflate(R.layout.button_boi,findViewById(R.id.button_booty),false)
                val intent= Intent(this@MainActivity, ButtonBoiActivity::class.java)
                intent.putExtra(ButtonBoiActivity.POS,position.toString())
                this@MainActivity.startActivity(intent)


            }
        })


    }

}