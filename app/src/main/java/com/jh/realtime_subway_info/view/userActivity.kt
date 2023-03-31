package com.jh.realtime_subway_info.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jh.realtime_subway_info.R
import com.jh.realtime_subway_info.model.User

class userActivity: AppCompatActivity() {
    private lateinit var user:User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        //user 객체 초기화
        user = User(

            //역 번호
            stnNo =1,

            //역 이름
            stnName =  "TestStation",

            //해당 역 노선 명
            stnLine =  "1호선",

            //지금 들어오는 열차
            currentTrain = "Train#1",

            //이전 열차
            previousTrain = "Train#2",

            //다음 열차
            nextTrain = "Train#3",

            //현제 엺처 위치
            currentTrainLOC = currentTrain + stnName,

            //다음 열차
            nextTrainLOC =  nextTrain + stnName


        )
    }
}