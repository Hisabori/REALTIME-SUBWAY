

var mapContainer = document.getElementById('map'),// 지도를 표시할 div



//교통정보에 대해,traffic 변수선언
//let traffic = trafficMap.addOverlayMapTypeId(kakao.maps),   

    mapOption = { 
        center: new kakao.maps.LatLng(37.566826, 126.9786567), // 지도의 중심좌표
        level: 3, // 지도의 확대 레벨
    };
    var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
      // 지도에 교통정보를 표시하도록 지도타입을 추가합니다
    map.addOverlayMapTypeId(kakao.maps.MapTypeId.TRAFFIC);


let kmap_ps =  new kakao.maps.services.Places();

kmap_ps.keywordSearch('회룡역', placesSearchCB);

//장소 검색 완료 시 -> CALLBACK
function placesSearchCB(data,status,pagination){
    if (status == kakao.maps.status.OK){

    let bounds = new kakao.maps.LatLngBounds();

    for (let i=0; i<data.length; i++){
        displayMarker(data[i]);
        bounds.extend(new kakao.maps.LatLng(data[i].y,data[i.x]));
    }
        map.setBonus(bounds);
    }
} 

function displayMarker(place){
    let marker = new kakao.maps.Marker({
        map:map, position: new kakao.mpas.LatLng(place.y, place.x)
    });
    
kakao.maps.event.addListener (marker , 'click', function (){
    //터치 시 출력
    infowindow.setContenet('<div style="padding:5px; font-size:12px">'+place.place_name+'</div>');
    infowindow.open(map,marker);
});

 
// 아래 코드는 위에서 추가한 교통정보 지도타입을 제거합니다
// map.removeOverlayMapTypeId(kakao.maps.MapTypeId.TRAFFIC);    
