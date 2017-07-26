/**
 * 75/100, only Judge knows why.
 */
function solve(args) {

    let limit = Number(args);

    let solution = "";

    for (let i = 1; i <= limit; i++) {

        let toString = i.toString();

        let lamp = false;

        for (let j = 0; j < toString.length / 2; j++) {
            if (toString[j] === toString[toString.length - 1 - j]) {
                lamp = true;
            } else {
                break;
            }
        }
        if (lamp === true) {
            solution += i + " ";
        }
    }

    console.log(solution)
}

//test #2:
solve(750);