<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <th>Operations</th>
            </tr>
            
             
            
            <c:forEach var="emp" items="${allEmps}">
                
                <c:url var="updateBatton" value="updateInfo">
                    <c:param name="empId" value="${emp.id}"/>
                </c:url>
                
                <c:url var="deleteBatton" value="deleteInfo">
                    <c:param name="empId" value="${emp.id}"/>
                </c:url>
                
                <tr>
                    <td>${emp.name}</td>
                    <td>${emp.surname}</td>
                    <td>${emp.department}</td>
                    <td>${emp.salary}</td>
                    <td>
                        <input type="button" value="Update"
                               onclick="window.location.href='${updateBatton}'"/>
                        
                        <input type="button" value="Delete"
                               onclick="window.location.href='${deleteBatton}'"/>
                    </td>
                </tr>
                
            </c:forEach>
            
        </table>
        
        <br><br>
        
        <input type="button" value="Add"
               onclick="window.location.href='addNewEmployee'"/>
        
    </body>
</html>