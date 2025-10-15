// 2) Do Program for Error Boundry for Class Component

import { useState } from "react";
import Counter1 from "./Counter1";
import Counter2 from "./Counter2";
import ErrorBoundary from "./ErrorBoundary";  

const Counter = () => {
  const [count1, setCounter1] = useState(1);
  const increment1 = () => {
    setCounter1(count1 + 1);
  };

  const [count2, setCounter2] = useState(10);
  const increment2 = () => {
    setCounter2(count2 + 1);
  };

  return (
    <>
      <ErrorBoundary>
        <Counter1 value={count1} onClick={increment1} />
      </ErrorBoundary>

      <Counter2 value={count2} onClick={increment2} />
    </>
  );
};

export default Counter;
