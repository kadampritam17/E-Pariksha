import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import LoginForm from '../unused/LoginForm'
// import Axios from 'axios'
//const loginUrl="/login"

export default function StudentLogin() {

	// const [post,setPost]=useState(null)
	// useEffect(() => {
	// 	Axios.get(`${loginUrl}`).then((response) => {setPost(response.data)})
	// },[]);



	// function createPost()
	// {
	// 	Axios.post(loginUrl,{}).then((response) => {setPost(response.data)});
	// }



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
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-md-12 col-lg-10">
								<div class="wrap d-md-flex">
									<div class="img" style={{ 'background-image': 'url(assets/img/Logo.jpg)' }}>
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
										<div>
											<form action="/admin/index.html" className="signin-form" >
												<div className="form-group mb-3">
													<label className="label" for="name">Username</label>
													<input type="text" className="form-control" placeholder="Username" required />
												</div>
												<div className="form-group mb-3">
													<label className="label" for="password">Password</label>
													<input type="password" className="form-control" placeholder="Password" required />
												</div>
												<div className="form-group">
													<Link to="/dashboard">
														<button type="submit"
															className="form-control btn btn-primary rounded submit px-3">Login</button>
													</Link>
												</div>
												<div className="form-group d-md-flex">
													<div className="w-50 text-left">
														<label className="checkbox-wrap checkbox-primary mb-0">Remember Me
															<input type="checkbox" checked />
															<span className="checkmark"></span>
														</label>
													</div>
													<div className="w-50 text-md-right">
														<a href="#">Forgot Password</a>
													</div>

												</div>
											</form>
										</div>
										<Link to='/signup'>
											<p class="text-center"><a href="/UI/E-Pariksha-UI/login/SignUp.html">Sign Up</a></p>
										</Link>
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
