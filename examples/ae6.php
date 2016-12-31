<?php
/*This example is created to check control flow graph with nesting,
Free Variables and RD Analysis*/

$y=1+2;
while ($y>0){
  if ($x > 2){
	echo $x;
	}
   else{
	echo $y;
	}
	$y = $y - 1;
}
echo $y;

?>