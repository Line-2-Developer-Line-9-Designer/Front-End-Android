package com.heesungum.sojuton

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.heesungum.sojuton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dummyList: MutableList<RollingPaperEntity> = mutableListOf()

        for (i in 0..9) {
            dummyList.add(
                RollingPaperEntity(
                    "${i}번째 제목",
                    "${i}번째 내용",
                )
            )
        }

        binding.rollingPaperRv.adapter = RollingPaperRecyclerAdapter(dummyList, ::onItemClick)
    }

    private fun onItemClick() {
        val intent = Intent(
            this, PaperDetailActivity::class.java
        )
        startActivity(intent)
    }
}