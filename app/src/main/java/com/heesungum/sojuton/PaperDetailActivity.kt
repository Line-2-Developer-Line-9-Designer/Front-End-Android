package com.heesungum.sojuton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.heesungum.sojuton.databinding.ActivityPaperDetailBinding

class PaperDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaperDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaperDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            finish()
        }

        binding.recyclerView.adapter = PaperDetailAdapter(getDummyList())
    }

    fun getDummyList(): List<DetailEntity> = listOf(
        DetailEntity(
            title = "초기 스타트업 이야기",
            author = "9호선 디자이너",
            letterCount = 12,
            desc = "모든 국민은 보건에 관하여 국가의 보호를 받는다. " +
                    "대통령은 제3항과 제4항의 사유를 지체없이 공포하여야 한다. " +
                    "정당의 목적이나 활동이 민주적 기본질서에 위배될 때에는 정부는 헌법재판소에 그 해산을 제소할 수 있고, " +
                    "정당은 헌법재판소의 심판에 의하여 해산된다. 해산된다.",
            heartCount = 15,
            date = "22.11.30"
        ),
        DetailEntity(
            title = "2호선 개발자 희성",
            desc = "모든 국민은 보건에 관하여 국가의 보호를 받는다. " +
                    "대통령은 제3항과 제4항의 사유를 지체없이 공포하여야 한다. " +
                    "정당의 목적이나 활동이 민주적 기본질서에 위배될 때에는 정부는 헌법재판소에 그 해산을 제소할 수 있고, " +
                    "정당은 헌법재판소의 심판에 의하여 해산된다. 해산된다.",
            date = "22.12.01"
        )
    )
}