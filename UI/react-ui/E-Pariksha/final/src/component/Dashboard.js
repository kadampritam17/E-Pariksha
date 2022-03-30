import React from 'react'

export default function Dashboard() {
  return (
    <div>
        {/* <div class="col-lg-6">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Line Chart</h5>

              {/* <!-- Line Chart -->
              <canvas id="lineChart" style="max-height: 400px;"></canvas>
              <script>
                document.addEventListener("DOMContentLoaded", () = {
                  new Chart(document.querySelector('#lineChart'), {
                    type: 'line',
                    data: {
                      labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
                      datasets: [{
                        label: 'Line Chart',
                        data: [65, 59, 80, 81, 56, 55, 40],
                        fill: false,
                        borderColor: 'rgb(75, 192, 192)',
                        tension: 0.1
                      }]
                    },
                    options: {
                      scales: {
                        y: {
                          beginAtZero: true
                        }
                      }
                    }
                  })
                });
              </script>
              {/* <!-- End Line Chart --> 
            </div>
          </div>
        </div> */}
        {/* <style>
        .container {
        display: flex;
        justify-content: space-between;
        flex-direction: row;
        flex-wrap: wrap;
        }
        .card{
        border:1px solid black;
        }
        </style> */}
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
          <img src="assets/img/profile-img.jpg" alt="Profile" class="rounded-circle"/>
          <span class="d-none d-md-block dropdown-toggle ps-2">K. Anderson</span>
        </a>
        {/* <!-- End Profile Image Icon --> */}

        <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
          <li class="dropdown-header">
            <h6>Ram</h6>
            <span>PRN-111</span>
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

<main id="main" class="main">

<div class="pagetitle">
  <h1>Student Dashboard</h1>
  <nav>
    <ol class="breadcrumb">
      <li class="breadcrumb-item"><a href="index.html">Home</a></li>
      <li class="breadcrumb-item active"><a href="examhistory.html">Student Dashboard</a></li>
    </ol>
  </nav>
</div>
{/* <!-- End Page Title --> */}

<section class="section">
  <div class="row">
    <div class="col-lg-12">
    <div class="container">
    <div class="card mr-3" style={{'width': '30%', 'float': 'left','padding': '10px'}}>
      <h2>I'm a card</h2>
    </div>
    <div class="card mr-3" style={{'width': '30%', 'float': 'left','padding': '10px'}}>
      <h2>I'm a card</h2>
    </div>
    <div class="card mr-3" style={{'width': '30%', 'float': 'left','padding': '10px'}}>
      <h2>I'm a card</h2>
    </div>
    <div class="card mr-3" style={{'width': '30%', 'float': 'left','padding': '10px'}}>
      <h2>I'm a card</h2>
    </div>
    <div class="card mr-3" style={{'width': '30%', 'float': 'left','padding': '10px'}}>
      <h2>I'm a card</h2>
    </div>
    <div class="card mr-3" style={{'width': '30%', 'float': 'left','padding': '10px'}}>
      <h2>I'm a card</h2>
    </div>
  </div>
    </div>
  </div>
</section>

</main>
{/* <!-- End #main --> */}

{/* <!-- ======= Footer =======  */}
<footer id="footer" class="footer">
<div class="copyright">
  &copy; Copyright <strong><span>E-Pariksha</span></strong>. All Rights Reserved
</div>
<div class="credits">
       Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a> 
</div>
</footer>
{/* End Footer --> */}

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

{/* <!-- Vendor JS Files --> */}
<script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/chart.js/chart.min.js"></script>
<script src="assets/vendor/echarts/echarts.min.js"></script>
<script src="assets/vendor/quill/quill.min.js"></script>
<script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
<script src="assets/vendor/tinymce/tinymce.min.js"></script>
<script src="assets/vendor/php-email-form/validate.js"></script>

{/* <!-- Template Main JS File --> */}
<script src="assets/js/main.js"></script>
</body>
    </div>
  )
}
