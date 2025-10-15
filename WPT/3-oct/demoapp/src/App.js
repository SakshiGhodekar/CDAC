import logo from './logo.svg';
import './App.css';
import PassGenerator from './PassGenerator';
import ErrorBoundary from './ErrorBoundary';
import Counter1 from './Counter1';
import Counter2 from './Counter2';
import Counter from './Counter';

function App() {
  return (
    <div className="App">
    
     <PassGenerator> </PassGenerator>
     <ErrorBoundary>
      <Counter></Counter>
      <Counter1></Counter1>
      <Counter2></Counter2>
     </ErrorBoundary>
    </div>
  );
}

export default App;
