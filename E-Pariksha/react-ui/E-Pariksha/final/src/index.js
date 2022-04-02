import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import StudentLogin from './component/StudentLogin';
import SignUp from './component/SignUp';
import StudentDashboard from './component/StudentDashboard';
import ExamDash from './component/ExamDash';
import ExamHistory from './component/ExamDash';
import StudentProfile from './component/StudentProfile';
import Exam from './component/Exam';
import Result from './component/Result';
import Start from './component/Start';

ReactDOM.render(
  <React.StrictMode>
    {/* <App /> */}
    <Router basename={process.env.PUBLIC_URL}>
      <Routes>
        <Route path="/" element={<StudentLogin />} />
        <Route path="/signup" element={<SignUp />} />
        <Route path="/dashboard" element={<StudentDashboard />} />
        <Route path="/examdash" element={<ExamDash />} />
        <Route path="/examhistory" element={<ExamHistory />} />
        <Route path="/profile" element={<StudentProfile />} />
        <Route path="/Start" element={<Start />} />
        <Route path="/Exam" element={<Exam />} />
        <Route path="/result" element={<Result />} />
      </Routes>
    </Router>
  </React.StrictMode>,
  document.getElementById('root')
);
