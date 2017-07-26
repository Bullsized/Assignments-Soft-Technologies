/**
 * Created by Bullsized on 27-Jul-17.
 */
function parseJSON(data) {
    let arrayOfJSON = []
    for (let i = 0; i < data.length; i++) {
        let currentJSON = JSON.parse(data[i]);
        arrayOfJSON.push(currentJSON);
    }

    for (let i = 0; i < arrayOfJSON.length; i++) {
        console.log(`Name: ${arrayOfJSON[i].name}`);
        console.log(`Age: ${arrayOfJSON[i].age}`);
        console.log(`Date: ${arrayOfJSON[i].date}`);
    }
}

parseJSON(['{"name":"Gosho","age":10,"date":"19/06/2005"}', '{"name":"Tosho","age":11,"date":"04/04/2005"}']);