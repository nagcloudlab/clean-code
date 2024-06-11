



const inventory = [
    { name: 'apples', quantity: 2 },
    { name: 'bananas', quantity: 0 },
    { name: 'cherries', quantity: 5 }
];

// imperative approach

// function filterApples(inventory) {
//     const result = [];
//     for (const item of inventory) {
//         if (item.name === 'apples') {
//             result.push(item);
//         }
//     }
//     return result;
// }

// function filterBananas(inventory) {
//     const result = [];
//     for (const item of inventory) {
//         if (item.name === 'bananas') {
//             result.push(item);
//         }
//     }
//     return result;
// }

// declarative approach with behavior parameterization

function filter(inventory, f) {
    const result = [];
    for (const item of inventory) {
        if (f(item)) {
            result.push(item);
        }
    }
    return result;
}

const apples = filter(inventory, item => item.name === 'apples');
const bananas = filter(inventory, item => item.name === 'bananas');