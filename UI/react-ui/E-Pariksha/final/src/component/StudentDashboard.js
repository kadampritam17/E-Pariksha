import React from 'react'

export default function StudentDashboard() {
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
      <a class="nav-link collapsed" href="index.html">
        <i class="bi bi-grid"></i>
        <span>Dashboard</span>
      </a>
    </li>
    {/* <!-- End Dashboard Nav --> */}

    <li class="nav-item">
      <a class="nav-link collapsed" href="exam.html">
        <i class="bi bi-card-list"></i>
        <span>Exam</span>
      </a>
    </li>
    {/* End Exam Page Nav */}

    <li class="nav-item">
      <a class="nav-link collapsed" href="examhistory.html">
        <i class="bi bi-box-arrow-in-right"></i>
        <span>Exam History</span>
      </a>
    </li>
    {/* End Exam History Page Nav */}
  </ul>

</aside>
{/* End Sidebar */}

<main id="main" class="main" style={{'background':'white'}}>

  <div class="pagetitle">
    <h1>Student</h1>
    <nav>
      <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="index.html">Home</a></li>
        <li class="breadcrumb-item active"><a href="student.html">Student</a></li>
      </ol>
    </nav>
  </div>
  {/* End Page Title */}

  <section class="section">
    <div class="row">
      <div class="col-lg-12">
        </div>
        
    </div>
  </section>

</main>
{/* End #main */}

{/* <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a> */}

</body>
    </div>
  )
}
