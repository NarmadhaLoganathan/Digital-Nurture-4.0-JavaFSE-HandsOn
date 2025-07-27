import React from 'react';
import { Link } from 'react-router-dom';
import trainerList from './TrainersMock';

function TrainerList() {
  return (
    <div>
      <h2>Trainer List</h2>
      <ul>
        {trainerList.map(trainer => (
          <li key={trainer.trainerId}>
            <Link to={`/trainer/${trainer.trainerId}`}>{trainer.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerList;
