/**
 * Created by Bullsized on 26-Jul-17.
 */
function solve(args) {
    let firstNum = Number(args[0]);
    let secondNum = Number(args[1]);
    let thirdNum = Number(args[2]);

    let count = 0;
    if (firstNum > 0) count++;
    if (secondNum > 0) count++;
    if (thirdNum > 0) count++;

    if (firstNum == 0 ||
        secondNum == 0 ||
        thirdNum == 0) {
        console.log("Positive");
    } else if (count %2 == 0) {
        console.log("Negative");
    } else {
        console.log("Positive");
    }
}

//solve([-5, -4, 3]);