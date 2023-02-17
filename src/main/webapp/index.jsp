<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/views/common/header.jsp"/>
	<div class="날씨">
		<div class="온도"></div>
	</div>
	<div class="통행량">
		<script type="text/javascript"
			src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6addc77876daf887b6419b3889757dbd
        "></script>
		<div id="map" style="width: 100%; height: 350px;"></div>
		<script src="../mainpage/JS/TEST.JS"></script>

	</div>
	<div class="예상-소요시간"></div>
<jsp:include page="/views/common/footer.jsp" />