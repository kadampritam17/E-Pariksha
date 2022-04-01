import React from 'react'
import Exam from './Exam'
import { useNavigate } from 'react-router'
export default function StudentDashboard() {

let navigate=useNavigate();
function dashboard()
{
  navigate('/dashboard');
}
function examHistory()
{
  navigate('/examhistory')
}
function examDash()
{
  navigate('/examdash')
}
  return (
    <div>
        <body>

{/* <!-- ======= Header ======= --> */}
<header id="header" class="header fixed-top d-flex align-items-center">

  <div class="d-flex align-items-center justify-content-between">
    <i class="bi bi-list toggle-sidebar-btn"></i>
    <a href="index.html" class="logo d-flex align-items-center">
      <img src="assets/img/EPariksha.png" alt=""/>
      <span class="d-none d-lg-block">E-Pariksha</span>
    </a>
    
  </div>
  {/* <!-- End Logo --> */}


  <nav class="header-nav ms-auto">
    <ul class="d-flex align-items-center">
      <li class="nav-item dropdown pe-3">
        <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
          <span class="d-none d-md-block dropdown-toggle ps-2">K. Anderson</span>
        </a>
        {/* <!-- End Profile Iamge Icon --> */}

        <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
          <li class="dropdown-header">
            <h6>Kevin Anderson</h6>
            <span>Web Designer</span>
          </li>
          <li>
            <hr class="dropdown-divider"/>
          </li>

          <li>
            <a class="dropdown-item d-flex align-items-center" href="user-profile.html">
              <i class="bi bi-person"></i>
              <span>My Profile</span>
            </a>
          </li>
          <li>
            <hr class="dropdown-divider"/>
          </li>

          <li>
            <a class="dropdown-item d-flex align-items-center" href="#">
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
      <button class="nav-link collapsed" style={{'border':'none'}} onClick={dashboard}>
        <i class="bi bi-grid"></i>
        <span>Dashboard</span>
      </button>
    </li>
    {/* <!-- End Dashboard Nav --> */}

    <li class="nav-item">
      <button class="nav-link collapsed" style={{'border':'none'}} onClick={examDash}>
        <i class="bi bi-card-list"></i>
        <span>Exam</span>
      </button>
    </li>
    {/* End Exam Page Nav */}

    <li class="nav-item">
      <button class="nav-link collapsed" style={{'border':'none'}} onClick={examHistory}>
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
  <h1>Dashboard</h1>
  <nav>
    <ol class="breadcrumb">
      <li class="breadcrumb-item"><button style={{'border':'none'}} onChange={dashboard}>Home</button></li>
      <li class="breadcrumb-item active"><button style={{'border':'none'}}onChange={dashboard}>Dashboard</button></li>
    </ol>
  </nav>
</div>
{/* <!-- End Page Title --> */}

<section class="section">
  <div class="row">
  <div class="col-lg-6">
          <div class="card">
            <div class="card-body">
              <h4 class="card-title">Today's Exam</h4>
              <center>
              <img src="assets/img/exam.png" style={{'height':'100px' ,'width':'100px'}}></img>
              <h5 class="card-title">Subject: </h5>
              <h2>Advanced Java</h2>
              <button type="button" class="btn btn-lg" style={{'background-color': '#37517e', 'color':'white'}}>Start Exam</button>
              </center>
            </div>
          </div>
    </div>
    <div class="col-lg-6">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Upcoming Exam</h5>

              {/* <!-- Table with stripped rows --> */}
              <table class="table table-striped">
              <thead style={{'background-color': '#37517e','color': 'white'}}>
                  <tr>
                    <th scope="col">id</th>
                    <th scope="col">Exam Name</th>
                    <th scope="col">Exam Date</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>Advanced Java</td>
                    <td>2016-05-25</td>
                  </tr>
                  <tr>
                    <th scope="row">2</th>
                    <td>Operating System</td>
                    <td>2014-12-05</td>
                  </tr>
                  <tr>
                    <th scope="row">3</th>
                    <td>Software Development Methodologies</td>
                    <td>2011-08-12</td>
                  </tr>
                  <tr>
                    <th scope="row">4</th>
                    <td>Web Programming Technologies</td>
                    <td>2012-06-11</td>
                  </tr>
                  <tr>
                    <th scope="row">5</th>
                    <td>Database Technologies</td>
                    <td>2011-04-19</td>
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

{/* <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a> */}

</body>
    </div>
  )
}
