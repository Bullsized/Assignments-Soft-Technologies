/**
 * Created by Bullsized on 26-Jul-17.
 */
function setValues(parameters) {
    let limit = Number(parameters[0]);

    let solution = new Array(limit).fill(0);

    for (let i = 1; i < parameters.length; i++) {
        let paramsSplit = parameters[i].split(" ");
        let index = Number(paramsSplit[0]);
        let digit = Number(paramsSplit[2]);

        solution[index] = digit;
    }

    console.log(solution.join("\n"));
}

//setValues(["5", "0 - 3", "3 - -1", "4 - 2"]);

//when I write a comment inside the function, the program explodes.
//when I try to split by (' ') sometimes the program explodes.
//when I try to .splice some of the answers come out wrong.
//when I try to split by more than just " " (e.g. "-") the program explodes.
//when I searched how to give length to an array, everybody was laughing in stackoverflow.
//when I didn't fill it with zeros, answers came out wrong.
