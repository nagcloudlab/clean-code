


// // dev-1
// function hello() {
//     console.log("Hello");
//     console.log("😊");
// }


// // Me
// function hi() {
//     console.log("Hi");
//     console.log("😊");
// }

// function hey() {
//     console.log("Hey");
//     console.log("😊");
// }


// hello();
// hi();
// hey();

// design issues
// code tangling
// code duplication

// wotking with objects => choose proxy pattern
// working with functions => choose HOF


// Single Responsibility Principle
function hello() {
    console.log("Hello");
}

function hi() {
    console.log("Hi");
}

function hey() {
    console.log("Hey");
}

// greet without smiley
hello();
hi();
hey();

// greet with smiley
function withSmiley(f) {
    return function () {
        f();
        console.log("😊");
    }
}


let helloWithSmiley = withSmiley(hello);
helloWithSmiley();
withSmiley(hi)();

// HOF -> write single responsibility functions, compose them to get the desired functionality