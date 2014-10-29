<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyJsp.jsp' starting page</title>

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

	<center>
		<h1>
			<font color="scarlet">The Result is:(and click to view
				details) <s:property value="name" />
			</font>
		</h1>
	</center>
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
						value="#number.time1ed" /> <a
					href='<s:url action="book">
  <s:param name ="tmpday" value = "#number.day"></s:param>
    <s:param name ="tmpteachertimeid" value = "#number.teachertimeid"></s:param>
        <s:param name ="tmptime" value = "1"></s:param>
    </s:url>'>
						book</a></td>


				<td><s:property value="#number.time2" /> , <s:property
						value="#number.time2ed" /> <a
					href='<s:url action="book">
					<s:param name ="tmpday" value = "#number.day"></s:param>
    <s:param name ="tmpteachertimeid" value = "#number.teachertimeid"></s:param>
        <s:param name ="tmptime" value = "2"></s:param>
    </s:url>'>
						book</a></td>
				<td><s:property value="#number.time3" /> , <s:property
						value="#number.time3ed" /> <a
					href='<s:url action="book">
					<s:param name ="tmpday" value = "#number.day"></s:param>
    <s:param name ="tmpteachertimeid" value = "#number.teachertimeid"></s:param>
        <s:param name ="tmptime" value = "3"></s:param>
    </s:url>'>
						book</a></td>
				<td><s:property value="#number.time4" />, <s:property
						value="#number.time4ed" /> <a
					href='<s:url action="book">
					<s:param name ="tmpday" value = "#number.day"></s:param>
    <s:param name ="tmpteachertimeid" value = "#number.teachertimeid"></s:param>
        <s:param name ="tmptime" value = "4"></s:param>
    </s:url>'>
						book</a></td>
			</tr>

		</s:iterator>
	</table>
	 <input type="button" value="Return" onclick="window.location.href='userpage.jsp'"  style="background:skyBlue;width:150px;height:40px;font-size:20px;">
</body>
</html>
