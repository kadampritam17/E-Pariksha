<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Student"%>
<!-- ======= head ======= -->
<%@ include file="admin_head.jsp"%>
<!-- End head -->

<!-- ======= Header ======= -->
<%@ include file="admin_header.jsp"%>
<!-- End Header -->

<!-- ======= Sidebar ======= -->
<%@ include file="admin_sidebar.jsp"%>
<!-- End Sidebar -->

<%
List<Student> list = (List<Student>) request.getAttribute("students");
%>

<main id="main" class="main">

	<div class="pagetitle">
		<h1>Student</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="admin/home">Home</a></li>
				<li class="breadcrumb-item active"><a href="student">Student</a></li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->

	<section class="section">
		<div class="row">
			<div class="col-lg-12">

				<div class="card">
					<div class="card-body">
						<div class="card-title">
							<a href="student_add" class="btn btn-primary">Add
								Student</a>
						</div>
						<!--  <h5 class="card-title">Datatables</h5>
              <p>Add lightweight datatables to your project with using the <a href="https://github.com/fiduswriter/Simple-DataTables" target="_blank">Simple DataTables</a> library. Just add <code>.datatable</code> class name to any table you wish to conver to a datatable</p>
 -->
						<!-- Table with stripped rows -->
						<table class="table datatable ">
							<thead style="background-color: #37517e; color: white">
								<tr>
									<th scope="col">Id</th>
									<th scope="col">First Name</th>
									<th scope="col">Last Name</th>
									<th scope="col">Mobile Number</th>
									<th scope="col">Date Of Birth</th>
									<th scope="col">Username</th>
									<th scope="col">Password</th>
									<th scope="col">Email Id</th>
									<th scope="col">SSC Marks</th>
									<th scope="col">HSC Marks</th>
									<th scope="col">Degree Marks</th>
									<th scope="col">Is Active</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								for (Student al : list) {
								%>
								<tr>
									<td scope="row"><%=al.getStudentId()%></td>
									<td scope="col"><%=al.getFirstName()%></td>
									<td scope="col"><%=al.getLastName()%></td>
									<td scope="col"><%=al.getMobileNo()%></td>
									<td scope="col"><%=al.getDob()%></td>
									<td scope="col"><%=al.getUserName()%></td>
									<td scope="col"><%=al.getPassword()%></td>
									<td scope="col"><%=al.getEmailId()%></td>
									<td scope="col"><%=al.getSscPercentage()%></td>
									<td scope="col"><%=al.getHscPercentage()%></td>
									<td scope="col"><%=al.getDegreePercentage()%></td>
									<td scope="col"><%=al.getIsActive()%></td>
									<td scope="col"><a href="student_update"
										class="btn btn-primary "><i class="bi-pencil"></i></a><a
										href="#" class="btn btn-danger"><i class="bi-trash"></i></a></td>
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
<%@ include file="admin_footer.jsp"%>
<!-- End Footer -->