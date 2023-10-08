<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

    Integer empId = (Integer)request.getAttribute("empId"); // need to type cast as we get the data as in String format.
    String empFirstName = (String)  request.getAttribute("empFisrtName");
    String empLastName = (String)  request.getAttribute("empLastName");
    Long empContactNumber = (Long)  request.getAttribute("empContactNumber");
    String empLocation = (String) request.getAttribute("empLocation");
        
        
      out.print(empId); 
      out.print(empFirstName);
      out.print(empLastName);
      out.print(empContactNumber);
      out.print(empLocation);
     

%>



</body>
</html>