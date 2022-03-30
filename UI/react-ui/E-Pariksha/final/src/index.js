import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
// import './index.css';
//import App from './App';
import Exam from './Exam';
import Start from './Start';


ReactDOM.render(
  <React.StrictMode>
    {/* <App /> */}
    <Router basename={process.env.PUBLIC_URL}>
  <Routes>

<Route path="/" element={<Start/>} />
<Route path="/Exam" element={<Exam/>} />

</Routes>
</Router>
      
  </React.StrictMode>,
  document.getElementById('root')
);
