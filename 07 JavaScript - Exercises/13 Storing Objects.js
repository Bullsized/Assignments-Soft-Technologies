/**
 * Created by Bullsized on 27-Jul-17.
 */
function store(params) {
    let solution = [];
    for (let i = 0; i < params.length; i++) {
        let splitStudent = params[i].split(" ");
        let student = {}
        student.Name = splitStudent[0];
        student.Age = splitStudent[2];
        student.Grade = splitStudent[4];
        solution.push(student);
    }

    for (let i = 0; i < solution.length; i++) {
        console.log(`Name: ${solution[i].Name}` + "\n" +
            `Age: ${solution[i].Age}` + "\n" +
            `Grade: ${solution[i].Grade}`)
    }
}

store(["Pesho -> 13 -> 6.00", "Ivan -> 12 -> 5.57", "Toni -> 13 -> 4.90"])