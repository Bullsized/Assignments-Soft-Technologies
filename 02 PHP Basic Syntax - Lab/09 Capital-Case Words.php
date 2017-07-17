<?php
if(isset($_GET['text'])) {
    $text = $_GET['text'];
    preg_match_all('/\w+/', $text, $words);
    $words = $words[0];
    $upperWords = array_filter($words,
        function($word){
        return strtoupper($word) == $word;
    });
    $result = implode(', ', $upperWords);
} ?>

<form><textarea name="text" rows="10"><?php
        if (isset($result)) {
            echo $result;
        }
        ?></textarea><input type="submit" value="To Upper!"/></form>


