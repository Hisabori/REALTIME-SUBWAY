$(document).ready(function(){
    $('#test').click(function(){

        //여기에 API KEY 입력

        let API_KEY = "TEST_API_KEY"
        let startIndex = 1;
        let endIndex = 10;
        let encodingStation = "회룡"

        //AJAX
        $.ajax({
            url: "https://swopenapi.seoul.go.kr/api/subway/${API_KEY}/json/realtimeStationArrival/0/${startIndex}/${endIndex}/${encodingStation}",
        })
    })
})