import React from 'react'
import { useNavigate } from 'react-router'
export default function StudentProfile() {
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
      <h1>Profile</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><button style={{'border':'none'}} onClick={dashboard}>Home</button></li>
          <li class="breadcrumb-item active"><button style={{'border':'none'}} onClick={profile}>Profile</button></li>
        </ol>
      </nav>
    </div>
    {/* <!-- End Page Title --> */}

    <section class="section profile">
      <div class="row">
        <div class="col-xl-12">
          <div class="card">
            <div class="card-body pt-3">
              {/* <!-- Bordered Tabs --> */}
              <ul class="nav nav-tabs nav-tabs-bordered">

                <li class="nav-item">
                  <button class="nav-link active" data-bs-toggle="tab" data-bs-target="#profile-overview">Overview</button>
                </li>

                <li class="nav-item">
                  <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-edit">Edit Profile</button>
                </li>

                <li class="nav-item">
                  <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-change-password">Change Password</button>
                </li>

              </ul>
              <div class="tab-content pt-2">

                <div class="tab-pane fade show active profile-overview" id="profile-overview">
                  <h5 class="card-title">Profile Details</h5>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label ">First Name</div>
                    <div class="col-lg-9 col-md-8">Pooja</div>
                  </div>
                  <div class="row">
                      <div class="col-lg-3 col-md-4 label ">Last Name</div>
                      <div class="col-lg-9 col-md-8">Patil</div>
                    </div>
                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Mobile Number</div>
                    <div class="col-lg-9 col-md-8">8622872468</div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">DOB</div>
                    <div class="col-lg-9 col-md-8">1/1/1001</div>
                  </div>
                  <div class="row">
                      <div class="col-lg-3 col-md-4 label">Username</div>
                      <div class="col-lg-9 col-md-8">pooja11</div>
                    </div>
                  <div class="row">
                      <div class="col-lg-3 col-md-4 label">Email</div>
                      <div class="col-lg-9 col-md-8">pooja@example.com</div>
                    </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">SSC Percentage</div>
                    <div class="col-lg-9 col-md-8">90%</div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">HSC Percentage</div>
                    <div class="col-lg-9 col-md-8">70%</div>
                  </div>

                  <div class="row">
                    <div class="col-lg-3 col-md-4 label">Degree Percentage</div>
                    <div class="col-lg-9 col-md-8">80%</div>
                  </div>
                </div>

                <div class="tab-pane fade profile-edit pt-3" id="profile-edit">

                  {/* <!-- Profile Edit Form --> */}
                  <form>

                    <div class="row mb-3">
                      <label for="firstName" class="col-md-4 col-lg-3 col-form-label">First Name</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="firstName" type="text" class="form-control" id="firstName" value="Pooja"/>
                      </div>
                    </div>
                    <div class="row mb-3">
                      <label for="lastName" class="col-md-4 col-lg-3 col-form-label">Last Name</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="lastName" type="text" class="form-control" id="lastName" value="Patil"/>
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="mobno" class="col-md-4 col-lg-3 col-form-label">Mobile Number</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="mobno" type="text" class="form-control" id="mobno" value="8622872468"/>
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="dob" class="col-md-4 col-lg-3 col-form-label">DOB</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="dob" type="text" class="form-control" id="dob" value="1/1/1001"/>
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="username" class="col-md-4 col-lg-3 col-form-label">Username</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="username" type="text" class="form-control" id="username" value="pooja11"/>
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="Email" class="col-md-4 col-lg-3 col-form-label">Email</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="email" type="text" class="form-control" id="Email" value="pooja@example.com"/>
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="ssc" class="col-md-4 col-lg-3 col-form-label">SSC Percentage</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="ssc" type="text" class="form-control" id="ssc" value="90%"/>
                      </div>
                    </div>
                    <div class="row mb-3">
                      <label for="hsc" class="col-md-4 col-lg-3 col-form-label">HSC Percentage</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="hsc" type="text" class="form-control" id="hsc" value="70%"/>
                      </div>
                    </div>
                    <div class="row mb-3">
                      <label for="degree" class="col-md-4 col-lg-3 col-form-label">Degree Percentage</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="degree" type="text" class="form-control" id="degree" value="80%"/>
                      </div>
                    </div>

                    <div class="text-center">
                      <button type="submit" class="btn btn-primary">Save Changes</button>
                    </div>
                  </form>
                  {/* <!-- End Profile Edit Form --> */}

                </div>


                <div class="tab-pane fade pt-3" id="profile-change-password">
                  {/* <!-- Change Password Form --> */}
                  <form>

                    <div class="row mb-3">
                      <label for="currentPassword" class="col-md-4 col-lg-3 col-form-label">Current Password</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="password" type="password" class="form-control" id="currentPassword"/>
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="newPassword" class="col-md-4 col-lg-3 col-form-label">New Password</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="newpassword" type="password" class="form-control" id="newPassword"/>
                      </div>
                    </div>

                    <div class="row mb-3">
                      <label for="renewPassword" class="col-md-4 col-lg-3 col-form-label">Re-enter New Password</label>
                      <div class="col-md-8 col-lg-9">
                        <input name="renewpassword" type="password" class="form-control" id="renewPassword"/>
                      </div>
                    </div>

                    <div class="text-center">
                      <button type="submit" class="btn btn-primary">Change Password</button>
                    </div>
                  </form>
                  {/* <!-- End Change Password Form --> */}

                </div>

              </div>
              {/* <!-- End Bordered Tabs --> */}

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
