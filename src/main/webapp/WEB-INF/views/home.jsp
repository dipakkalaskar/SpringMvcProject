<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="<c:url value="/resources/style.css"/>" rel="stylesheet">
    </head>
    <body>
    <form action="validate" name="frm" method="post">
       <input type="text" name='name' value='' class="control"/><br><br>
        <input type="password" name='pass' value='' class="control"/><br><br>
         <input type="submit" name='s' value='Login' class="control"/><br><br>
         <span>${msg}</span>
         </form>
    </body>
</html>
