<taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"></taglib>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding= "UTF-8"%>
<script src="${ContextPath}"></script>
<script>alert("stap1")</script>
<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6addc77876daf887b6419b3889757dbd"></script>
<jsp:include page="WEB-INF/views/common/header.jsp"/>
	<div class="날씨">
		<div class="온도"></div>

		<script>alert("stap2")</script>

	</div>
	<div class="통행량">

		<div id="map" style="width: 100%; height: 350px;">

			<script>
				<%@include file="WEB-INF/resources/common/api/js/map/service/service.js"%>
			</script>
		</div>

		<script>alert("stap3")</script>

		<script src="WEB-INF/resources/common/js/bootstrap/cdn/bootstrap.js"></script>

		<script>alert("stap4")</script>

	</div>
	<div class="예상-소요시간"></div>


<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>


<!--kauthTest-->
<!--Oauth-->
<ul>
	<li onclick="kakaoLogin();">
		<a href="javascript:void(0)">
			<span>카카오 로그인</span>
		</a>
	</li>
	<li onclick="kakaoLogout();">
		<a href="javascript:void(0)">
			<span>카카오 로그아웃</span>
		</a>
	</li>
</ul>
<!-- 카카오 스크립트 -->
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<script>
	Kakao.init('6addc77876daf887b6419b3889757dbd'); //발급받은 키 중 javascript키를 사용해준다.
	console.log(Kakao.isInitialized()); // sdk초기화여부판단
	//카카오로그인
	function kakaoLogin() {
		Kakao.Auth.login({
			success: function (response) {
				Kakao.API.request({
					url: '/v2/user/me',
					success: function (response) {
						console.log(response)
					},
					fail: function (error) {
						console.log(error)
					},
				})
			},
			fail: function (error) {
				console.log(error)
			},
		})
	}
	//카카오로그아웃
	function kakaoLogout() {
		if (Kakao.Auth.getAccessToken()) {
			//kAPI호출
			Kakao.API.request({
				url: '/v1/user/unlink',
				success: function (response) {
					console.log(response)
				},
				fail: function (error) {
					console.log(error)
				},
			})
			Kakao.Auth.setAccessToken(undefined)
			return response (kakaoLogin());
		}
	}
</script>



<button onclick="location.href='${contextPath}/src/main/web/WEB-INF/views/member/Oauth/Oauth_Resp_Test/OauthRespTest.jsp'">button</button>
<button id="OauthTest" onclick="/Oauth.do"></button>

<jsp:include page="WEB-INF/views/common/footer.jsp" />

<script>alert("stap5")</script>