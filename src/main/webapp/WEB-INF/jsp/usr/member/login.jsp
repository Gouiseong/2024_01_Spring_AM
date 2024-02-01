<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="MEMBER ROGIN"></c:set>
<%@ include file="../common/head.jspf"%>

<section class="border=1">

	<form>
		<p>
		<div>
			아이디
			<input type="text" name="name" value="">
		</div>

		</p>
		<p>
		<div>
			비밀번호
			<input type="password" name="password" value="">
		</div>

		</p>
		<p>
			<input type="submit" value="로그인">
		</p>
	</form>
</section>

<%@ include file="../common/foot.jspf"%>