import React from 'react'

export default function ExamHistory() {
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
              <img src="assets/img/profile-img.jpg" alt="Profile" class="rounded-circle"/>
              <span class="d-none d-md-block dropdown-toggle ps-2">K. Anderson</span>
            </a>
            {/* <!-- End Profile Iamge Icon --> */}
  
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
      <h1>Exam History</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item active"><a href="examhistory.html">Exam History</a></li>
        </ol>
      </nav>
    </div>
    {/* <!-- End Page Title --> */}

    <section class="section">
      <div class="row">
        <div class="col-lg-12">

          <div class="card">
            <div class="card-body">
        {/* <!--       <h5 class="card-title">Datatables</h5>
              <p>Add lightweight datatables to your project with using the <a href="https://github.com/fiduswriter/Simple-DataTables" target="_blank">Simple DataTables</a> library. Just add <code>.datatable</code> class name to any table you wish to conver to a datatable</p>
 --> */}
              {/* <!-- Table with stripped rows --> */}
              <table class="table datatable">
                <thead style={{'background-color': '#37517e', 'color': 'white'}}>
                  <tr>
                    <th scope="col">Exam Name</th>
                    <th scope="col">Date</th>
                    <th scope="col">Marks</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td scope="col">Exam Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">Marks</td>
                  </tr>
                  <tr>
                    <td scope="col">Exam Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">Marks</td>
                  </tr>
                  <tr>
                    <td scope="col">Exam Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">Marks</td>
                  </tr>
                  <tr>
                    <td scope="col">Exam Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">Marks</td>
                  </tr>
                  <tr>
                    <td scope="col">Exam Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">Marks</td>
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