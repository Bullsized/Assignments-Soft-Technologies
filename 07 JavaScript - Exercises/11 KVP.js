/**
 * Created by Bullsized on 27-Jul-17.
 */
function keyValuePair(array) {
    let solution = [];

    for (let i = 0; i < array.length - 1; i++) {
        let currentKVP = array[i].split(" ");
        let keyCurrent = currentKVP[0];
        let valueCurrent = currentKVP[1];

        let KVP = {};
        KVP.key = keyCurrent;
        KVP.value = valueCurrent;
        solution.push(KVP);
    }

    let lastKey = array[array.length - 1];
    let count = 0;
    for (let i = solution.length - 1; i >= 0; i--) {
        if (solution[i].key == lastKey) {
            console.log(solution[i].value);
            count++;
            break;
        }
    }

    if (count == 0) {
        console.log("None");
    }
}

//keyValuePair(["key value", "key eulav", "test tset", "key"]);
//keyValuePair(["3 test", "3 test1", "4 test2", "4 test3", "4 test5", "4"])