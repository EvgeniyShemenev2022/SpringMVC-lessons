<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<body>

<h2>Dear Employee, please, enter your details.</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:option value="information Tecnology" label="IT"/>
    <form:option value="human Resourses" label="HR"/>
    <form:option value="sales" label="Sales"/><
    </form:select>
    <br>
    <br>
    Which CAR brand do you want, sir?
    <br>
    <br>
    BMW <form:radiobutton path="carBrand" value="BMV"/>
    MERCEDES<form:radiobutton path="carBrand" value="MERCEDES"/>
    TOYOTA<form:radiobutton path="carBrand" value="TOYOTA"/>
    <br>
    <br>
    Foreign language(s), sir?
    <br>
    <br>
    EN <form:checkbox path="languages" value="English"/>
    RU <form:checkbox path="languages" value="Russian"/>
    IT <form:checkbox path="languages" value="Itallian"/>





<%--    Department <form:input path="department"/>--%>

    <input type="submit" value="OK">

</form:form>


</body>
</html>


<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName"--%>
<%--           placeholder="Write your name"/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>