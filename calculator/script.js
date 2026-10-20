const display = document.getElementById('display');
const buttons = document.querySelectorAll('button');

let currentValue = '0';
let firstValue = null;
let operator = null;
let waitingForSecondValue = false;

function updateDisplay() {
  display.textContent = currentValue;
}

function inputDigit(digit) {
  if (waitingForSecondValue) {
    currentValue = digit;
    waitingForSecondValue = false;
  } else {
    currentValue = currentValue === '0' ? digit : currentValue + digit;
  }
  updateDisplay();
}

function inputDecimal() {
  if (waitingForSecondValue) {
    currentValue = '0.';
    waitingForSecondValue = false;
    updateDisplay();
    return;
  }

  if (!currentValue.includes('.')) {
    currentValue += '.';
    updateDisplay();
  }
}

function performCalculation(first, second, operation) {
  switch (operation) {
    case '+':
      return first + second;
    case '-':
      return first - second;
    case '*':
      return first * second;
    case '/':
      return second === 0 ? 'Error' : first / second;
    default:
      return second;
  }
}

function handleOperator(nextOperator) {
  const inputValue = Number(currentValue);

  if (firstValue === null) {
    firstValue = inputValue;
  } else if (operator) {
    const result = performCalculation(firstValue, inputValue, operator);
    currentValue = String(result);
    firstValue = result;
  }

  waitingForSecondValue = true;
  operator = nextOperator;
  updateDisplay();
}

function clearCalculator() {
  currentValue = '0';
  firstValue = null;
  operator = null;
  waitingForSecondValue = false;
  updateDisplay();
}

function deleteLastDigit() {
  if (waitingForSecondValue) {
    return;
  }

  currentValue = currentValue.length > 1 ? currentValue.slice(0, -1) : '0';
  updateDisplay();
}

function handleEquals() {
  if (operator === null || waitingForSecondValue) {
    return;
  }

  const inputValue = Number(currentValue);
  const result = performCalculation(firstValue, inputValue, operator);

  currentValue = String(result);
  firstValue = null;
  operator = null;
  waitingForSecondValue = false;
  updateDisplay();
}

buttons.forEach((button) => {
  button.addEventListener('click', () => {
    const { action, value } = button.dataset;

    if (button.classList.contains('number')) {
      inputDigit(value);
      return;
    }

    if (action === 'clear') {
      clearCalculator();
      return;
    }

    if (action === 'delete') {
      deleteLastDigit();
      return;
    }

    if (action === 'decimal') {
      inputDecimal();
      return;
    }

    if (action === 'operator') {
      handleOperator(value);
      return;
    }

    if (action === 'equals') {
      handleEquals();
    }
  });
});
