$(document).ready(function(){

    //AJAX를 이용하여 GET 요청을 전송
    $.ajax({
        url: "http://swopenapi.seoul.go.kr/api/subway/{api_key}/json/realtimeStations",

        //요청을 전송 하는 타입, GET 방식
        //GET이란? URL에 DATA를 태워서 보내는 전송 방식으로, 암호 등 보안상 중요한 DATA는 URL 상에서 표시 되지 않는 POST 방식 전송이 권장 된다.
        type: "GET",

        //DATA TYPE
        //JSON
        dataType: "json",

        //요청 성공시 (SUCCESS)
        success: function(data){

            //arrival 도착 관련 변수 선언
            let arrival = data.realtimeArrivalList;

            for(let i=0; i<arrival.length; i++){
                let train=arrival[i];

                //console에 로그 출력
                console.log('Train'+(i+1)+'-Line'+ train.subwayid+",Destination"
                +train.trainLineNm+', Arrival Time' + train.arrivalTime);
            }
        },

        //요청 중, error 발생 시,
        error:function(jqXHR,textStatus,errorThrown) {

            //console에 로그 출력
            console.log('Error:'+TextStatus+"-"+errorThrown);
        }
    })
})