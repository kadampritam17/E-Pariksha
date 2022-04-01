

<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Exam"%>
<%@page import="com.java.epariksha.entity.Subject"%>
<%@page import="com.java.epariksha.entity.Teacher"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
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
		<h1>Exam</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="teacher/home">Home</a></li>
				<li class="breadcrumb-item active"><a href="exam">Exam</a></li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->

<%
Exam exam =  (Exam)request.getAttribute("exam");
Teacher teacher = (Teacher)request.getAttribute("teach");

List<Subject> list = (List<Subject>) request.getAttribute("subjects");
%>
	
	
	<section class="section">
		<div class="row">
			<div class="col-lg-12">


				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Add Exam <%= teacher.getExperience() %></h5>

				<form:form class="row g-3" method="post" action="exam_add"  modelAttribute="formexam">
											

							<div class="col-md-6">
								<label for="validationDefault01" class="form-label">Subject</label>
								<select class="form-select" id="floatingSelect" name = "subjectId">
									<option selected>Select</option>
										 <%
								for (Subject al : list) {
								%>
									<option value="<%=al.getSubjectId()%>"><%=al.getSubjectName()%></option>
									
									<%
								}
								%>
								</select>
							</div>

							<input type="hidden" class="form-control" value =<%= teacher.getTeacherId() %> name="teacherId"
									 >
							

							<div class="col-md-6">
								<label for="validationDefault01" class="form-label">Exam
									Name</label> <input type="text" class="form-control" name="examName"
									placeholder="Subject name" required>
							</div>

							<div class="col-md-6">
								<label for="validationDefault01" class="form-label">Import
									File</label> <input type="file" class="form-control" name="import_file"
									placeholder="Upload CSV file">
							</div>

							<div class="col-md-6">
								<label for="validationDefault01" class="form-label">Exam
									Date</label> <input type="date" class="form-control"
									id="validationDefault01" name="examDate" required>
							</div>
							<div class="col-md-6">
								<label for="validationDefault01" class="form-label">Exam
									Time</label> <input type="time" class="form-control" name="actualTime"
                                        required>
							</div>
							<div class="col-md-6">
								<label for="validationDefault01" class="form-label">Login
									Time</label> <input type="time" class="form-control"
									id="validationDefault01" name="loginTime" required>
							</div>


							<div class="col-md-6">
								<label for="validationDefault01" class="form-label">Exam
									Level</label> <select class="form-select" id="floatingSelect" name="examLevel" required>
									<option selected>Select</option>
									<option value="Easy">Easy</option>
									<option value="Medium">Medium</option>
									<option value="Hard">Hard</option>
								</select>
							</div>

							<div class="col-12">
								<button class="btn btn-primary" type="submit">Submit</button>
							</div>
						</form:form>
						<!-- End Browser Default Validation -->
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