## SQL injection detection in PHP code

A java based framework for detecting SQL injection vulnerable sections within PHP code.

#### Project Objectives

The application would provide the programmer warnings indicating the label and the tainted variable which might cause the SQL injection attack. The 3 static analysis questions that project is aimed at answering are:
1. **Initial Taint Analysis (IT)**: For each program point, which user input is available in a variable x, if it has been assigned to x on some path and the value of the variable has not changed since then. This will give at every program point, all the pairs of tainted variables and user input from which variable got tainted (directly tainted from user input).


2. **Tainted Variable Analysis (TV)**: For each program point, which assignments may have been made using the initial tainted variables and not later overwritten, when program execution reaches this point along some path. This will give at every program point, all the pairs of tainted variables and variable from which they got tainted (either directly from user input or indirectly from prior tainted variable).


3. **Taint Location Analysis (TL)**: For each program point, which variables and their location where they might be tainted and were not sanitized when the program execution reaches this point along some path. This will give at every program point, all the pair of tainted variables and the labels at which variable got tainted.


These three analysis combined are used to determine the **SQL-Injection Attack (SA) analysis**: For each program point where the SQL statement is invoked, which tainted variable may have been used in the SQL statement that might cause SQL-Injection attack. The analysis provides the complete chain of tainted variables along with their labels at which this variable used in the SQL statement got tainted.

#### Folder structure

| Folder        | Description   													|
| :-----------: |:------------------------------------------------------------------|
| [AST](https://github.com/vishnu45/SQL-injection-detection/tree/master/AST)		| contains all the generated AST files			|
| [apps](https://github.com/vishnu45/SQL-injection-detection/tree/master/apps)     	| contains all the files for printing outputs 	|
| [examples](https://github.com/vishnu45/SQL-injection-detection/tree/master/examples) | contains all the php example files used to test the application	|
| [spec](https://github.com/vishnu45/SQL-injection-detection/tree/master/spec)		| contains .ast, .flex, .parser and .jrag files	|
| [tests](https://github.com/vishnu45/SQL-injection-detection/tree/master/tests)	| contains all the JUnit test cases				|
| [utility](https://github.com/vishnu45/SQL-injection-detection/tree/master/utility)| contains all utility functions used			|
| [root](https://github.com/vishnu45/SQL-injection-detection)						| folder with build.xml, .launch files and rest |


#### Application execution

For running the example say ae9.php for SA analysis, example name has to be changed in the phpSA.launch file, then we run phpSA.launch as phpSA. Similarly, other launch files can be used to run other analysis for different examples.

#### Sample run

**Input** (sample PHP code):

```php
<?php
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
```

**Output** (warnings generated):

![Output for ae9.php](https://github.com/vishnu45/SQL-injection-detection/blob/master/results/ae10-warnings.png)

#### Limitations

+ Covered only limited grammar of .php which is sufficient to demonstrate possible SQL-Injection Attack.


+ If tainted variable is used in the Branch Condition, then the entire block of statements related to the branch condition, would be affected. The path taken on basis of this tainted variable could affect the program flow. We only warn the Programmer by indicating if the variable used in the Branch Condition is tainted. Besides this we also show that if the individual statement in the conditional block is tainted. 


+ Any file referenced through “require” statement like connect.php in the example code used, could also have tainted variables. Such referenced files are required to be separately checked for tainted variables and SQL-Injected attack. If such referenced files have tainted variables then the assumption that initial taint location for the program free variables as not defined does not hold good. 

**NOTE**: This work was done as part of the COP5021 - Program Analysis course along with Lavanya Gunasani and [Tripti Gupta](https://www.linkedin.com/in/tripti-gupta-668a0699).