$(document).ready(function () {

    //kAPI초기화
    Kakao.init('apikey');

    //카카오 로그인 버튼을 클릭할 경우, 클릭 함수+KAKAO 로그인 프로세스 시작

    //프로세스 진행과정
    //1. 카카오 로그인 버튼은, $('#Kauth_Login_req)(A) 의 값을 가진다.
    //2. (1)을 클릭하면 (1) 의 클릭 이벤트인 "(A).click(function(){}" 가 동작한다. .
    //3. 실행 과정에서 몇 가지 변수/ 함수를 생성한다. 내용은 아래와 같다.
    //3-1. (let 변수) req: $('#Kauth_Login_Req) 를 글자 수를 줄여 사용하기 위해 만들어 진 변수이다.
    //3-2. (현재 미사용 /let 변수) KAuthSuccess = $('#Kath_Login_Res').succesful_requsets. 즉, 성공 시에 사용한다)
    //3-3. (현제 미사용 /let 변수) KAuthError = 3-2와 달리, 실패 시 사용한다.
    //4. 요청에 성공하면, 함수 KauthSuccess를 생성한다.
    //5. (4) 번의 함수는 memberJoin.jsp로 값을 전달한다.
    //6. 만약, 로그인 프로세스가 실패하면 error발생 및 index.jsp로 리턴시킨다.

    $('#Kauth_Login_Req').click(function () {

        let req = $('#Kauth_Login_Req')

        //let kAuthSuccess = $('#Kauth_Login_Res').successful_requests;

        //let KAuthError = $('#Kauth_Login_Res').failed;

        //KauthSuccess 성공 / 실패 처리

        //1. 카카오 인증에 성공할 경우  (KauthSuccess)

        //23-02-24 success 대신 done으로 변경
        if (req.done(function KauthSuccess() {

            //다음 값을 전달한다.
            location.href = "../memberJoin.jsp"
        })){

            //2. 카카오 인증에 문제가 있거나 기타 오류가 발생할 경우 (error)
        } else {
            alert("error");

            //index로 넘긴다
            return{
            fail: function () {
                return "./index.jsp";
            }
        }
    };



    //KauthLoginProc = Nomal_Service
    //카카오 로그인 프로세스가 성공할 경우 (Nomal_Service), 엑세스 토큰을 서버로 던짐
    //Jquery Ajax를 사용함



    $.ajax({
        //TEST (localhost 사용) / port 8080

        //Kauth 성공시
        //localhost:8080/Realtime_Subway 에서 결과를 /KauthLoginSuccess로 전달
        //값을 전달받으면, 카카오 로그인 진행
        url: 'http://localhost:8080/RealTime_Subway/KauthLoginSuccess',

        //POST 방식으로 값을 전달
        type: 'POST',

        //-------------------------------------------------------------------------------------------
        //23-02-24 추가 : async false (기존: async: true)
        //ajax 요청 완료 시 까지 대기 하기 위해, async 값을 false 로 설정함
        //async 값이 true 일 경우, 요청 처리 전 에러가 발생할 수 있음. 이 문제를 해결 하기 위해, 값을 수정 하였음.
        async: false,
        //--------------------------------------------------------------------------------------------

        //엑세스 토큰을 받는다
        data: {
            access_token: $KauthSuccess.access_token
        },

        //서버에서 로그인 결과를 던지면, 이를 받아 처리한다  / dataType: 'json',
        done: function (result) {

        },

        //에러일경우 아래 코드로 에러를 처리함.
        //02.24 error를 상세한 에러 처리를 위해 fail로 변경함
        fail: function (xhr, status, error) {

        }
    })
});
});

