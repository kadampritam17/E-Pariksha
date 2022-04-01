import React from 'react'
import { useNavigate } from 'react-router'
export default function ExamHistory() {
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
function profile()
  {
    navigate('/profile')
  }
  return (
<>
       

{/* <head>
  <meta charset="utf-8"/>
  <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

  <title>E-Pariksha</title>
  <meta content="" name="description"/>
  <meta content="" name="keywords"/>

  {/* <!-- Favicons --> 
  <link href="assets/img/EPariksha.png" rel="icon"/>
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon"/>

  {/* <!-- Google Fonts --> 
  <link href="https://fonts.gstatic.com" rel="preconnect"/>
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet"/>

  {/* <!-- Vendor CSS Files --> 
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet"/>
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet"/>
  <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet"/>
  <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet"/>
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet"/>
  <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

  {/* <!-- Template Main CSS File --> 
  <link href="assets/css/style.css" rel="stylesheet">

</head> */}

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
        <img src="assets/img/profile.jfif" alt="Profile" class="rounded-circle"/>
        <span class="d-none d-md-block dropdown-toggle ps-2">Student</span>
      </a>
      {/* <!-- End Profile Image Icon --> */}

      <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
        <li class="dropdown-header">
          <h6>XYZ</h6>
          <span>Web Designer</span>
        </li>
        <li>
          <hr class="dropdown-divider"/>
        </li>

        <li>
          <button class="dropdown-item d-flex align-items-center" style={{'border':'none'}} onClick={profile}>
            <i class="bi bi-person"></i>
            <span>My Profile</span>
          </button>
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
      <h1>Exam History</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><button style={{'border':'none'}} onClick={dashboard}>Home</button></li>
          <li class="breadcrumb-item active"><button style={{'border':'none'}} onClick={examHistory}>Exam History</button></li>
        </ol>
      </nav>
    </div>
    {/* <!-- End Page Title --> */}

    <section class="section">
      <div class="row">
      <div class="col-lg-12">

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


    </>
  )
}