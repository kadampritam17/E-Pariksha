<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Exam"%>

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
		<h1>Exam History</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="home">Home</a></li>
				<li class="breadcrumb-item active"><a href="exam_history">Exam
						History</a></li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->
	<%
	List<Exam> list = (List<Exam>) request.getAttribute("exams_history");
	%>
	<section class="section">
		<div class="row">
			<div class="col-lg-12">

				<div class="card">
					<div class="card-body">
						<!--       <h5 class="card-title">Datatables</h5>
              <p>Add lightweight datatables to your project with using the <a href="https://github.com/fiduswriter/Simple-DataTables" target="_blank">Simple DataTables</a> library. Just add <code>.datatable</code> class name to any table you wish to conver to a datatable</p>
 -->
						<!-- Table with stripped rows -->
						<table class="table datatable">
							<thead style="background-color: #37517e; color: white">
								<tr>
									<th scope="col">Id</th>
									<th scope="col">Subject Id</th>
									<th scope="col">Teacher Id</th>
									<th scope="col">Date</th>
									<th scope="col">No Of Questions</th>
									<th scope="col">Marks</th>
									<th scope="col">Actual Time</th>
									<th scope="col">Login Time</th>
									<th scope="col">Status</th>
									<th scope="col">Level</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								for (Exam al : list) {
								%>
								<tr>
									<td scope="row"><%=al.getExamId()%></td>
									<td scope="col"><%=al.getExamName()%></td>
									<td scope="col"><%=al.getExamName()%>Teacher Name</td>
									<td scope="col"><%=al.getExamDate() %></td>
									<td scope="col"><%=al.getNoOfQuestion()%></td>
									<td scope="col"><%=al.getMarks()%></td>
									<td scope="col"><%=al.getActualTime()%></td>
									<td scope="col"><%=al.getLoginTime()%></td>
									<td scope="col"><%=al.getExamStatus()%></td>
									<td scope="col"><%=al.getExamLevel()%></td>
									<td scope="col"><a href="exam_update"
										class="btn btn-primary"><i class="bi-pencil"></i></a><a href="#"
										class="btn btn-danger"><i class="bi-trash"></i></a></td>
								</tr>
								<%
								}
								%>
								
							</tbody>
						</table>
						<!-- End Table with stripped rows -->

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
