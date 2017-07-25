/**
 * Created by Bullsized on 25-Jul-17.
 */
function threeInts(args) {

    args = args[0].split(' ').map(Number);
    //^ for splitting the array and parsing it into Numbers

    console.log(
        checkForSum(args[0], args[1], args[2]) ||
        checkForSum(args[1], args[2], args[0]) ||
        checkForSum(args[0], args[2], args[1]) ||
        'No'
    );

    function checkForSum(first, second, sum) {
        if (first + second !== sum) {
            return false;
        }

        if (first > second) {
            [first, second] = [second, first];
        }
        //^ swaps the place of first with second

        return `${first} + ${second} = ${sum}`;
    }
}

//test #1: threeInts(['8 15 7']);
//test #2: threeInts(['-5 -3 -2']);
//test #3: threeInts(['3 8 12']);