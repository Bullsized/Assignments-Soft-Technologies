function solve(args) {
    let numOne = Number(args[0]);
    let numTwo = Number(args[1]);

    if (numTwo >= numOne) {
        console.log(numTwo * numOne);
    } else {
        console.log(numOne / numTwo);
    }
}

solve([144, 12]);