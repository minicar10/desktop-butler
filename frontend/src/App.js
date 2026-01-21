import React, { useState } from 'react';

function App() {
  const [regex, setRegex] = useState('^CS373_.*');

  return (
    <div className="App">
      <h1>Desktop Butler Configuration</h1>
      <label>File Sorting Rule (Regex):</label>
      <input 
        type="text" 
        value={regex} 
        onChange={(e) => setRegex(e.target.value)} 
      />
      <p>Status: Monitoring Downloads Folder...</p>
    </div>
  );
}

export default App;
