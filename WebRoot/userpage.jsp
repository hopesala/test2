<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
  <%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userpage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <table>
  <tr>Student's Login</tr>
  </table>
  <input type="button" value="My booking" onclick="window.location.href='list.action'"  style="background:White;width:400px;height:40px;font-size:20px;">
  <input type="button" value="I want to book" onclick="window.location.href='Search.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
  <input type="button" value="Return" onclick="window.location.href='index.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
  </body>
</html>
