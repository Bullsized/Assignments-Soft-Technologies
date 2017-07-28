<form>
    <div>Name:</div>
    <input type="text" name="personName"/>
    <div>Age:</div>
    <input type="number" name="personAge"/>
    <div>Town:</div>
    <select name="townId">
        <option value="01">Varna</option>
        <option value="02">Balchik</option>
        <option value="03">Sozopol</option>
        <option value="04">Pomorie</option>
    </select>
    <div><input type="submit"/></div>
</form>
<?php var_dump($_GET);
?>