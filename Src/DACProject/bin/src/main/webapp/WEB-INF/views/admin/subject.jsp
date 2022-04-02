<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


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
		<h1>Subject</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="home">Home</a></li>
				<li class="breadcrumb-item active"><a href="subject">Subject</a></li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->
	<%
	List<Subject> list = (List<Subject>) request.getAttribute("subjects");
	%>
	<section class="section">
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-body">
						<div class="card-title">
							<a href="subject_add" class="btn btn-primary">Add Subject</a>
						</div>
						<!--  <h5 class="card-title">Datatables</h5>
              					<p>Add lightweight datatables to your project with using the <a href="https://github.com/fiduswriter/Simple-DataTables" target="_blank">Simple DataTables</a> library. Just add <code>.datatable</code> class name to any table you wish to conver to a datatable</p>-->
						<!-- Table with stripped rows -->
						<table class="table datatable">
							<thead style="background-color: #37517e; color: white">
								<tr>
									<th scope="col">Id</th>
									<th scope="col">Subject Name</th>
									<th scope="col">Description</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								for (Subject al : list) {
								%>
								<tr>
									<td scope="row"><%=al.getSubjectId()%></td>
									<td scope="col"><%=al.getSubjectName()%></td>
									<td scope="col"><%=al.getSubjectDescription()%></td>
									<td scope="col"><a
										href="subject_update?id=<%=al.getSubjectId()%>"
										class="btn btn-primary"><i class="bi-pencil"></i></a> <a
										href="delete/<%=al.getSubjectId()%>" class="btn btn-danger"><i class="bi-trash"></i></a></td>
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

