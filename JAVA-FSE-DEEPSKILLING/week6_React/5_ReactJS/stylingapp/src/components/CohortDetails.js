import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = () => {
  const cohorts = [
    { name: 'React Bootcamp', duration: '4 weeks', mentor: 'John Doe', status: 'ongoing' },
    { name: 'Angular Basics', duration: '3 weeks', mentor: 'Jane Smith', status: 'completed' },
    { name: 'Vue Starter', duration: '2 weeks', mentor: 'Emily Davis', status: 'ongoing' }
  ];

  return (
    <div className={styles.container}>
      {cohorts.map((cohort, index) => (
        <div className={styles.box} key={index}>
          <dl>
            <dt>Name:</dt>
            <dd>{cohort.name}</dd>
            <dt>Duration:</dt>
            <dd>{cohort.duration}</dd>
            <dt>Mentor:</dt>
            <dd>{cohort.mentor}</dd>
            <dt>Status:</dt>
            <dd style={{ color: cohort.status === 'ongoing' ? 'green' : 'blue' }}>
              {cohort.status}
            </dd>
          </dl>
        </div>
      ))}
    </div>
  );
};

export default CohortDetails;
