// 2) Understand the Node JS Architecture and understand 
// event loop execution by adding timer and promise concept 
// use below code 
// setImmediate(function A() {
// 	console.log("1st immediate");
// });
// process.nextTick(function C() {
// 	console.log("1st process");
// });
// // First event queue ends here
// console.log("program started");
setImmediate(function A() {
	console.log("1st immediate");
});

setTimeout(function B() {
	console.log("1st timeout");
}, 0);

Promise.resolve().then(() => {
	console.log("1st promise");
});

process.nextTick(function C() {
	console.log("1st process");
});

console.log("program started");