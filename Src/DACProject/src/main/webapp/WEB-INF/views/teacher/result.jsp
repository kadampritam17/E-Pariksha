<%@page import="java.util.List"%>
<%@page import="com.java.epariksha.entity.Result"%>


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
		<h1>Result</h1>
		<nav>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="home">Home</a></li>
				<li class="breadcrumb-item active"><a href="result">Result</a></li>
			</ol>
		</nav>
	</div>
	<!-- End Page Title -->
    <%
    List<Result> list = (List<Result>) request.getAttribute("results");
%>
<section class="section">
    <div class="row">
        <div class="col-lg-12">
            <div class="card">
                <div class="card-body">

        <table class="table datatable">
                        <thead style="background-color: #37517e; color: white">
                            <tr>
                               <th scope="col">Id</th>
                               <th scope="col">Student Id</th>
                               <th scope="col">Marks</th>
                               <th scope="col">Exam Name</th>
                            </tr>
                        </thead>
                        <tbody>          
                            <%
								for (Result al : list) {
								%>
                                    <tr>
                                        <td scope="row"><%=al.getResultId()%></td>
									<td scope="col"><%=al.getStudent()%></td>
									<td scope="col"><%=al.getMarks()%></td>
									<td scope="col"><%=al.getExam()%></td>
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
