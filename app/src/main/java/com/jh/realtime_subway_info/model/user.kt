package com.jh.realtime_subway_info.model

data class User
    (

        //Station
        var StnNo: String? = null,
        var StaName: String? = null,
        var StnLine: String? = null,


        //UpTown Train 상행

        //Train
        var CurrentTrain: String? = null,
        var PreviousTrain: String? = null,
        var NextTrain: String? = null,

        //LOC (Location) , (지하철 위치)

        //지금 들어오는 열차
        var CurrentTrainLOC: String? = null,

        //다음 열차
        var NextTrainLOC: String? = null,

        //ETA (예상 열차 도착 시간)
        //예: 회룡역 -> 망월사 간 이동 시간 2분이라 가정 시, 현 시간에서 2분 추가한 시간이 예상 도착 시간임.


        var TrainArrivalETA: String? = null,

        //Last Train Time (막차) Notification
        //Push Notification


        //Search
        var StationSearch: String? = null,
        var TrainSearch: String? = null
    )

