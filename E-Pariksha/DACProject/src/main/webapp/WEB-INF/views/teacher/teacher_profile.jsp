<%@page import="java.util.List"%>
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

<%
Teacher teacherProfile = (Teacher)request.getAttribute("teach");

 %>
<main id="main" class="main">

    <div class="pagetitle">
        <h1>Profile</h1>
        <nav>
          <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="home">Home</a></li>
            <li class="breadcrumb-item active"><a href="teacher_profile">Profile</a></li>
          </ol>
        </nav>
      </div><!-- End Page Title -->
  
      <section class="section profile">
        <div class="row">
          <div class="col-xl-12">
            <div class="card">
              <div class="card-body pt-3">
                <!-- Bordered Tabs -->
                <ul class="nav nav-tabs nav-tabs-bordered">
  
                  <li class="nav-item">
                    <button class="nav-link active" data-bs-toggle="tab" data-bs-target="#profile-overview">Overview</button>
                  </li>
  
                  <li class="nav-item">
                    <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-edit">Edit Profile</button>
                  </li>
  
                  <li class="nav-item">
                    <button class="nav-link" data-bs-toggle="tab" data-bs-target="#profile-change-password">Change Password</button>
                  </li>
  
                </ul>
                <div class="tab-content pt-2">
  
                  <div class="tab-pane fade show active profile-overview" id="profile-overview">
                    <h5 class="card-title">Profile Details</h5>
                    <div class="row">
                      <div class="col-lg-3 col-md-4 label ">First Name</div>
                      <div class="col-lg-9 col-md-8"><%=teacherProfile.getFirstName()%></div>
                    </div>
                    <div class="row">
                        <div class="col-lg-3 col-md-4 label ">Last Name</div>
                        <div class="col-lg-9 col-md-8"><%=teacherProfile.getLastName()%></div>
                      </div>
                    <div class="row">
                      <div class="col-lg-3 col-md-4 label">Mobile Number</div>
                      <div class="col-lg-9 col-md-8"><%=teacherProfile.getMobileNo()%></div>
                    </div>
  
                    <div class="row">
                      <div class="col-lg-3 col-md-4 label">DOB</div>
                      <div class="col-lg-9 col-md-8"><%=teacherProfile.getDob()%></div>
                    </div>
                    <div class="row">
                        <div class="col-lg-3 col-md-4 label">Username</div>
                        <div class="col-lg-9 col-md-8"><%=teacherProfile.getUserName()%></div>
                      </div>
                    <div class="row">
                        <div class="col-lg-3 col-md-4 label">Email</div>
                        <div class="col-lg-9 col-md-8"><%=teacherProfile.getEmailId()%></div>
                      </div>

                    <div class="row">
                      <div class="col-lg-3 col-md-4 label">Teacher Qualification</div>
                      <div class="col-lg-9 col-md-8"><%=teacherProfile.getQualification()%></div>
                    </div>
  
                    <div class="row">
                      <div class="col-lg-3 col-md-4 label">Year Of Experience</div>
                      <div class="col-lg-9 col-md-8"><%=teacherProfile.getExperience()%></div>
                    </div>
                  </div>
  
                  <div class="tab-pane fade profile-edit pt-3" id="profile-edit">
  
                    <!-- Profile Edit Form -->
                    
                    
                    <form:form class="row mb-3" action="teacher_profile" method="post" modelAttribute="updateTeacher" >
  
                      <div class="row mb-3">
                        <label for="firstName" class="col-md-4 col-lg-3 col-form-label">First Name</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="firstName" type="text" class="form-control" id="firstName" value="<%= teacherProfile.getFirstName() %>">
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="lastName" class="col-md-4 col-lg-3 col-form-label">Last Name</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="lastName" type="text" class="form-control" id="lastName" value="<%= teacherProfile.getLastName() %>" >
                        </div>
                      </div>
  
                      <div class="row mb-3">
                        <label for="mobno" class="col-md-4 col-lg-3 col-form-label">Mobile Number</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="mobileNo" type="text" class="form-control" id="mobno" value="<%= teacherProfile.getMobileNo() %>" >
                        </div>
                      </div>
  
                      <div class="row mb-3">
                        <label for="dob" class="col-md-4 col-lg-3 col-form-label">DOB</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="dob" type="text" class="form-control" id="dob" value="<%= teacherProfile.getDob() %>" >
                        </div>
                      </div>
  
                      <div class="row mb-3">
                        <label for="username" class="col-md-4 col-lg-3 col-form-label">Username</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="userName" type="text" class="form-control" id="username" value="<%= teacherProfile.getUserName() %>" >
                        </div>
                      </div>
  
                      <div class="row mb-3">
                        <label for="Email" class="col-md-4 col-lg-3 col-form-label">Email</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="emailId" type="text" class="form-control" id="Email" value="<%= teacherProfile.getEmailId() %>" >
                        </div>
                      </div>
  
                      <div class="row mb-3">
                        <label for="qualification" class="col-md-4 col-lg-3 col-form-label">Teacher Qualification</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="qualification" type="text" class="form-control" id="qualification" value="<%= teacherProfile.getQualification() %>" >
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="experience" class="col-md-4 col-lg-3 col-form-label">Year Of Experience</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="experience" type="text" class="form-control" id="experience" value="<%= teacherProfile.getExperience()%>" >
                        </div>
                      </div>
                      <div class="text-center">
                        <button type="submit" class="btn btn-primary">Save Changes</button>
                      </div>
                    </form:form><!-- End Profile Edit Form -->
  
                  </div>

  
                  <div class="tab-pane fade pt-3" id="profile-change-password">
                    <!-- Change Password Form -->
                    <form>
  
                      <div class="row mb-3">
                        <label for="currentPassword" class="col-md-4 col-lg-3 col-form-label">Current Password</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="password" type="password" class="form-control" id="currentPassword">
                        </div>
                      </div>
  
                      <div class="row mb-3">
                        <label for="newPassword" class="col-md-4 col-lg-3 col-form-label">New Password</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="newpassword" type="password" class="form-control" id="newPassword">
                        </div>
                      </div>
  
                      <div class="row mb-3">
                        <label for="renewPassword" class="col-md-4 col-lg-3 col-form-label">Re-enter New Password</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="renewpassword" type="password" class="form-control" id="renewPassword">
                        </div>
                      </div>
  
                      <div class="text-center">
                        <button type="submit" class="btn btn-primary">Change Password</button>
                      </div>
                    </form><!-- End Change Password Form -->
  
                  </div>
  
                </div><!-- End Bordered Tabs -->
  
              </div>
            </div>
  
          </div>
        </div>
      </section>

  </main><!-- End #main -->
  
  <!-- ======= Footer =======  -->
<%@ include file="teacher_footer.jsp"%>
<!-- End Footer -->