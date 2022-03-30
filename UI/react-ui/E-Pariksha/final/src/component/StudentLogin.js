import React from 'react'

export default function StudentLogin() {
  return (
    <div>

<head>
	<title>Student Login</title>
</head>

<body>
	<section class="ftco-section">
		<div class="container">
			
			<div class="row justify-content-center">
				<div class="col-md-12 col-lg-10">
					<div class="wrap d-md-flex">
						<div class="img" style={{'background-image': 'url(assets/img/Logo.jpg)'}}>
						</div>
						<div class="login-wrap p-4 p-md-5">
							<div class="d-flex">
								<div class="w-100 ">
									<h3 class="mb-4">Log In</h3>
								</div>
								<div class="w-100">
									<p class="social-media d-flex justify-content-end">
									</p>
								</div>
							</div>
							<form action="/admin/index.html" class="signin-form">
								<div class="form-group mb-3">
									<label class="label" for="name">Username</label>
									<input type="text" class="form-control" placeholder="Username" required/>
								</div>
								<div class="form-group mb-3">
									<label class="label" for="password">Password</label>
									<input type="password" class="form-control" placeholder="Password" required/>
								</div>
								<div class="form-group">
									<button type="submit"
										class="form-control btn btn-primary rounded submit px-3">Login</button>
								</div>
								<div class="form-group d-md-flex">
									<div class="w-50 text-left">
										<label class="checkbox-wrap checkbox-primary mb-0">Remember Me
											<input type="checkbox" checked/>
											<span class="checkmark"></span>
										</label>
									</div>
									<div class="w-50 text-md-right">
										<a href="#">Forgot Password</a>
									</div>
								</div>
							</form>
							<p class="text-center"><a href="/UI/E-Pariksha-UI/login/SignUp.html">Sign Up</a></p>
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
