<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Teacher"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<header id="header" class="header fixed-top d-flex align-items-center">
	<div class="d-flex align-items-center justify-content-between">
		<i class="bi bi-list toggle-sidebar-btn"></i> <a href="home"
			class="logo d-flex align-items-center"> <img
			src="../home_assets/img/EPariksha.png" alt=""> <span
			class="d-none d-lg-block">E-Pariksha</span>
		</a>
	</div>
	<!-- End Logo -->
<%
Teacher teacherName = (Teacher)request.getAttribute("teach");
 %>
 
	<nav class="header-nav ms-auto">
		<ul class="d-flex align-items-center">
			<li class="nav-item dropdown pe-3">
			<a
				class="nav-link nav-profile d-flex align-items-center pe-0" href="#"
				data-bs-toggle="dropdown"> 
				<img
					src="../home_assets/img/admin.png" alt="Profile"
					class="rounded-circle"> 
					<span
					class="d-none d-md-block dropdown-toggle ps-2"> <%= teacherName.getFirstName() %> <%= teacherName.getLastName() %></span>
			</a> <!-- End Profile Iamge Icon -->

				<ul
					class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
					<li class="dropdown-header">
						<h6><%= teacherName.getFirstName() %> <%= teacherName.getLastName() %> </h6> <span><%= teacherName.getQualification() %></span>
					</li>
					<li>
						<hr class="dropdown-divider">
					</li>

					<li><a class="dropdown-item d-flex align-items-center"
						href="teacher_profile"> <i class="bi bi-person"></i> <span>My
								Profile</span>
					</a></li>
					<li>
						<hr class="dropdown-divider">
					</li>

					<li><a class="dropdown-item d-flex align-items-center"
						href="teacherlogout"> <i class="bi bi-box-arrow-right"></i> <span>Sign
								Out</span>
					</a></li>

				</ul> <!-- End Profile Dropdown Items --></li>
			<!-- End Profile Nav -->

		</ul>
	</nav>
	
	<!-- End Icons Navigation -->
</header>