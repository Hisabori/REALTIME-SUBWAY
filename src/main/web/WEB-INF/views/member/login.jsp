
<!--
//---------------------------------Build Information--------------------------------//
// Build specific information
// IDE = IntelliJ IDEA
// OS = Windows 11 / MAC OS
// API = Kakao API
// Build by = HAN JEONGHUN
// First build date = FEB 27 2023 12:45 KST @ shadow
//
// ----------------------------------Change Log-----------------------------------------
//
//27 Feb 2023
//
//Changes Log: 12:00 JS파일 최적화 진행 중
//Changes Log: 15:00 KauthLoginService 구현 중
//Changes Log: 15:17 ContextPath 지정
//Changes Log: 15:30 taglib Setting
//Changes Log: 16:00 Test 를 위한 Kakao Social Login Process 간단 구현
//Changes Log: 16:05 footer 설정
//Changes Log: 16:12 현제 Page 최적회 작업 진행 중
//Changes Log: 16:17 header 설정
//
//Commit: 27 Feb 2023 17:12
//
//
//
//28 Feb 2023
//
//코딩 후, 진행 내용 입력
//
//------------------------------------------------------------------------------------//
-->

<!--KauthService-->
<!--
//----------------------------------------------------------------------------------//
// 아래는 카카오 로그인 process 과정 이다.
// 1. index.jsp 측에서 상단 버튼을 눌러 로그인 을 진행 한다.
// 2. 로그인 버튼을 클릭 한 사용자는 KakaoLoginService로 연결된다.
// 3. KakaoAuthToken 을 발급 받는다. (참고: api token 을 request 하는 방식에 따라, proc 가
//    달라진다.
// 4. Authentication Token 을 전달 받으면, KakaoLogin 이 진행 된다.
// 5. 사용자 정보른 리턴 받고, 로그인이 진행 된다.
//-----------------------------------------------------------------------------------
-->

<!--Header 지정(16:17)-->
<jsp:include page="/views/common/header.jsp"/>

<!--ContextPath지정 (15:17)-->
<jsp:useBean id="contextPath" class="java.lang.String" scope="request"/>
<c:set var="ContextPath" value="${pageContext.request.ContextPath}" />

<!--taglib settings(15:30)-->
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<!--경로 지정(15:30)-->
<script src="${ContextPath}/src/main/web/WEB-INF/"></script>

<!--code info-->
<%@page language="java" contentType="text/html; charset=utf-8"
        pageEncoding="UTF-8"%>

<input type="button" value="KauthTestButton" onclick='var KauthProc'>

<jsp:include page="'${ContextPath}'views/common/header.jsp"/>

/-----------------------------------------------------------------------------------------------------------------/


<!--KauthTest(16:00)-->
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

<script></script>



---------------------------------------------------------------------------------//

<!--footer(16:05)-->
<jsp:include page="views/common/footer.jsp"/>