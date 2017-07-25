/**
 * Created by Bullsized on 25-Jul-17.
 */
function calculate() {
    let numOne = document.getElementById('num1').value;
    let numTwo = document.getElementById('num2').value;

    let result = Number(numOne) + Number(numTwo);
    console.log(result);
    document.getElementById('result').innerHTML = result;
}