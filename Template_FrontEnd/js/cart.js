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
  if (newVal < 0) {
    newVal = 0;
  }
  numInput.value = newVal;
}
