<?php

/*This example shows SQL Injection attack and possible use of
results of to corrupt the data. The path in the if statement will be 
affected by the tainted results
*/

require "connect.php";

$username = $_POST["uname"];
$password = $_POST["pword"];

$selectstmt = "Select username, password from usermaster where uname = " + $username;
$andcondition = "and pwd = "+$password;

$selectquery = $selectstmt + $andcondition;

$result = mysqli_query($conn,$selectquery);
$numrows = mysqli_num_rows($result);

if ($numrows > 1){
	$updatestmt = "Update usermaster set lastlogin=now()";
	$wherecondition = "where username = "+ $username ;
	$updatequery = $updatestmt + $wherecondition;
	$updateresult = mysqli_query($conn,$updatequery);
	echo "Login Successful";
}
else{
	$loginfailquery = "Update logtable set loginattempt = loginattempt+1 and logintime=now()";
	$loginresult = mysqli_query($conn,$loginfailquery);	
	echo "Login fail";
}

?>