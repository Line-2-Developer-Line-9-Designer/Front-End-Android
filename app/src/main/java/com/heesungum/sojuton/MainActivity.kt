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

        binding.rollingPaperRv.adapter = RollingPaperRecyclerAdapter(getDummyList(), ::onItemClick)

        binding.profileButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MyPageActivity::class.java)
            startActivity(intent)
        }
    }

    private fun onItemClick() {
        val intent = Intent(
            this, PaperDetailActivity::class.java
        )
        startActivity(intent)
    }

    private fun getDummyList(): List<RollingPaperEntity> = listOf(
        RollingPaperEntity(
            title = "오늘 소주톤 다들 어떠셨나요?",
            author = "9호선 디자이너",
            heartCount = 15,
            date = "22.11.30",
            letterCount = 12
        ),
        RollingPaperEntity(
            title = "초기 스타트업 이야기",
            author = "9호선 디자이너",
            heartCount = 8,
            date = "22.11.30",
            letterCount = 12
        ),
        RollingPaperEntity(
            title = "나만의 최고 소주톤 프로젝트",
            author = "9호선 디자이너",
            heartCount = 20,
            date = "22.11.30",
            letterCount = 12
        ),
        RollingPaperEntity(
            title = "강남역으로 출근하시는 분들!",
            author = "9호선 디자이너",
            heartCount = 32,
            date = "22.11.30",
            letterCount = 12
        ),
    )
}