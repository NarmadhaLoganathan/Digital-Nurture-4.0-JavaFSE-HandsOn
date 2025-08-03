import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css';


function App() {
  const [count, setCount] = useState(0);

  const sayHello = () => {
    alert("Hello! This is a static message.");
  };

  const increment = () => {
    setCount(count + 1);
    sayHello(); // multiple method call
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleSyntheticEvent = (e) => {
    e.preventDefault(); // synthetic event
    alert("I was clicked");
  };

  return (
    <div className="App" style={{ textAlign: "center", padding: "40px" }}>
      <h1>React Event Handling Example</h1>

      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement} style={{ marginLeft: "10px" }}>Decrement</button>

      <br /><br />
      <button onClick={() => sayWelcome("Welcome to React Events!")}>Say Welcome</button>

      <br /><br />
      <button onClick={handleSyntheticEvent}>Click Me (Synthetic Event)</button>

      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
