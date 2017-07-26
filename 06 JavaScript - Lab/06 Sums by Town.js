/**
 * Created by Bullsized on 26-Jul-17.
 */
function solve(args) {
    let result = {};

    for (let i = 0; i < args.length; i++) {
        let townIncome = JSON.parse(args[i]);

        let name = townIncome.town;
        let income = townIncome.income;

        if (result[name] || result[name] >= 0) {
            result[name] += income;
        } else {
            result[name] = income;
        }
    }

    let sortedByTowns = Object.keys(result).sort();

    for (let i = 0; i < sortedByTowns.length; i++) {
        console.log(`${sortedByTowns[i]} -> ${result[sortedByTowns[i]]}`)
    }
}

solve([
    '{"town":"Sofia","income":200}',
    '{"town":"Varna","income":120}',
    '{"town":"Pleven","income":60}',
    '{"town":"Varna","income":70}'
]);