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
      <h1>Exam History</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item active"><a href="examhistory.html">Exam History</a></li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

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
                    <th scope="col">Name</th>
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
                  <tr>
                    <td scope="row">1</td>
                    <td scope="col">Subject Id</td>
                    <td scope="col">Teacher Id</td>
                    <td scope="col">Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">No Of Questions</td>
                    <td scope="col">Marks</td>
                    <td scope="col">Actual Time</td>
                    <td scope="col">Login Time</td>
                    <td scope="col">Status</td>
                    <td scope="col">Level</td>
                    <td scope="col">Action</td>
                  </tr>
                  <tr>
                    <td scope="row">2</td>
                    <td scope="col">Subject Id</td>
                    <td scope="col">Teacher Id</td>
                    <td scope="col">Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">No Of Questions</td>
                    <td scope="col">Marks</td>
                    <td scope="col">Actual Time</td>
                    <td scope="col">Login Time</td>
                    <td scope="col">Status</td>
                    <td scope="col">Level</td>
                    <td scope="col">Action</td>
                  </tr>
                  <tr>
                    <td scope="row">3</td>
                    <td scope="col">Subject Id</td>
                    <td scope="col">Teacher Id</td>
                    <td scope="col">Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">No Of Questions</td>
                    <td scope="col">Marks</td>
                    <td scope="col">Actual Time</td>
                    <td scope="col">Login Time</td>
                    <td scope="col">Status</td>
                    <td scope="col">Level</td>
                    <td scope="col">Action</td>
                  </tr>
                  <tr>
                    <td scope="row">4</td>
                    <td scope="col">Subject Id</td>
                    <td scope="col">Teacher Id</td>
                    <td scope="col">Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">No Of Questions</td>
                    <td scope="col">Marks</td>
                    <td scope="col">Actual Time</td>
                    <td scope="col">Login Time</td>
                    <td scope="col">Status</td>
                    <td scope="col">Level</td>
                    <td scope="col">Action</td>
                  </tr>
                  <tr>
                    <td scope="row">5</td>
                    <td scope="col">Subject Id</td>
                    <td scope="col">Teacher Id</td>
                    <td scope="col">Name</td>
                    <td scope="col">Date</td>
                    <td scope="col">No Of Questions</td>
                    <td scope="col">Marks</td>
                    <td scope="col">Actual Time</td>
                    <td scope="col">Login Time</td>
                    <td scope="col">Status</td>
                    <td scope="col">Level</td>
                    <td scope="col">Action</td>
                  </tr>
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
  