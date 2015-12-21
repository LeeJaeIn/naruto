<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<main class="main">
<h2>고객 센터</h2>

<div>
	<form id="cuscenter-search" class="article-search-form"
		action="cuscenter.jsp" method="get">
		<fieldset>
			<legend class="hidden"> 목록 검색 폼 </legend>
			<input type="hidden" name="pg" value="" /> <label for="f"
				class="hidden">검색필드</label> <select name="f">
				<option value="TITLE">전체 항목</option>
				<option value="CONTENT">제목</option>
				<option value="CONTENT">제목+내용</option>
				<option value="CONTENT">내용</option>
				<option value="CONTENT">작성자</option>
			</select> <label class="hidden" for="q">검색어</label> <input type="text"
				name="q" value="" /> <input type="submit" value="검색" />
		</fieldset>
	</form>

</div>

<div id="cuscenter-menu">
	<dl>
		<a href="">FAQ</a>
	</dl>
	<dl>
		<a href="">문의하기</a>
	</dl>
	<dl>
		<a href="">회원신고</a>
	</dl>
	<dl>
		<a href="">도움말</a>
	</dl>
	<dl>
		<a href="">회사소개</a>
	</dl>
	<dl>
		<a href="">앱 설치</a>
	</dl>

</div>

</main>