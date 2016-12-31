<?php

/*Example to show sample code which might be used in SQL injection attack
Input values for username and password through POST is assigned to variables 
and used in the SQL statement*/

$username = $_POST["uname"];
$password = $_POST["pword"];

$selectstmt = "Select * from usermaster where uname = " + $username;
$andcondition = "and pwd = "+$password;

$selectquery = $selectstmt + $andcondition;

echo $selectquery;

?>