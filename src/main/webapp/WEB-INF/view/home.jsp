<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div>
    <h1>You are home</h1>
    <%--<form method="post">--%>
        <%--First name is <input type="text" name="name"/><br/>--%>
        <%--Second name is <input type="text" name="secondName"/><br/>--%>
        <%--age is <input type="text" name="age"/><br/>--%>
        <%--<input type="submit" value="Register">--%>
    <%--</form>--%>
    <f:form method="post" commandName="user" action="/postUser">
        <f:input path="name"/><br/>
        <f:input path="secondName"/><br/>
        <f:input path="age"/><br/>
        <input type="submit" value="Register">
    </f:form>
</div>
</body>
</html>
