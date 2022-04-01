import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
// import './index.css';
//import App from './App';

import Exam from './component/Exam';
import Start from './component/Start';
import Result from './component/Result';
import StudentLogin from './component/StudentLogin';
import SignUp from './component/SignUp';
import StudentDashboard from './component/StudentDashboard';
import StudentProfile from './component/StudentProfile';
import ExamHistory from './component/ExamHistory';
import ExamDash from './component/ExamDash';


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
