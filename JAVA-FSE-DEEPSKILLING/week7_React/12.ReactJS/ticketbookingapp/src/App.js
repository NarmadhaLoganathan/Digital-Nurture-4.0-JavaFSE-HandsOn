import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);


  const flight = {
    name: "IndiGo",
    from: "Chennai",
    to: "Delhi",
    price: 3500,
    time: "10:30 AM"
  };


  let content;
  if (isLoggedIn) {
    content = (
      <div>
        <h2>Welcome, User!</h2>
        <p>You can now book your tickets.</p>
        <p><strong>Flight:</strong> {flight.name}</p>
        <p><strong>From:</strong> {flight.from}</p>
        <p><strong>To:</strong> {flight.to}</p>
        <p><strong>Price:</strong> ₹{flight.price}</p>
        <p><strong>Time:</strong> {flight.time}</p>
        <button className="logout-btn" onClick={handleLogout}>Logout</button>
      </div>
    );
  } else {
    content = (
      <div>
        <h2>Welcome, Guest!</h2>
        <p>Please login to book your ticket.</p>
        <p><strong>Flight:</strong> {flight.name}</p>
        <p><strong>From:</strong> {flight.from}</p>
        <p><strong>To:</strong> {flight.to}</p>
        <p><strong>Price:</strong> ₹{flight.price}</p>
        <p><strong>Time:</strong> {flight.time}</p>
        <button className="login-btn" onClick={handleLogin}>Login</button>
      </div>
    );
  }

  return (
    <div className="App">
      <h1>✈️ Ticket Booking App</h1>
      {content}
    </div>
  );
}

export default App;
