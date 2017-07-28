<ul>
    <?php
    for ($cycle = 1; $cycle <= 20; $cycle++) {
        if ($cycle % 2 == 0) {
            $color = "green";
        } else {
            $color = "blue";
        }

        echo "<li><span style='color: $color'>$cycle</span></li>";

    }
    ?>
</ul>
