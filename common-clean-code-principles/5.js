// 5. DRY business logic. Look for opportunities to refactor. Make sure to test!

// bad

function logLogin() {
    console.log("User logged in at " + new Date());
}
function logLogout() {
    console.log("User logged out at " + new Date());
}
function logSignUp() {
    console.log("User signed up at" + +new Date());
}

// good

function logEvent(event) {
    console.log(`User ${event} at ${new Date()}`);
}


