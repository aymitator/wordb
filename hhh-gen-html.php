<!DOCTYPE html>
<html>
<body>
<table>
<?php
$data = array(
//DATA_START
array(1,"godliness","bible","he was great"),
array(strlen("ii"),"holiness","bible",""),
array(strlen("iii"),"shew","bible","he shewed my awesomeness"),
//DATA_AYNDH
);
$i = 0;
while($i < count($data)) {
echo "<tr><td>" .
$data[$i][0] .
"</td><td>" .
$data[$i][1] .
"</td><td>" .
$data[$i][2] .
"</td><td>" .
$data[$i][3] .
"</td></tr>";
$i++;
}
?>
</table>
</body>
</html>
