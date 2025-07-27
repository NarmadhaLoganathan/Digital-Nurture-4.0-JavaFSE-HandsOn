import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: "Mr. Jack", score: 50 },
    { name: "Mr. Michael", score: 70 },
    { name: "Mr. John", score: 40 },
    { name: "Mr. Akin", score: 61 },
    { name: "Mr. Elisabeth", score: 61 },
    { name: "Mr. Smith", score: 95 },
    { name: "Mr. Dhoni", score: 100 },
    { name: "Mr. Virat", score: 84 },
    { name: "Mr. Jadeja", score: 64 },
    { name: "Mr. Raina", score: 75 },
    { name: "Mr. Rohit", score: 80 },
  ];

  const filtered = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} {p.score}</li>
        ))}
      </ul>

      <h2>List of Players having Scores Less than 70</h2>
      <ul>
        {filtered.map((p, i) => (
          <li key={i}>{p.name} {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
