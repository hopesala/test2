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
 <s:form action="adjust1">
<center><h1><font color="scarlet">
Please input the information of the book</font></h1></center>

<s:textfield name="tmpISBN"  label = "ISBN" style="background:grey;width:800px;height:40px;font-size:20px;"/> 
<s:textfield name="tmpTitle"  label = "Title" style="background:grey;width:800px;height:40px;font-size:20px;"/> 
<s:textfield name="tmpAuthorID"  label = "AuthorID" style="background:grey;width:800px;height:40px;font-size:20px;" /> 
<s:textfield name="tmpPublisher"  label = "Publisher" style="background:grey;width:800px;height:40px;font-size:20px;" />  
<s:textfield name="tmpPublishDate"  label = "PublishDate" style="background:grey;width:800px;height:40px;font-size:20px;"/>  
<s:textfield name="tmpPrice"  label = "Price" style="background:grey;width:800px;height:40px;font-size:20px;"/> 
<s:submit/>
</s:form>
</body>
</html>