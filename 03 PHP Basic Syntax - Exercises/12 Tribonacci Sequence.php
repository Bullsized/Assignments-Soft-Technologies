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
        $x = 1;
        $y = 1;
        $z = 2;
        echo $x . " " . $y . " " . $z . " ";
        for ($cycle = 0; $cycle < $num - 3; $cycle++)
        {
            $sum = $x + $y + $z;
            echo $sum . " ";
            $x = $y;
            $y = $z;
            $z = $sum;
        }
    }
?>
</body>
</html>