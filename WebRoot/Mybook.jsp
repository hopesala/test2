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
    
    <title>My JSP 'Mybook.jsp' starting page</title>
    
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
  <table border="1">
		<tr>
			<th>day</th>
			<th>time</th>
			<th>teachername</th>
			<th>delete</th>
		</tr>
		<s:iterator value="list4" id="number">
			<tr>
				<td><s:property value="#number.day" />
				</td>
				<td><s:property value="#number.time" /> 
				</td>
				<td>
				<s:property value="#number.teachername" /> 
				</td>
				<td>
				<a href='<s:url action="delete1">
  <s:param name ="tmpstudentid" value = "#number.studentid"></s:param>
    <s:param name ="tmpteachertimeid" value = "#number.teachertimeid"></s:param>
        <s:param name ="tmptime" value = "#number.time"></s:param>
           </s:url>'>
						Delete</a></td>
			</tr>

		</s:iterator>
	</table>
	 <input type="button" value="Return" onclick="window.location.href='userpage.jsp'"  style="background:skyBlue;width:150px;height:40px;font-size:20px;">
    
  </body>
</html>
