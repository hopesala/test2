<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <s:form action="edit" method="post">



 <s:textfield name="tmpteachertimeid"  label = "teachertimeid" style="background:skyBlue;width:400px;height:40px;font-size:20px;"/> 
<s:textfield name="tmptime1"  label = "time1" style="background:skyBlue;width:400px;height:40px;font-size:20px;"/> 
<s:textfield name="tmptime2"  label = "time2" style="background:skyBlue;width:400px;height:40px;font-size:20px;"/> 
<s:textfield name="tmptime3"  label = "time3" style="background:skyBlue;width:400px;height:40px;font-size:20px;"/> 
<s:textfield name="tmptime4"  label = "time4" style="background:skyBlue;width:400px;height:40px;font-size:20px;"/>  
<input type="button" value="Return" onclick="window.location.href='index.jsp'"  style="background:White;width:400px;height:40px;font-size:20px;">
<s:submit/>
</s:form>

</body>
</html>