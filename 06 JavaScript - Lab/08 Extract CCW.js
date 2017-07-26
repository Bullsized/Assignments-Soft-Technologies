/**
 * Created by Bullsized on 26-Jul-17.
 */
function solve(args) {
    let words = args
        .join("")
        .split(/\W+/)
        .filter(w => w.length > 0)
        .filter(w => w === w.toUpperCase())
        .join(", ");

    console.log(words)
}

solve(["We start by HTML, CSS, JavaScript, JSON and REST.", "Later we touch some PHP, MySQL and SQL.", "Later we play with C#, EF, SQL Server and ASP.NET MVC.", "Finally, we touch some Java, Hibernate and Spring.MVC."]);