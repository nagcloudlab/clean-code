// 8. Avoid violating single responsibility. Prefer to use pure functions (no side effects)


// bad

// let area = 0;
// function calculateAndUpdateArea(radius) {
//     const newArea = Math.PI * radius * radius;
//     area = newArea; // side effect
//     return newArea; // pure
// }

// good

function calculateArea(radius) {
    return Math.PI * radius * radius;
}
let area = calculateArea(10); // 314.1592653589793
