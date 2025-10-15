import React, { useState, useEffect, useCallback } from 'react';


const CHAR_POOL = 'Sakshikaple';
const App = () => {
  
  const [password, setPassword] = useState('');
  const [length, setLength] = useState(12);

  const generatePassword = useCallback(() => {
    let result = '';
    const poolLength = CHAR_POOL.length;
    
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * poolLength);
      result += CHAR_POOL[randomIndex];
    }
    setPassword(result);
  }, [length]);

  useEffect(() => {
    generatePassword();
  }, [generatePassword]);

  return (
    <div className="min-h-screen bg-gray-100 flex items-center justify-center p-4 font-sans">
      <div className="w-full max-w-sm bg-white p-6 rounded-lg shadow-xl">
        <h2 className="text-xl font-bold mb-4 text-center text-gray-800">
          Length-Based Generator
        </h2>
        <input 
          type="text" 
          readOnly 
          value={password} 
          className="w-full p-3 mb-4 text-lg text-gray-700 bg-gray-50 border border-gray-300 rounded-md font-mono"
        />

        <div className="mb-4">
          <label className="block text-sm font-medium text-gray-600 mb-2">
            Password Length: <span className="text-blue-600 font-semibold">{length}</span>
          </label>
          <input
            type="range"
            min="8"
            max="24"
            value={length}
            onChange={(e) => setLength(parseInt(e.target.value))}
            className="w-full h-2 bg-blue-100 rounded-lg appearance-none cursor-pointer range-lg accent-blue-600"
          />
        </div>
        <button 
          onClick={generatePassword} 
          className="w-full py-2 bg-blue-600 hover:bg-blue-700 text-white font-medium rounded-md transition duration-150 shadow-md"
        >
          Generate New Password
        </button>
      </div>
    </div>
  );
};

export default App;
