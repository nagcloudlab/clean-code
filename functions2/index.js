



// pure function
function add(a, b) {
    return a + b;
}

console.log(add(1, 2));

// impure function
let c = 10;
function add2(a, b) {
    return a + b + c;
}

console.log(add2(1, 2));

// side effect
let d = 10;
function add3(a, b) {
    d = 20;
    return a + b + d;
}