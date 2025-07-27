import React from 'react';

const IndianPlayers = () => {
  const players = ["Sachin", "Dhoni", "Virat", "Rohit", "Yuvraj", "Raina"];
  const [first, second, third, fourth, fifth, sixth] = players;

  const odd = [first, third, fifth];
  const even = [second, fourth, sixth];

  const t20 = ["Mr. First Player", "Mr. Second Player", "Mr. Third Player"];
  const ranji = ["Mr. Fourth Player", "Mr. Fifth Player", "Mr. Sixth Player"];
  const merged = [...t20, ...ranji];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First : {odd[0]}</li>
        <li>Third : {odd[1]}</li>
        <li>Fifth : {odd[2]}</li>
      </ul>

      <h2>Even Players</h2>
      <ul>
        <li>Second : {even[0]}</li>
        <li>Fourth : {even[1]}</li>
        <li>Sixth : {even[2]}</li>
      </ul>

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {merged.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
