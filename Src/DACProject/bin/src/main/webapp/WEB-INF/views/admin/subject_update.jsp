<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Subject"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
							<form:form class="row g-3" method="post" action="subject_update"  modelAttribute="formsubject">
								<!-- <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">ID</label>
                                    
                                </div> -->
                                <input type="hidden" class="form-control" id="validationDefault01" value="<%= subject.getSubjectId() %>" name="subjectId" placeholder="Id" required>
								<div class="col-md-6">
									<label for="validationDefault01" class="form-label">Subject
										Name</label> <input type="text" class="form-control"
										id="validationDefault01" value="<%= subject.getSubjectName() %>" name="subjectName" 
										placeholder="Subject name" required>
								</div>
								<div class="col-md-6"></div>

								<div class="col-md-6">
									<label for="validationDefault01" class="form-label">Description</label>
									<textarea class="form-control" style="height: 100px"
										 name="subjectDescription"></textarea>
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
<%@ include file="admin_footer.jsp"%>
<!-- End Footer -->

