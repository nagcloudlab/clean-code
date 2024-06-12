




const person = {
    // data properties
    _name: 'John',
    _age: 30,
    // accessor properties
    set name(newName) {
        if (typeof newName === 'string') {
            this._name = newName;
        } else {
            console.log('Invalid input type');
        }
    },
    set age(newAge) {
        if (typeof newAge === 'number' && newAge > 0) {
            this._age = newAge;
        } else {
            console.log('Invalid input type/value');
        }
    },
    get name() {
        return this._name;
    },
    get age() {
        return this._age;
    }
}

// set
person.name = 'Jane';
person.age = -1;

// get
console.log(person.name);
console.log(person.age);