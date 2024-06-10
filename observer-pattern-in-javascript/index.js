
const EventEmitter = require('events').EventEmitter;

//------------------- Subject -------------------

class Door extends EventEmitter {
    open() {
        console.log('Door is open');
        this.emit('open', { number: 1, floor: 2 });
    }
    close() {
        console.log('Door is close');
        this.emit('close', { number: 1, floor: 2 });
    }
}

const door = new Door();
//------------------- Observer -------------------

const light = {
    on() {
        console.log('Light is on');
    },
    off() {
        console.log('Light is off');
    }
};

door.on('open', e => {
    light.on();
})
door.on('close', e => {
    light.off();
})

//--------------------------------------------------------

const fan = {
    on() {
        console.log('Fan is on');
    },
    off() {
        console.log('Fan is off');
    }
};

door.on('open', e => {
    fan.on();
})
door.on('close', e => {
    fan.off();
})

//--------------------------------------------------------


setTimeout(() => {
    door.open();
    setTimeout(() => {
        door.close();
    }, 2000);
}, 2000);

//--------------------------------------------------------
