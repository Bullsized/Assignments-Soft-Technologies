<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style>
</head>
<body>
<?php
    $spankMe = 0;
    for ($cycle = 0; $cycle < 5; $cycle++)
    {
        for ($cycle2 = 0; $cycle2 < 10; $cycle2++)
        {
            echo "<div style='background-color: rgb($spankMe, $spankMe, $spankMe)'></div>";
            $spankMe+=5;
        }
        echo "<br/>";
        $spankMe+=1;
    }
?>
</body>
</html>