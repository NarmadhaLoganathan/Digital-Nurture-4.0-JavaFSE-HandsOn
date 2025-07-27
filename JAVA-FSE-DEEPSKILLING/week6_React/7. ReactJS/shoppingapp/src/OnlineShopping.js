import React from "react";
import './App.css';

function OnlineShopping() {
  const items = [
    { name: "Smart Watch", brand: "Noise", price: "₹1999" },
    { name: "Bluetooth Headphones", brand: "boAt", price: "₹1499" },
    { name: "Fitness Band", brand: "Mi", price: "₹999" },
    { name: "Wireless Mouse", brand: "Logitech", price: "₹799" },
    { name: "Power Bank", brand: "Realme", price: "₹1099" },
    { name: "USB Type-C Cable", brand: "Samsung", price: "₹499" },
    { name: "Portable Speaker", brand: "JBL", price: "₹2599" }
  ];

  return (
    <div className="container">
      <h2>Online Shopping Cart</h2>
      <table className="shopping-table">
        <thead>
          <tr>
            <th>Item Name</th>
            <th>Brand</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {items.map((item, index) => (
            <tr key={index}>
              <td>{item.name}</td>
              <td>{item.brand}</td>
              <td>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default OnlineShopping;
