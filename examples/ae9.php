<?php

/*Example code similar to previous ae7.php. Here we are using
if then else on $numrows 
if login is successul then SQL injection attack occurs.*/

require "connect.php";

$username = $_POST["uname"];
$password = $_POST["pword"];

$selectstmt = "Select username, password from usermaster where uname = " + $username;
$andcondition = "and pwd = "+$password;

$selectquery = $selectstmt + $andcondition;

$result = mysqli_query($conn,$selectquery);
$numrows = mysqli_num_rows($result);

if ($numrows > 0) {
   $username="admin";
   echo "Login successful";
}
else {
   echo "Login failed";
}
echo $username;

?>