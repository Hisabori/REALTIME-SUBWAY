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

