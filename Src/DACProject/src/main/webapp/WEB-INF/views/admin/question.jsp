<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Question"%>
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
List<Question> list = (List<Question>) request.getAttribute("questions");
%>

<main id="main" class="main">

	<div class="pagetitle">
		<h1>Question</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="home">Home</a></li>
				<li class="breadcrumb-item active"><a href="question">Question</a></li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->

	<section class="section">
		<div class="row">
			<div class="col-lg-12">

				<div class="card">
					<div class="card-body">
						<!-- <h5 class="card-title">Datatables</h5>
              <p>Add lightweight datatables to your project with using the <a href="https://github.com/fiduswriter/Simple-DataTables" target="_blank">Simple DataTables</a> library. Just add <code>.datatable</code> class name to any table you wish to conver to a datatable</p>
 -->
						<!-- Table with stripped rows -->
						<table class="table datatable">
							<thead style="background-color: #37517e; color: white">
								<tr>
									<th scope="col">Id</th>
									<th scope="col">Subject Id</th>
									<th scope="col">Question Level</th>
									<th scope="col">Question</th>
									<th scope="col">Option 1</th>
									<th scope="col">Option 2</th>
									<th scope="col">Option 3</th>
									<th scope="col">Option 4</th>
									<th scope="col">Answer</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								for (Question al : list) {
								%>
								<tr>
									<td scope="row"><%=al.getQuestionId()%></td>
									<td scope="col"><%=al.getQuestionId()%> subject name</td>
									<td scope="col"><%=al.getQuestionLevel()%></td>
									<td scope="col"><%=al.getQuestion()%></td>
									<td scope="col"><%=al.getOption1()%></td>
									<td scope="col"><%=al.getOption2()%></td>
									<td scope="col"><%=al.getOption3()%></td>
									<td scope="col"><%=al.getOption4()%></td>
									<td scope="col"><%=al.getAnswer()%></td>
									<td scope="col">
									<!-- <a href="question_update"
										class="btn btn-primary "><i class="bi-pencil"></i></a> -->
										<a
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