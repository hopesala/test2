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
    
    <title>My JSP 'Mybook1.jsp' starting page</title>
    
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
			<th>time1(num)</th>
			<th>time2(num)</th>
			<th>time3(num)</th>
			<th>time4(num)</th>
		</tr>
		<s:iterator value="list3" id="number">
			<tr>
				<td><s:property value="#number.week" />
				</td>
				<td><s:property value="#number.time1" /> , <s:property
						value="#number.time1ed" /></td>


				<td><s:property value="#number.time2" /> , <s:property
						value="#number.time2ed" /></td>
		
		
				<td><s:property value="#number.time3" /> , <s:property
						value="#number.time3ed" /></td>

				<td><s:property value="#number.time4" />, <s:property
						value="#number.time4ed" /></td>
						
						<td> <a
					href='<s:url action="input">
    <s:param name ="tmpteachertimeid" value = "#number.teachertimeid"></s:param>
    <s:param name ="tmptime1" value = "#number.time1"></s:param>
     <s:param name ="tmptime2" value = "#number.time2"></s:param>
      <s:param name ="tmptime3" value = "#number.time3"></s:param>
       <s:param name ="tmptime4" value = "#number.time4"></s:param>
    </s:url>'>edit</a></td>
			</tr>

		</s:iterator>
	</table>
	<input type="button" value="Return" onclick="window.location.href='teacherpage.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
  </body>
</html>
