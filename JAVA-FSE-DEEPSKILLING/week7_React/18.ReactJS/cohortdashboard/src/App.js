import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort';

function App() {
  return (
    <div className="cohort-box">
      <CohortDetails cohort={CohortData[0]} />
    </div>
  );
}

export default App;
