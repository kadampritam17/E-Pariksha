import React from 'react'
import { useNavigate } from 'react-router'

export default function ExamHistory() {

  let navigate = useNavigate();
  function dashboard() {
    navigate('/dashboard');
  }
  function examHistory() {
    navigate('/examhistory')
  }
  function examDash() {
    navigate('/examdash')
  }
  function profile() {
    navigate('/profile')
  }

  //Rendering
  return (
    <>
      <body>
        {/* <!-- ======= Header ======= --> */}
        <header id="header" class="header fixed-top d-flex align-items-center">
          <div class="d-flex align-items-center justify-content-between">
            <i class="bi bi-list toggle-sidebar-btn"></i>
            <a href="#" class="logo d-flex align-items-center">
              <img src="assets/img/EPariksha.png" alt="" />
              <span class="d-none d-lg-block">E-Pariksha</span>
            </a>
          </div>
          {/* <!-- End Logo --> */}
          <nav class="header-nav ms-auto">
            <ul class="d-flex align-items-center">
              <li class="nav-item dropdown pe-3">
                <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
                  <img src="assets/img/admin.jpg" alt="Profile" class="rounded-circle" />
                  <span class="d-none d-md-block dropdown-toggle ps-2">Student</span>
                </a>
                {/* <!-- End Profile Image Icon --> */}
                <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
                  <li class="dropdown-header">
                    <h6>XYZ</h6>
                    <span>Student</span>
                  </li>
                  <li>
                    <hr class="dropdown-divider" />
                  </li>
                  <li>
                    <button class="dropdown-item d-flex align-items-center" style={{ 'border': 'none' }} onClick={profile}>
                      <i class="bi bi-person"></i>
                      <span>My Profile</span>
                    </button>
                  </li>
                  <li>
                    <hr class="dropdown-divider" />
                  </li>
                  <li>
                    <a class="dropdown-item d-flex align-items-center" href="http://localhost:8081">
                      <i class="bi bi-box-arrow-right"></i>
                      <span>Sign Out</span>
                    </a>
                  </li>
                </ul>
                {/* <!-- End Profile Dropdown Items --> */}
              </li>
              {/* <!-- End Profile Nav --> */}
            </ul>
          </nav>
          {/* <!-- End Icons Navigation --> */}
        </header>
        {/* <!-- End Header --> */}
        {/* <!-- ======= Sidebar ======= --> */}
        <aside id="sidebar" class="sidebar">
          <ul class="sidebar-nav" id="sidebar-nav">
            <li class="nav-item">
              <button class="nav-link collapsed" style={{ 'border': 'none' }} onClick={dashboard}>
                <i class="bi bi-grid"></i>
                <span>Dashboard</span>
              </button>
            </li>
            {/* <!-- End Dashboard Nav --> */}
            <li class="nav-item">
              <button class="nav-link collapsed" style={{ 'border': 'none' }} onClick={examDash}>
                <i class="bi bi-card-list"></i>
                <span>Exam</span>
              </button>
            </li>
            {/* End Exam Page Nav */}
            <li class="nav-item">
              <button class="nav-link collapsed" style={{ 'border': 'none' }} onClick={examHistory}>
                <i class="bi bi-box-arrow-in-right"></i>
                <span>Exam History</span>
              </button>
            </li>
            {/* End Exam History Page Nav */}
          </ul>
        </aside>
        {/* End Sidebar */}
        <main id="main" class="main">
          <div class="pagetitle">
            <h1>Exam History</h1>
            <nav>
              <ol class="breadcrumb">
                <li class="breadcrumb-item"><button style={{ 'border': 'none' }} onClick={dashboard}>Home</button></li>
                <li class="breadcrumb-item active"><button style={{ 'border': 'none' }} onClick={examHistory}>Exam History</button></li>
              </ol>
            </nav>
          </div>
          {/* <!-- End Page Title --> */}
          <section class="section">
            <div class="row">
              <div class="col-lg-12">
                <div class="card">
                  <div class="card-body">
                    <h5 class="card-title">Previous Exam</h5>
                    {/* <!-- Table with stripped rows --> */}
                    <table class="table table-striped">
                      <thead style={{ 'background-color': '#37517e', 'color': 'white' }}>
                        <tr>
                          <th scope="col">Exam Name</th>
                          <th scope="col">Date</th>
                          <th scope="col">Marks</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td scope="col">Concept Of Programming</td>
                          <td scope="col">2022-02-21</td>
                          <td scope="col">30</td>
                        </tr>
                        <tr>
                          <td scope="col">Data Structure</td>
                          <td scope="col">2022-03-31</td>
                          <td scope="col">35</td>
                        </tr>
                        <tr>
                          <td scope="col">Advanced Java</td>
                          <td scope="col">2022-02-11</td>
                          <td scope="col">30</td>
                        </tr>
                        <tr>
                          <td scope="col">MS .Net</td>
                          <td scope="col">2022-03-21</td>
                          <td scope="col">35</td>
                        </tr>
                        <tr>
                          <td scope="col">Core Java</td>
                          <td scope="col">2022-06-11</td>
                          <td scope="col">38</td>
                        </tr>
                      </tbody>
                    </table>
                    {/* <!-- End Table with stripped rows --> */}
                  </div>
                </div>
              </div>
            </div>
          </section>
        </main>
        {/* <!-- End #main --> */}
        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>
      </body>
    </>
  )
}
