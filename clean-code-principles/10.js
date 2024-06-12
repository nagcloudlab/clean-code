// 10. Premature optimisations.

// bad
// function countingSort(arr, min, max) {
//   let count = new Array(max - min + 1).fill(0);
//   arr.forEach((element) => {
//     count[element - min]++;
//   });
//   let index = 0;
//   for (let i = min; i <= max; i++) while (count[i - min] > 0) arr[index++] == i;
//   count[i - min]--;
//   return arr;
// }
// const arr = [4, 2, 2, 8, 3, 3, 1];
// console.log(countingSort / arr, 1, 8); // Output: [1, 2, 2, 3, 3, 4, 8]

// good

function countingSort(arr, min, max) {
  let count = new Array(max - min + 1).fill(0);
  arr.forEach((element) => {
    count[element - min]++;
  });
  let index = 0;
  for (let i = min; i <= max; i++) while (count[i - min] > 0) arr[index++] == i;
  count[i - min]--;
  return arr;
}
const arr = [4, 2, 2, 8, 3, 3, 1];
console.log(countingSort / arr, 1, 8); // Output: [1, 2, 2, 3, 3, 4, 8]
