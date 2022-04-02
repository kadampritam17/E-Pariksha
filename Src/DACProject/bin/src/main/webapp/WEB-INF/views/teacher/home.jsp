

<!-- ======= head ======= -->
<%@ include file="teacher_head.jsp"%>
<!-- End head -->

<!-- ======= Header ======= -->
<%@ include file="teacher_header.jsp"%>
<!-- End Header -->

<!-- ======= Sidebar ======= -->
<%@ include file="teacher_sidebar.jsp"%>
<!-- End Sidebar -->


<main id="main" class="main">

	<div class="pagetitle">
		<h1>Dashboard</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="admin_home">Home</a></li>
				<li class="breadcrumb-item active">Dashboard</li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->
	<%
		Integer studCount = (Integer) request.getAttribute("studCount");
		Integer subCount = (Integer) request.getAttribute("subCount");
		Integer examCount = (Integer) request.getAttribute("examCount");
		
	%>
	<section class="section">
		<div class="row">
			<div class="col-lg-12">

				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Dashboard</h5>

						<section class="section mx-auto d-block">
							<div class="row">
								<div class="container">

									<div class="row-lg-3">

										<!-- Card with an image on top -->
										<div class="card"
											style="width: 20%; float: left; padding: 15px; margin-left: 15%; margin-right: 5%;">

											<img src="/home_assets/img/img1.png"
												class="mx-auto d-block" height="30%" width="30%"
												style="text-align: center;">

											<div class="card-body" style="align-items: center;">
												<h5 class="card-title" style="text-align: center;">Total
													Number of Students</h5>
												<h5 class="card-text" style="text-align: center;"><%= studCount %></h5>
											</div>

										</div>
										<!-- End Card with an image on top -->
									</div>


									<div class="row-lg-3">

										<!-- Card with an image on top -->
										<div class="card"
											style="width: 20%; float: left; padding: 15px; margin-right: 5%;">
											<img
												src="/home_assets/img/img3.png"
												class="mx-auto d-block" height="30%" width="30%"
												style="text-align: center;">
											<div class="card-body" style="align-items: center;">
												<h5 class="card-title" style="text-align: center;">Total
													Number of Subjects</h5>
												<h5 class="card-text" style="text-align: center;"><%= subCount %></h5>
											</div>
										</div>
										<!-- End Card with an image on top -->
									</div>

									<div class="row-lg-3">

										<!-- Card with an image on top -->
										<div class="card"
											style="width: 20%; float: left; padding: 15px;">
											<img src="/home_assets/img/img2.png"
												class="mx-auto d-block" height="25%" width="30%"
												style="text-align: center;">
											<div class="card-body" style="align-items: center;">
												<h5 class="card-title" style="text-align: center;">Total
													Number of Exam</h5>
												<h5 class="card-text" style="text-align: center;"><%= examCount %></h5>
											</div>
										</div>
										<!-- End Card with an image on top -->
									</div>




									<div class="col-md-6">
										<div class="card" style="min-width: 140%; margin-left: 30%;">
											<div class="card-body">
												<h5 class="card-title">Student Attendence for exam</h5>

												<!-- Bar Chart -->
												<div id="barChart" style="min-height: 300px;" class="echart"></div>

												<script>
                        document.addEventListener("DOMContentLoaded", () => {
                          echarts.init(document.querySelector("#barChart")).setOption({
                            xAxis: {
                              type: 'category',
                              data: ['Sub1', 'Sub2', 'Sub3', 'Sub4', 'Sub5']
                            },
                            yAxis: {
                              type: 'value'
                            },
                            series: [{
                              data: [120, 200, 150, 80, 70],
                              type: 'bar'
                            }]
                          });
                        });
                      </script>
												<!-- End Bar Chart -->

											</div>
										</div>
									</div>


								</div>
							</div>
						</section>

						<!-- <section>
                <div class="row-md-0">
                  <div class="card" style="margin-left : 1150px; min-width: 400px; ">
                    <div class="card-body">
                      <h5 class="card-title">Pie Chart</h5>
        
                       Pie Chart 
                      <canvas id="pieChart" style="max-height: 400px;" ></canvas>
                      <script>
                        document.addEventListener("DOMContentLoaded", () => {
                          new Chart(document.querySelector('#pieChart'), {
                            type: 'pie',
                            data: {
                              labels: [
                                'Present Students',
                                'Passed Students',
                                'Failed Students'
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
                       End Pie CHart 
        
                    </div>
                  </div>
                </div>
              </section> -->

					</div>
				</div>

			</div>
		</div>
	</section>

</main>
<!-- End #main -->

<!-- ======= Footer =======  -->
<%@ include file="teacher_footer.jsp"%>
<!-- End Footer -->