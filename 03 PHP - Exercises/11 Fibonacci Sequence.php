<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num" />
    <input type="submit" />
</form>
<?php
    if (isset($_GET['num']))
    {
        $num = intval($_GET['num']);
        $x = 0;
        $y = 1;
        echo "1 ";
        for($cycle=0; $cycle <= $num - 2; $cycle++)
        {
            $z = $x + $y;
            echo $z . " ";
            $x = $y;
            $y = $z;
        }
    }
?>
</body>
</html>