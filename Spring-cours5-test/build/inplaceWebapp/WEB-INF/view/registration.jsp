<%--
  Created by IntelliJ IDEA.
  User: AlexX
  Date: 18/11/2020
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h2>Signing up a new user</h2>
    <form:form modelAttribute="registration" >
        <spring:message code="name"/> :<form:input path="name"/>
        <spring:message code="firstname"/> :<form:input path="firstname"/>
        <spring:message code="email"/> :<form:input path="email"/>
        <form:button><spring:message code="submit"/></form:button>
    </form:form>
</body>
</html>
