import React from 'react';

const CohortDetails = ({ cohort }) => {
  return (
    <div>
      <h3>{cohort?.cohortCode || 'No Code'}</h3>
      <p>{cohort?.name || 'No Name'}</p>
    </div>
  );
};

export default CohortDetails;
