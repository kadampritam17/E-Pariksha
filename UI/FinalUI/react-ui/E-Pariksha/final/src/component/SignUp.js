import React from 'react'

export default function SignUp() {
	return (
		<div>
			<head>
				<title>Student Login</title>
				<meta charset="utf-8" />
				<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
				<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet" />
				<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
				<link rel="stylesheet" href="assets/css/stylel.css" />
			</head>
			<body>
				<section class="ftco-section">
					<div class="container-fluid">
						<div class="row justify-content-center">
							<div class="col-md-8 col-lg-10">
								<div class="wrap d-md-flex">
									<div class="img" style={{ 'background-image': 'url(assets/img/Logo.jpg)', 'margin-left': '50px' }}>
									</div>
									<div class="login-wrap p-4 p-md-5">
										<div class="d-flex">
											<div class="w-100 ">
												<h3 class="mb-4"> Sign Up</h3>
											</div>
											<div class="w-100">
												<p class="social-media d-flex justify-content-end">
												</p>
											</div>
										</div>
										<form action="/admin/index.html" class="signin-form">
											<div class="form-group mb-3">
												<label class="label" for="name">First Name</label>
												<input type="text" class="form-control" placeholder="First Name" required />
											</div>
											<div class="form-group mb-3">
												<label class="label" for="password">Mobile No</label>
												<input type="number" class="form-control" placeholder="Mobile No" required />
											</div>
											<div class="form-group mb-3">
												<label class="label" for="password">User Name</label>
												<input type="text" class="form-control" placeholder="User Name" required />
											</div>
											<div class="form-group mb-3">
												<label class="label" for="password">Email Id</label>
												<input type="email" class="form-control" placeholder="Email Id" required />
											</div>
										</form>
									</div>
									<div class="login-wrap p-4 p-md-5">
										<div class="d-flex">
											<div class="w-100 ">
												<h3 class="mb-4">
													<br />
												</h3>
											</div>
											<div class="w-100">
												<p class="social-media d-flex justify-content-end">
												</p>
											</div>
										</div>
										<div class="form-group mb-3">
											<label class="label" for="password">Last Name</label>
											<input type="text" class="form-control" placeholder="Last Name" required />
										</div>
										<div class="form-group mb-3">
											<label class="label" for="password">Date of Birth</label>
											<input type="date" class="form-control" placeholder="Date of Birth" required />
										</div>
										<div class="form-group mb-3">
											<label class="label" for="password">Password</label>
											<input type="password" class="form-control" placeholder="Password" required />
										</div>
										<div class="form-group mb-3">
											<label class="label" style={{ 'padding-top': '18px', 'height': '55px' }}></label>
											<button type="submit"
												class="form-control btn btn-primary rounded submit px-3">Sign Up</button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</body>
		</div>
	)
}
