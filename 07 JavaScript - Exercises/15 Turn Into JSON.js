/**
 * Created by Bullsized on 27-Jul-17.
 */
function turnIntoJSON(data) {
    let object = {};
    for(let pair of data) {
        let tokens = pair.split("->");
        let key = tokens[0].trim();
        let value = tokens[1].trim();
        if(!isNaN(value)) {
            value = parseFloat(value);
        }
        object[key] = value;
    }

    let json = JSON.stringify(object);
    console.log(json);
}

turnIntoJSON(["name -> Angel", "surname -> Georgiev", "age -> 20", "grade -> 6.00", "date -> 23/05/1995", "town -> Sofia"]);