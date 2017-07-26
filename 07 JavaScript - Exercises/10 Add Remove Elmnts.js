/**
 * Created by Bullsized on 27-Jul-17.
 */
function rearrangeArray(command) {
    let solution = [];
    for (let i = 0; i < command.length; i++) {
        let splittedCommand = command[i].split(" ");
        let argument = splittedCommand[0];
        let elementOrIndex = splittedCommand[1];

        if (argument === "add") {
            solution.push(elementOrIndex);
        } else {
            solution.splice(elementOrIndex, 1);
        }
    }

    console.log(solution.join("\n"));
}

//rearrangeArray(["add 3", "add 5", "add 7"]);
//rearrangeArray(["add 3", "add 5", "remove 2", "remove 0", "add 7"]);