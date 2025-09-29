import React, { useState } from 'react';

function TextTransformer() {

  const [inputText, setInputText] = useState('');
  const [selectedCase, setSelectedCase] = useState('uppercase'); // Default

  const getTransformedText = () => {
    if (!inputText) return '';

    switch (selectedCase) {
      case 'uppercase':
        return inputText.toUpperCase();

      case 'lowercase':
        return inputText.toLowerCase();

      case 'titlecase':
       
        return inputText.toLowerCase().split(' ')
          .map(word => 
            word.length > 0 ? word.charAt(0).toUpperCase() + word.slice(1) : ''
          )
          .join(' ');

      default:
        return inputText;
    }
  };

  const transformedText = getTransformedText(); 

  return (
    <div>
      <h2>Enter Text</h2>

      <input
        type="text"
        value={inputText}
        onChange={(e) => setInputText(e.target.value)}
        placeholder="Enter text here..."
        style={{ padding: '8px', width: '300px', marginBottom: '15px' }}
      />
      <div style={{ display: 'flex', gap: '20px', marginBottom: '20px' }}>
        
       
        {['uppercase', 'lowercase', 'titlecase'].map((caseType) => (
          <label key={caseType}>
            <input
              type="radio"
              value={caseType}
              checked={selectedCase === caseType}
              onChange={(e) => setSelectedCase(e.target.value)}
            />
            {caseType.charAt(0).toUpperCase() + caseType.slice(1)} {/* Display name */}
          </label>
        ))}
      </div>

      <h3>Output:</h3>
      {/* Display the result */}
      <p style={{ border: '1px solid #ccc', padding: '10px', minHeight: '30px', fontFamily: 'monospace' }}>
        {transformedText}
      </p>
    </div>
  );
}

export default TextTransformer;