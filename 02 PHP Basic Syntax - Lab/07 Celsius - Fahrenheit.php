<?php
function celToFahr(float $celsius): float
{
    return $celsius * 1.8 + 32;
}

function fahrToCel(float $fahren): float
{
    return ($fahren - 32) / 1.8;
}

$msgAfterCelsius = "";
if (isset($_GET['cel'])) {
    $cel = floatval($_GET['cel']);
    $fah = celToFahr($cel);
    $msgAfterCelsius = "$cel &deg;C = $fah &deg;F";
}

$msgAfterFahren = "";
if (isset($_GET['fah'])){
    $fah = floatval($_GET['fah']);
    $cel = fahrToCel($fah);
    $msgAfterFahren="$fah &deg;F = $cel &deg;C";
}
?>
<form>Celsius: <input type="text" name="cel" /><input type="submit" value="Convert"> <?= $msgAfterCelsius ?>
</form>
<form>Fahrenheit: <input type="text" name="fah" /><input type="submit" value="Convert"> <?= $msgAfterFahren ?>
</form>