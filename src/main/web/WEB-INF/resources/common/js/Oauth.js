$(document).ready(function() {
    $('#OauthTest');
    let kAuthTest = $('#OauthTest');
    kAuthTest.click();
    alert('kakaoAuthTest');

    //kauthReq로 request
    let KauthReq = $('#kAuthTest');
    KauthReq.$.ajax({
        type: 'get',
        uri: "/Oauth.do",
        success: function(data){
            console.log(data);
        let KauthRes =(data.response)
        KauthRes.location.href=("/Oauth.do");
    }
})
})