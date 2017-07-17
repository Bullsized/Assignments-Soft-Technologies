<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
    $four = 4;
    $nine = 9;
    for ($cycle = 1; $cycle < 10; $cycle++)
    {
        for ($cycle2 = 1; $cycle2 < 6; $cycle2++)
        {
            if ($cycle == 1 || $cycle == 5 || $cycle == 9)
            {
                echo "<button style=\"background-color: blue\">1</button>";
            }
            else if ($cycle == 2 || $cycle == 3 || $cycle == 4)
            {
                if ($cycle2 == 1)
                {
                    echo "<button style=\"background-color: blue\">1</button>";
                }
                else
                {
                    echo "<button>0</button>";
                }
            }
            else
            {
                if ($cycle2 == 5)
                {
                    echo "<button style=\"background-color: blue\">1</button>";
                }
                else
                {
                    echo "<button>0</button>";
                }
            }
        }
        echo "<br/>";
    }
?>
</body>
</html>