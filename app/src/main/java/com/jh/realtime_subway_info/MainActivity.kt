package com.jh.realtime_subway_info

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class MainActivity: AppCompatActivity() {

    private val apiEndpoint = "http://swopenapi.seoul.go.kr/api/subway/{YOUR_API_KEY}/json/realtimeStationArrival/0/5/{STATION_CODE}"
    private val stationCode = "D01"
    private val apiKey = "{U_API_KEY}"

    override fun onCreate(savedInstanceState: Bundle?) {




        class MainActivity: AppCompatActivity() {

            private val apiEndpoint = "http://swopenapi.seoul.go.kr/api/subway/{YOUR_API_KEY}/json/realtimeStationArrival/0/5/{STATION_CODE}"
            private val stationCode = "D01"
            private val apiKey = "{U_API_KEY}"

            override fun onCreate(savedInstanceState: Bundle?) {

                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val requestQueue: RequestQueue = Volley.newRequestQueue(this)

                val jsonObjectRequest = JsonObjectRequest(
                    apiEndpoint.replace("{YOUR_API_KEY}", apiKey).replace("{STATION_CODE}", stationCode),
                    null,
                    { response ->
                        // Success callback
                        val realtimeArrivalList = response.getJSONArray("realtimeArrivalList")
                        for (i in 0 until realtimeArrivalList.length()) {
                            val train = realtimeArrivalList.getJSONObject(i)
                            val subwayid = train.getString("subwayid")
                            val trainLineNm = train.getString("trainLineNm")
                            val arrivalTime = train.getString("arrivalMsg2")
                            Log.d(TAG, "Train $i -호선 $subwayid $trainLineNm 행 $arrivalTime 후 도착 예정 ")
                        }
                    },
                    { error ->
                        // Error callback
                        Log.e(TAG, "에러: ${error.networkResponse.statusCode} - ${error.localizedMessage}")
                    }
                )

                requestQueue.add(jsonObjectRequest)
            }

        }
        (savedInstanceState)
        setContentView(R.layout.activity_main)

        val requestQueue: RequestQueue = Volley.newRequestQueue(this)

        val jsonObjectRequest = JsonObjectRequest(
            apiEndpoint.replace("{YOUR_API_KEY}", apiKey).replace("{STATION_CODE}", stationCode),
            null,
            { response ->
                // Success callback
                val realtimeArrivalList = response.getJSONArray("realtimeArrivalList")
                for (i in 0 until realtimeArrivalList.length()) {
                    val train = realtimeArrivalList.getJSONObject(i)
                    val subwayid = train.getString("subwayid")
                    val trainLineNm = train.getString("trainLineNm")
                    val arrivalTime = train.getString("arrivalMsg2")
                    Log.d(TAG, "Train $i -호선 $subwayid $trainLineNm 행 $arrivalTime 후 도착 예정 ")
                }
            },
            { error ->
                // Error callback
                Log.e(TAG, "에러: ${error.networkResponse.statusCode} - ${error.localizedMessage}")
            }
        )

        requestQueue.add(jsonObjectRequest)
    }

    companion object{
        private const val TAG = "MainActivity"
    }
}
