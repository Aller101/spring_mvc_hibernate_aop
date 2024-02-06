<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>--%>
<!doctype html>
<html>
    <head>
        
    </head>
    <body>
        <h2>All Employees</h2>
        <br><br>
        
        <table>
            
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Department</th>
                <th>Salary</th>
            </tr>
            
            <c:forEach var="emp" items="${allEmps}">
                <tr>
                    <td>${emp.name}</td>
                    <td>${emp.surname}</td>
                    <td>${emp.department}</td>
                    <td>${emp.salary}</td>
                </tr>
                
            </c:forEach>
            
        </table>
        
    </body>
</html>