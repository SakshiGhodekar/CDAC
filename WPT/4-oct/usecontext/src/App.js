
import React from "react";
import {
    BrowserRouter, Routes, Route, NavLink
    , Link,
    useNavigate
} from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";
import Login from './Login';
const App = () => {
    return (
        <BrowserRouter>
            <nav
                style={{
                    backgroundColor: "purple",
                    padding: "10px",
                    display: "flex",
                    justifyContent: "center",
                }}
            >
                <ul
                    style={{
                        listStyle: "none",
                        display: "flex",
                        gap: "20px",
                        padding: "0",
                        margin: "0",
                    }}
                >
                    <li>
                        <NavLink to="/" style={linkStyle}>
                            Home
                        </NavLink>
                    </li>
                    <li>
                        <Link to="/About" style={linkStyle}>
                            About Us
                        </Link>
                    </li>
                    <li>
                        <Link to="/Contact" style={linkStyle}>
                            Contact Us
                        </Link>
                    </li>
                    <li>
                        <Link to="/Login" style={linkStyle}>
                            Login
                        </Link>
                    </li>
                </ul>
            </nav>
            <div
                style={{ display: "flex", justifyContent: "center", padding: "20px" }}
            >
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/About" element={<About />} />
                    <Route path="/Contact" element={<Contact />} />
                    <Route path="/Login" element={<Login/>} />
                </Routes>
            </div>

        </BrowserRouter>
    );
};
const linkStyle = {
    textDecoration: "none",
    color: "white",
    fontSize: "18px",
    fontWeight: "bold",
};
export default App;




// import React from "react";
// import Demo1 from './Demo1';
// import Demowith from './Demowith'
// import './App.css';
// function App() {
//   return (
//     <div className="App">
//     <Demo1></Demo1>
//     <Demowith></Demowith>

//     </div>
//   );
// }
// export default App;
