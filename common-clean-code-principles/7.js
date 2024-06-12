// 7. Avoid magic values - declare and use CONSTANTS instead.



// Bad

// let price = 0;
// if (transactionType === 1) {
//     price *= 1.1;
// }


// Good

const TAX_RATE = 1.1;
const TRANSACTION_TYPE = 1;

let price = 0;
if (transactionType === TRANSACTION_TYPE) {
    price *= TAX_RATE;
}