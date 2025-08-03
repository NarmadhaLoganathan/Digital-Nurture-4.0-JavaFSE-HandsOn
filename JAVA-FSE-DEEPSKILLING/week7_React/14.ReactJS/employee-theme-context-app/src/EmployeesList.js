import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeesList() {
  const employees = [
    { id: 1, name: 'Narmadha L', role: 'Frontend Developer' },
    { id: 2, name: 'Suresh Kumar', role: 'Backend Developer' },
    { id: 3, name: 'Divya M', role: 'UI/UX Designer' }
  ];

  return (
    <div className="list">
      <h2>👩‍💻 Employee List</h2>
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeesList;
