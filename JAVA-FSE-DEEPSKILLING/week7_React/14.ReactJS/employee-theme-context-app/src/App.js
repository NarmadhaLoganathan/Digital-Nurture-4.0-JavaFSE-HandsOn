import React, { useState } from 'react';
import EmployeesList from './EmployeesList';
import ThemeContext from './ThemeContext';
import './App.css';

function App() {
  const [theme, setTheme] = useState('light');

  return (
    <ThemeContext.Provider value={theme}>
      <div className="App">
        <h1>🌟 Employee Management App</h1>
        <div className="theme-buttons">
          <button onClick={() => setTheme('light')}>Light Theme</button>
          <button onClick={() => setTheme('dark')}>Dark Theme</button>
        </div>
        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
