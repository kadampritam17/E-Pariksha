import React, { useState } from 'react'
import { Link } from 'react-router-dom';

export default function LoginForm({login}) {

    const [details,setDetails]=useState({username:'',password:''})
    console.log(details)
    const submitHandler = (e) =>{
        e.preventDefault();
        login(details)
        console.log(details);
    }
    return (
        <div>
            <form action="/admin/index.html" className="signin-form" onSubmit={submitHandler}>
                <div className="form-group mb-3">
                    <label className="label" for="name">Username</label>
                    <input type="text" className="form-control" placeholder="Username" onChange={e => setDetails({...details, username: e.target.value})} value={details.username} required />
                </div>
                <div className="form-group mb-3">
                    <label className="label" for="password">Password</label>
                    <input type="password" className="form-control" placeholder="Password" onChange={e => setDetails({...details, password: e.target.value})} value={details.password} required />
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
    )
}
