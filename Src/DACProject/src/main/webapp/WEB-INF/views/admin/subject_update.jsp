<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Subject"%>


<!-- ======= head ======= -->
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>E-Pariksha</title>
<meta content="" name="description">
<meta content="" name="keywords">

<!-- Favicons -->
<link href="../../../home_assets/img/EPariksha.png" rel="icon">
<link href="../../../home_assets/img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link href="https://fonts.gstatic.com" rel="preconnect">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="../../../home_assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="../../../home_assets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet">
<link href="../../../home_assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="../../../home_assets/vendor/quill/quill.snow.css" rel="stylesheet">
<link href="../../../home_assets/vendor/quill/quill.bubble.css" rel="stylesheet">
<link href="../../../home_assets/vendor/remixicon/remixicon.css" rel="stylesheet">
<link href="../../../home_assets/vendor/simple-datatables/style.css"
	rel="stylesheet">

<!-- Template Main CSS File -->
<link href="../../../home_assets/css/style.css" rel="stylesheet">
</head>
<!-- End head --> 


<body>

<!-- ======= Header ======= -->
<header id="header" class="header fixed-top d-flex align-items-center">
	<div class="d-flex align-items-center justify-content-between">
		<i class="bi bi-list toggle-sidebar-btn"></i> <a href="index.html"
			class="logo d-flex align-items-center"> <img
			src="../../home_assets/img/EPariksha.png" alt=""> <span
			class="d-none d-lg-block">E-Pariksha</span>
		</a>
	</div>
	<!-- End Logo -->

	<nav class="header-nav ms-auto">
		<ul class="d-flex align-items-center">
			<li class="nav-item dropdown pe-3"><a
				class="nav-link nav-profile d-flex align-items-center pe-0" href="#"
				data-bs-toggle="dropdown"> <img
					src="../../home_assets/img/profile-img.jpg" alt="Profile"
					class="rounded-circle"> <span
					class="d-none d-md-block dropdown-toggle ps-2">Admin</span>
			</a> <!-- End Profile Iamge Icon -->

				<ul
					class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
					<li class="dropdown-header">
						<h6>XYZ</h6> <span>Web Designer</span>
					</li>
					<li>
						<hr class="dropdown-divider">
					</li>

					<li><a class="dropdown-item d-flex align-items-center"
						href="user-profile"> <i class="bi bi-person"></i> <span>My
								Profile</span>
					</a></li>
					<li>
						<hr class="dropdown-divider">
					</li>

					<li><a class="dropdown-item d-flex align-items-center"
						href="logout"> <i class="bi bi-box-arrow-right"></i> <span>Sign
								Out</span>
					</a></li>

				</ul> <!-- End Profile Dropdown Items --></li>
			<!-- End Profile Nav -->

		</ul>
	</nav>
	<!-- End Icons Navigation -->
</header>
<!-- End Header -->

<!-- ======= Sidebar ======= -->
<%@ include file="admin_sidebar.jsp"%>
<!-- End Sidebar -->

	<main id="main" class="main">

		<div class="pagetitle">
			<h1>Subject</h1>
			<nav>
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="home">Home</a></li>
					<li class="breadcrumb-item active"><a href="subject">Subject</a></li>
				</ol>
			</nav>
		</div>
		<!-- End Page Title -->

		<section class="section">
			<div class="row">
				<div class="col-lg-12">
<%
Subject subject =  (Subject)request.getAttribute("subject");
	%>
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Update Subject</h5>
							<!--   <p>Browser default validation with using the <code>required</code> keyword. Try submitting the form below. Depending on your browser and OS, you’ll see a slightly different style of feedback.</p>
   -->
							<!-- Browser Default Validation -->
							<form class="row g-3" method="post" action="../subject_update11">
								<!-- <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">ID</label>
                                    
                                </div> -->
                                <input type="hidden" class="form-control" id="validationDefault01" value="<%= subject.getSubjectId() %>" name="id" placeholder="Id" required>
								<div class="col-md-6">
									<label for="validationDefault01" class="form-label">Subject
										Name</label> <input type="text" class="form-control"
										id="validationDefault01" value="<%= subject.getSubjectName() %>" name="subject_name" 
										placeholder="Subject name" required>
								</div>
								<div class="col-md-6"></div>

								<div class="col-md-6">
									<label for="validationDefault01" class="form-label">Description</label>
									<textarea class="form-control" style="height: 100px"
										 name="subject_description"></textarea>
								</div>

								<div class="col-12">
									<button class="btn btn-primary" type="submit">Submit</button>
								</div>
							</form>
							<!-- End Browser Default Validation -->

						</div>
					</div>

				</div>
			</div>
		</section>

	</main>
	<!-- End #main -->


<!-- ======= Footer =======  -->

<!-- <footer id="footer" class="footer">
	<div class="copyright">
		&copy; Copyright <strong><span>E-Pariksha</span></strong>. All Rights
		Reserved
	</div>
	<div class="credits">
		Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
	</div>
</footer> -->
<!-- End Footer -->



<a href="#"
	class="back-to-top d-flex align-items-center justify-content-center">
	<i class="bi bi-arrow-up-short"></i>
</a>

<!-- Vendor JS Files -->
<script src="../../home_assets/vendor/apexcharts/apexcharts.min.js"></script>
<script src="../../home_assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="../../home_assets/vendor/chart.js/chart.min.js"></script>
<script src="../../home_assets/vendor/echarts/echarts.min.js"></script>
<script src="../../home_assets/vendor/quill/quill.min.js"></script>
<script src="../../home_assets/vendor/simple-datatables/simple-datatables.js"></script>
<script src="../../home_assets/vendor/tinymce/tinymce.min.js"></script>
<script src="../../home_assets/vendor/php-email-form/validate.js"></script>

<!-- Template Main JS File -->
<script src="../../home_assets/js/main.js"></script>


</body>

</html>



<%-- <!-- ======= Footer =======  -->
<%@ include file="admin_footer.jsp"%>
<!-- End Footer --> --%>
