<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "com.poscoict.guestbook.vo.GuestbookVo" %>
<%@ page import = "com.poscoict.guestbook.dao.GuestbookDao" %>	

<%
	request.setCharacterEncoding("utf-8");

		int no = Integer.parseInt(request.getParameter("no"));
		String password = request.getParameter("password");
		
		
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(no);
		vo.setPassword(password);

		new GuestbookDao().delete(vo);
		
		response.sendRedirect("/guestbook01");
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>