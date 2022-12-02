<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<body>

<h2>You are welcome!</h2>
<br>
<br>

<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br>
<br>
Your surname: ${employee.surname}
<br>
<br>
Your salary: ${employee.salary}
<br>
<br>
Your department: ${employee.department}
<br>
<br>
Your carBrand: ${employee.carBrand}
<br>
<br>
Your foreign language(s):

<ul>
<c:forEach var="lang" items="${employee.languages}">
    <li> ${lang}   </li>
</c:forEach>
</ul>

<br>
<br>
Your phoneNumber: ${employee.phoneNumber}

<br>
<br>
Your carBrand: ${employee.email}

<br>
<br>
<a href="askDetails" >back</a>


</body>
</html>