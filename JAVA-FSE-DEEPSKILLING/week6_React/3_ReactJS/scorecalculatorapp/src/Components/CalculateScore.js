import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Narmadha";
  const clg = "RMK College of Engineering and Technology";
  const cgpa = 8.4;
  const goal = "To become a FullStack engineer";

  return (
    <div className="score-card">
      <h2>Student Academic Profile</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>College:</strong> {clg}</p>
      <p><strong>CGPA:</strong> {cgpa}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p><strong>Average Score:</strong> {cgpa} / 10</p>
    </div>
  );
}

export default CalculateScore;
