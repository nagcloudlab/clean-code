const Subject = require("rxjs").Subject;

const doorStream = new Subject(); // Observable stream

//------------------- Subject -------------------

class Door {
  open() {
    console.log("Door is open");
    doorStream.next({ type: "open", number: 1, floor: 2 });
  }
  close() {
    console.log("Door is close");
    doorStream.next({ type: "close", number: 1, floor: 2 });
  }
}

//------------------- Subscrber -------------------

const light = {
  on() {
    console.log("Light is on");
  },
  off() {
    console.log("Light is off");
  },
};

doorStream.subscribe((e) => {
  if (e.type === "open") {
    light.on();
  } else {
    light.off();
  }
});

//--------------------------------------------------------

const fan = {
  on() {
    console.log("Fan is on");
  },
  off() {
    console.log("Fan is off");
  },
};

doorStream.subscribe((e) => {
  if (e.type === "open") {
    fan.on();
  } else {
    fan.off();
  }
});

//--------------------------------------------------------

const door = new Door();
setInterval(() => {
  door.open();
  setTimeout(() => {
    door.close();
  }, 2000);
}, 2000);

//--------------------------------------------------------
