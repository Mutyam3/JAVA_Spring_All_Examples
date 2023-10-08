<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <style>
       h1{
           color:#edd11a ;
           text-align:center;
       }
       
       form{
       margin : 20px;
       }
       
       
       label, input, select{
       margin-bottom: 25px;
       }
       
       
       
       
       fieldset{
       width :40%;
       border:2px solid green;
       display: flex;
       justify-content: center;
       align-items: center;
       position: absolute;
       right:450px;
       top:200px;
       }
       
       label, legend{
           background-color:black;
           color:whitesmoke;
           font-size:23px;
           
       }
       [type = "submit"],[type = "reset"]{
            background-color:#edd11a;
       
       }
       
       
       body{
            background-image: url("https://wallpaperaccess.com/full/343570.jpg");
            background-size: cover;
            
       }
       
       
      
    </style>
    </head>

<header>
<h1>Welcome to our Sports Club</h1>

</header>

<body>
   <div class= "stdform">
   <fieldset>
   
   <legend>Fill the form for to be a member in Sports Club</legend>
   <form action = "studentValues" method= "POST" autocomplete ="on">
           <label for = "stdid"><b>StudentID</b></label>
           <input type = "text" name = "studentId"  id = "stdid">  <br>
           
           <label for = "fname"><b>FirstName</b></label>
           <input type = "text" name = "firstName"  id = "fname">  <br>
             
           <label for = "lname"><b>LastName</b></label>
           <input type = "text" name = "lastName"  id = "lname"> <br>
           
           <label for = "cnum"><b>ContactNumber</b></label>
           <input type = "text" name = "contactNumber" id = cnum> <br>
            
           <label for ="loc"><b>Location</b></label>
           <Select name ="location" id = "loc" >
                  <optgroup label = "Cities">
                     <option value ="Hyderabad">Hyderabad</option>
                     <option value ="vijayawada">Vijayawada</option>
                     <option value ="Bhopal">Bhopal</option>
                     <option value ="Pune">Pune</option>
                     <option value ="Delhi">Delhi</option>
                  </optgroup>
           </Select>  <br>
           
           <input type = "submit" value = "register now"> 
           <input type = "reset"  value = "reset now">
                
   </form>
   </fieldset>
   </div>


</body>
</html>
