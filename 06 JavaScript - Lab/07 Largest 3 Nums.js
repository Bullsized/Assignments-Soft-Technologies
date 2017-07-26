/**
 * Created by Bullsized on 26-Jul-17.
 */
function solve(args) {
    let sortedNums = args.sort((a, b) => b - a);
    let cycleTo = Math.min(sortedNums.length, 3)
    for (i = 0; i < cycleTo; i++) {
        console.log(sortedNums[i]);
    }
}

//solve([10, 30, 15, 20, 50, 5])
//solve([10, 20])
solve([10, 5, 20, 3, 20])