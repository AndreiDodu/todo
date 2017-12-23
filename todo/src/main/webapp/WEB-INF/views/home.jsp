<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	To Do
</h1>

<P> 
<c:url var="url" value="/" />
<form:form action="${url}" method="post"  modelAttribute="todo">
<label>To do</label>
<form:input path="todo" />
<input type="submit" value="Salva"/>
</form:form>
</P>
</body>
</html>
