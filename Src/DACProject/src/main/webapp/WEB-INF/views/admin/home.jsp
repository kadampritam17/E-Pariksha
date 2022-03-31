
<!-- ======= head ======= -->
<%@ include file="admin_head.jsp"%>
<!-- End head -->

<!-- ======= Header ======= -->
<%@ include file="admin_header.jsp"%>
<!-- End Header -->

<!-- ======= Sidebar ======= -->
<%@ include file="admin_sidebar.jsp"%>
<!-- End Sidebar -->

<main id="main" class="main">

	<div class="pagetitle">
		<h1>Dashboard</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="admin/home">Home</a></li>
				<li class="breadcrumb-item active">Dashboard</li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->
	
	<%
		Integer studCount = (Integer) request.getAttribute("studCount");
		Integer subCount = (Integer) request.getAttribute("subCount");
		Integer examCount = (Integer) request.getAttribute("examCount");
		Integer teacherCount = (Integer) request.getAttribute("teacherCount");
		
	%>

	<section class="section">
      <div class="row">
        <div class="col-lg-12">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Dashboard</h5>

              <section class="section" style="text-align: center;">
                <div class="row">
                  <div class="container">

                <div class="row-lg-3">

                  <!-- Card with an image on top -->
                  <div class="card" style="width: 20%; float: left; padding: 15px;margin-left: 2%; margin-right: 5%;">
                    
                    <img src="/home_assets/img/img1.png" class="mx-auto d-block" height="30%" width="30%" style="text-align: center;">
                   
                    <div class="card-body" style="align-items: center;">
                      <h5 class="card-title" style="text-align: center;">Total Number of Students</h5>
                      <h5 class="card-text" style="text-align: center;"><%= studCount %></h5>
                    </div>
                  
                  </div><!-- End Card with an image on top -->
                </div>

                <div class="row-lg-3">

                  <!-- Card with an image on top -->
                  <div class="card" style="width: 20%; float: left; padding: 15px; margin-right: 5%;">
                    <img src="/home_assets/img/img4.png" class="mx-auto d-block" height="30%" width="30%" style="text-align: center;">
                    <div class="card-body" style="align-items: center;">
                      <h5 class="card-title" style="text-align: center;">Total Number of Teachers</h5>
                      <h5 class="card-text" style="text-align: center;"><%= teacherCount %></h5>
                    </div>
                  </div><!-- End Card with an image on top -->
                </div>


                <div class="row-lg-3">

                  <!-- Card with an image on top -->
                  <div class="card" style="width: 20%; float: left; padding: 15px; margin-right: 5%;">
                    <img src="/home_assets/img/img3.png" class="mx-auto d-block" height="30%" width="30%" style="text-align: center;">
                    <div class="card-body" style="align-items: center;">
                      <h5 class="card-title" style="text-align: center;">Total Number of Subjects</h5>
                      <h5 class="card-text" style="text-align: center;"><%= subCount %></h5>
                    </div>
                  </div><!-- End Card with an image on top -->
                </div>

                <div class="row-lg-3">

                  <!-- Card with an image on top -->
                  <div class="card" style="width: 20%; float: left; padding: 15px;">
                    <img src="/home_assets/img/img2.png" class="mx-auto d-block" height="25%" width="30%" style="text-align: center;">
                    <div class="card-body" style="align-items: center;" >
                      <h5 class="card-title" style="text-align: center;">Total Number of Exam</h5>
                      <h5 class="card-text" style="text-align: center;"><%= examCount %></h5>
                    </div>
                  </div><!-- End Card with an image on top -->
                </div>

            </div>
          </div>

          <section>
            <div class="row">
      
              <div class="col-lg-6">
                <div class="card">
                  <div class="card-body">
                    <h5 class="card-title">Student Progress Chart</h5>
      
                    <!-- Line Chart -->
                    <canvas id="lineChart" style="max-height: 400px;"></canvas>
                    <script>
                      document.addEventListener("DOMContentLoaded", () => {
                        new Chart(document.querySelector('#lineChart'), {
                          type: 'line',
                          data: {
                            labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
                            datasets: [{
                              label: 'Student Progress',
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
                        });
                      });
                    </script>
                    <!-- End Line CHart -->
      
                  </div>
                </div>
              </div>

              <div class="col-lg-6">
                <div class="card">
                  <div class="card-body">
                    <h5 class="card-title">All Sources</h5>
      
                    <!-- Doughnut Chart -->
                    <canvas id="doughnutChart" style="max-height: 365px;"></canvas>
                    <script>
                      document.addEventListener("DOMContentLoaded", () => {
                        new Chart(document.querySelector('#doughnutChart'), {
                          type: 'doughnut',
                          data: {
                            labels: [
                              'Students',
                              'Exams',
                              'Questions'
                            ],
                            datasets: [{
                              label: 'My First Dataset',
                              data: [300, 50, 100],
                              backgroundColor: [
                                'rgb(255, 99, 132)',
                                'rgb(54, 162, 235)',
                                'rgb(255, 205, 86)'
                              ],
                              hoverOffset: 4
                            }]
                          }
                        });
                      });
                    </script>
                    <!-- End Doughnut CHart -->
      
                  </div>
                </div>
              </div>
          </section>

        </div>
      </div>
    </section>

</main>
<!-- End #main -->


<!-- ======= Footer =======  -->
<%@ include file="admin_footer.jsp"%>
<!-- End Footer -->

