


// const list = [
//     "item-1",
//     "item-2",
//     "item-3",
// ]



// // for (let i = 0; i < list.length; i++) {
// //     console.log(list[i])
// // }

// for (let item of list) {
//     console.log(item)
// }

// -----------------------------------------------

const myList = {
    items: [
        "item-1",
        "item-2",
        "item-3",
    ],
    [Symbol.iterator]: function () {
        let index = 0
        return {
            next: () => {
                if (index < this.items.length) {
                    return {
                        value: this.items[index++],
                        done: false
                    }
                } else {
                    return {
                        done: true
                    }
                }
            }
        }
    }
}

for (let item of myList) {
    console.log(item)
}