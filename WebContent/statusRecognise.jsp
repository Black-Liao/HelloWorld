<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="shenfenshibie">
		<font color="red">${requestScope.error}</font>
		<form action="StatusRecogniseAction" method="get">
			<p>员工编号： <input type="text" name="employeeID" value="${param.employeeID }"/></p>
			<p> &nbsp;</p>
			<p>系统口令： <input type="password" name="password"/></p>
			<p><input type="submit" value="提交" />
			<input type="reset" value="重置"/>
			</p>
			
		</form>
	</div>

</body>
</html>