import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState(null);

  const handleSubmit = () => {
    const rate = 0.011; // Example conversion rate
    const converted = parseFloat(rupees) * rate;
    setEuro(converted.toFixed(2));
  };

  return (
    <div>
      <h2>Currency Convertor</h2>
      <input
        type="number"
        placeholder="Enter INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit} style={{ marginLeft: "10px" }}>
        Convert to Euro
      </button>

      {euro !== null && <p>€ {euro}</p>}
    </div>
  );
}

export default CurrencyConvertor;
