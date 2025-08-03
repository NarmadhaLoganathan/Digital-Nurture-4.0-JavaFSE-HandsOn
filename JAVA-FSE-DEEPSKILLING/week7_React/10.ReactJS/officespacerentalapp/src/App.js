import React from 'react';
import './App.css';

// Office image
const imageUrl = "https://images.unsplash.com/photo-1504384308090-c894fdcc538d";

// List of office objects
const offices = [
  { name: "Chennai Workspace", rent: 45000, address: "T-Nagar, Chennai" },
  { name: "Bangalore Tech Hub", rent: 75000, address: "Indiranagar, Bangalore" },
  { name: "Hyderabad Co-Working", rent: 60000, address: "HiTech City, Hyderabad" }
];

function App() {
  return (
    <div className="App">
      <h1 style={{ textAlign: 'center' }}>Office Space Rental App</h1>

      <img src={imageUrl} alt="Office Space" style={{ width: '500px', borderRadius: '10px' }} />

      <h2>Available Office Spaces:</h2>

      <ul>
        {offices.map((office, index) => (
          <li key={index} style={{ marginBottom: '20px' }}>
            <strong>Name:</strong> {office.name}<br />
            <strong>Address:</strong> {office.address}<br />
            <strong style={{ 
              color: office.rent < 60000 ? 'red' : 'green' 
            }}>
              Rent: ₹{office.rent}
            </strong>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
