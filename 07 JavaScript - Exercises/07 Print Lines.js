/**
 * Created by Bullsized on 26-Jul-17.
 */
function printLines(words) {
    for (let i = 0; i < words.length; i++) {
        let currentWord = words[i];
        if (currentWord === "Stop") {
            break;
        } else {
            console.log(words[i]);
        }
    }
}

printLines(["Line 1", "Line 2", "Line 3", "Stop", "5"])