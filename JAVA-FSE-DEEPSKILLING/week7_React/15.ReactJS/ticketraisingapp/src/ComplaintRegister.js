import React, { useState } from 'react';
import './ComplaintRegister.css';

function ComplaintRegister() {
  const [name, setName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!name || !complaint) {
      alert("Please fill in all fields.");
      return;
    }

    // Generate reference number
    const refNo = "REF" + Math.floor(100000 + Math.random() * 900000);

    alert(`Complaint submitted successfully!\n\nReference No: ${refNo}`);

    // Clear form
    setName('');
    setComplaint('');
  };

  return (
    <div className="form-container">
      <h1>Raise a Complaint</h1>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label>Employee Name:</label>
          <input
            type="text"
            value={name}
            onChange={(e) => setName(e.target.value)}
            placeholder="Enter your name"
          />
        </div>

        <div className="form-group">
          <label>Complaint:</label>
          <textarea
            rows="4"
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            placeholder="Describe your issue"
          ></textarea>
        </div>

        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
