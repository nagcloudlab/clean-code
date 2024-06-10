// use case
var MRFWheel = /** @class */ (function () {
    function MRFWheel() {
        console.log('MRFWheel created');
    }
    MRFWheel.prototype.rotate = function () {
        console.log('MRFWheel rotating');
    };
    return MRFWheel;
}());
var CEATWheel = /** @class */ (function () {
    function CEATWheel() {
        console.log('CEATWheel created');
    }
    CEATWheel.prototype.rotate = function () {
        console.log('CEATWheel rotating');
    };
    return CEATWheel;
}());
var Car = /** @class */ (function () {
    function Car(wheel) {
        this.wheel = wheel;
        console.log('Car created');
    }
    Car.prototype.setWheel = function (wheel) {
        this.wheel = wheel;
    };
    Car.prototype.move = function () {
        // const wheel = new MRFWheel();
        this.wheel.rotate();
        console.log('Car moving');
    };
    return Car;
}());
var car = new Car(new MRFWheel());
car.move();
car.move();
car.setWheel(new CEATWheel());
car.move();
car.move();
