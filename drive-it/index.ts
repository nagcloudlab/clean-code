


// use case

// - drive the the car

// - car
// - wheel

interface Wheel {
    rotate(): void;
}

class MRFWheel implements Wheel {
    constructor() {
        console.log('MRFWheel created');
    }
    rotate() {
        console.log('MRFWheel rotating');
    }
}

class CEATWheel implements Wheel {
    constructor() {
        console.log('CEATWheel created');
    }
    rotate() {
        console.log('CEATWheel rotating');
    }
}

class Car {
    private wheel: Wheel
    constructor(wheel: Wheel) {
        this.wheel = wheel;
        console.log('Car created');
    }
    setWheel(wheel: Wheel) {
        this.wheel = wheel;
    }
    move() {
        // const wheel = new MRFWheel();
        this.wheel.rotate();
        console.log('Car moving');
    }
}


const car = new Car(new MRFWheel());
car.move();
car.move();

car.setWheel(new CEATWheel());

car.move();
car.move();