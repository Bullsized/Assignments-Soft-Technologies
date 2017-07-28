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
    if(isset($_GET['num']))
    {
        $num = intval($_GET['num']);
        for ($cycle = $num - 1; $cycle > 0; $cycle--)
        {
            $num *= $cycle;
        }
        echo $num;
    }
?>
</body>
</html>