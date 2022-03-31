<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Exam"%>
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
					<li class="breadcrumb-item"><a href="admin/home">Home</a></li>
					<li class="breadcrumb-item active"><a href="exam">Subject</a></li>
				</ol>
			</nav>
		</div>
		<!-- End Page Title -->

		<section class="section">
			<div class="row">
				<div class="col-lg-12">

<%
Exam exam =  (Exam)request.getAttribute("exam");
	%>
<%
Subject subject =  (Subject)request.getAttribute("subject");
	%>

					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Add Exam</h5>
							<!--   <p>Browser default validation with using the <code>required</code> keyword. Try submitting the form below. Depending on your browser and OS, you’ll see a slightly different style of feedback.</p>
   -->
							<!-- Browser Default Validation -->
							<form class="row g-3" method="post" action="exam_add">
								
								<div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Subject</label>
                                    <select class="form-select" id="floatingSelect" >
                                      <option selected>Select</option>
                                      <option value="1">java</option>
                                      <option value="2">OS</option>
                                      <option value="3">DSA</option>
                                    </select>
                                 </div>
              
                                 <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Teacher Name</label>
                                    <select class="form-select" id="floatingSelect" >
                                        <option selected>Select</option>
                                        <option value="1">Shrinivas Dhudhani</option>
                                        <option value="2">Prachi Godbole</option>
                                        <option value="3">Janhavi Deo</option>
                                      </select>
                                </div>
                                
                                <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Exam Name</label>
                                    <input type="text" class="form-control"  name="exam_name" placeholder="Subject name"
                                        required>
                                </div>
                                
                                <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Import File</label>
                                    <input type="file" class="form-control" name="import_file" placeholder="Subject name"
                                        required>
                                </div>

                                <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Exam Date</label>
                                    <input type="date" class="form-control" id="validationDefault01"  name="exam_date"
                                        required>
                                </div>
                                <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Exam Time</label>
                                    <input type="time" class="form-control"  name="exam_time"
                                        required>
                                </div>
                                <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Login Time</label>
                                    <input type="time" class="form-control" id="validationDefault01" name="login_time" 
                                        required>
                                </div>
                                
                                
                                <div class="col-md-6">
                                    <label for="validationDefault01" class="form-label">Exam Level</label>
                                    <select class="form-select" id="floatingSelect" >
                                      <option selected>Select</option>
                                      <option value="1">Easy</option>
                                      <option value="2">Medium</option>
                                      <option value="3">Hard</option>
                                    </select>
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
<%@ include file="admin_footer.jsp"%>
<!-- End Footer -->
