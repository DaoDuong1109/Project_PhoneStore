function add() {
  var numInput = document.getElementById("numberInputProduct");
  var currentVal = numInput.value;
  var newVal = parseInt(currentVal) + 1;
  numInput.value = newVal;
}

function subtract() {
  var numInput = document.getElementById("numberInputProduct");
  var currentVal = numInput.value;
  var newVal = parseInt(currentVal) - 1;
  if (newVal < 1) {
    newVal = 1;
  }
  numInput.value = newVal;
}
