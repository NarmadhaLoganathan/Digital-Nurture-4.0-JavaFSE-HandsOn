import React, { useEffect, useState } from 'react';
import GitClient from './GitClient';
import './App.css';


function App() {
  const [repos, setRepos] = useState([]);
  const username = 'techiesyed';

  useEffect(() => {
    const git = new GitClient();
    git.getRepositories(username)
      .then(setRepos)
      .catch((err) => console.error(err));
  }, []);

  return (
    <div className="App" style={{ textAlign: 'center', padding: '30px' }}>
      <h2>GitHub Repositories for {username}</h2>
      <ul>
        {repos.map((repo, index) => (
          <li key={index}>{repo}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
