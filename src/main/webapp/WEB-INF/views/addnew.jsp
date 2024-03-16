<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
</head>
<body>
<form action="save" name="add" method="post">
       <input type="text" name='name' value='' class="control" placeholder="Enter Name"/><br><br>
		 <input type="text" name='email' value='' class="control" placeholder="Enter Email"/><br><br>
		  <input type="text" name='contact' value='' class="control" placeholder="Enter Contact Number"/><br><br>       
         <input type="submit" name='s' value='Add Student Details' class="control"/><br><br>
        
         </form>
</body>
</html>