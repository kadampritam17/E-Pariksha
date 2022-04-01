import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
// import './index.css';
//import App from './App';
import Exam from './Exam';
import Start from './Start';


import Exam from './Components/Exam';
import Start from './Components/Start';
import Result from './Components/Result';
import StudentLogin from './Components/StudentLogin';
import SignUp from './Components/SignUp';
import StudentDashboard from './Components/StudentDashboard';
import Dashboard from './Components/Dashboard';
import StudentProfile from './Components/StudentProfile';
import ExamHistory from './Components/ExamHistory';
import ExamDash from './Components/ExamDash';


ReactDOM.render(
  <React.StrictMode>
    {/* <App /> */}
    <Router basename={process.env.PUBLIC_URL}>
  <Routes>

<Route path="/" element={<Start/>} />
<Route path="/Exam" element={<Exam/>} />

<Route path="/login" element={<StudentLogin/>} />
<Route path="/signup" element={<SignUp/>} />
<Route path="/dashboard" element={<StudentDashboard/>} />
<Route path="/profile" element={<StudentProfile/>} />
<Route path="/result" element={<Result/>} />
<Route path="/examdash" element={<ExamDash/>} />
<Route path="/examhistory" element={<ExamHistory/>} />

</Routes>
</Router>
      
  </React.StrictMode>,
  document.getElementById('root')
);
