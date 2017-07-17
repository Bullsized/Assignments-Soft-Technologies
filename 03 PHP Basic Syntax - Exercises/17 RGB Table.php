<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        table * {
            border: 1px solid black;
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>
            Red
        </td>
        <td>
            Green
        </td>
        <td>
            Blue
        </td>
    </tr>
    <?php
    $fiftyOneCounter = 51;
    for ($cycle = 0; $cycle < 5; $cycle++)
    {
        echo "<tr>
        <td style='background-color: rgb($fiftyOneCounter, 0, 0'></td>
        <td style='background-color: rgb(0, $fiftyOneCounter, 0'></td>
        <td style='background-color: rgb(0, 0, $fiftyOneCounter'></td>
            </tr>";
    $fiftyOneCounter+=51;
    }
    ?>
</table>
</body>
</html>