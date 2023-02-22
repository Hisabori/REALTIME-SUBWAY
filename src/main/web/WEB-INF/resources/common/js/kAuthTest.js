alert('test');

//jquery 사용
//코드 로딩 후 실행
$(document).ready(function() {

    //초기화
    //미사용
    //<a href="kakao_auth.html" id ="KAuthTest"></a>
        Kakao.init('key');

        $('kAuthTest').click(function(){

            //ajax 사용
            $.ajax({
                url: "https://kauth.kakao.com/oauth/authorize",
                data: {
                    //kakao_api_key
                    client_id: 'apikey;', //api key,

                    //test
                    //let redirect_url  = "";
                    redirect_url: 'http//127.0.0.1:8080',//redirect,


                    //live
                    //redirect_uri: shuwebpc.com


                    //사용자 프로필 조회
                    response_type: 'code',
                    scope: 'profile',
                },
                //성공 시
                success: function (response) {

                    //F12 DEV TOOL에 콘솔로 출력
                    //response 값 출력
                    console.log(response);

                    let auth_code = prompt()//키

                    //kakao 인증 server 접근
                    $.ajax({
                        url: 'https://kauth.kakao.com/oauth/token',
                        data: {
                            grant_type: 'authorization_code',
                            client_id: 'api-key-입력',  //<-- kakao js key
                            redirect_url: '127.0.0.1:8080',
                            code: 'authorization_code',

                        },

                        //성공 시
                        success: function (response) {
                            //response test
                            console.log(response);

                            let auth_code= prompt();

                            $.ajax({
                                //kakao api
                                url: 'https://kapi.kakao.com/v2/user/me',



                                headers: {
                                    Authorization: 'test' + response.access.token,

                                    //성공 시:
                                    success: function (response)
                                    {
                                        //kakao 로그인 성공 시

                                        //response값을 아래 링크로 전달

                                        //로그
                                        console.log(response);


                                        //test_ver
                                        this.href('http://localhost:8080/success');

                                        //live_server
                                        this.href('https://shuwebpc.com/livesubway/login/success')
                                    },
                                    //실패 시
                                    error: function (error) {
                                        console.log(error)
                                        alert(error.httpErrorResponse);
                                    }
                                }
                            })
                        }
                    });
                }
            });
        });
        });