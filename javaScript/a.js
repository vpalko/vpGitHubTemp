var value = null
function closure() {
	var last = value
	;(function () {
		last
	})(last)
	// value = {
	// 	a: function () {},
	// }
	value = null;
}
setInterval(function () {
	closure()
	console.log(process.memoryUsage())
}, 1)
