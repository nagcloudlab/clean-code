//---------------------------------------
// trainer
//---------------------------------------

const trainer = {
  getTopic() {
    const promise = new Promise((resolve, reject) => {
      setTimeout(() => {
        const success = Math.random() > 0.5;
        if (success) {
          console.log("trainer resolved promise");
          resolve("javascript"); // push data to promise
        } else {
          console.log("trainer rejected promise");
          reject("network issue"); // push error to promise
        }
      }, 3000);
    });
    return promise;
  },
};

//---------------------------------------
// employee
//---------------------------------------

const employee = {
  doLearn: function () {
    console.log("employee is learning");
    console.log("employee requested trainer to teach a topic");
    const promise = trainer.getTopic();
    console.log("employee received promise from trainer");
    console.log("employee deferred learning to promise");
    promise
      .then((topic) => {
        console.log(`employee learned ${topic}`);
      })
      .catch((error) => {
        console.log(`employee could not learn due to ${error}`);
      });
  },
  doWork: function () {
    this.doLearn();
    console.log(
      "employee is working further which is not dependent on learning"
    );
  },
};

employee.doWork();
