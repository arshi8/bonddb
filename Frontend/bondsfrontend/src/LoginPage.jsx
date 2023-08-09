import React, { useState } from 'react';
import { auth } from './firebase';
// import { useNavigate } from 'react-router-dom';
import { signInWithEmailAndPassword } from 'firebase/auth';
import "./login.css"
import Logo_gmnc from "./icons/Logo_gmnc.svg"
import ProfileFace from "./icons/Profile_gmnc.png"
// import { useNavigate } from 'react-router-dom';
import { Link, useNavigate } from 'react-router-dom';


const LoginPage = ({ setLoggedInUser }) => {
  const navigate = useNavigate();
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const logIn = (e)=>{
    // const navigate = useNavigate();
    e.preventDefault();
    signInWithEmailAndPassword(auth, email, password).then( (userCredential)=>{
        console.log(userCredential);
    }).catch((error)=>{
        console.log(error);
    })
    navigate('/dashboard');
  }


  return (
    <body>
		<div className="header">
			<img src={Logo_gmnc} width={80} height={80}/>
			<h1 className="companyName">German MNC Security Trading Library</h1>
		</div>
		<div className="main">
			<div className="loginBox">
				<img className="chehra" src={ProfileFace}/>
				<input className="emailField" type="text" placeholder=" Email" value={email} onChange={e => setEmail(e.target.value)}/>
				<input className="passwordField" type="password" placeholder=" Password" value={password} onChange={e => setPassword(e.target.value)}/>
				<button className="loginButton" onClick={logIn}>Login</button>
        <div className='signup-link'>Don't have an account yet? <Link to="/signup">Create one.</Link></div>
			</div>
		</div>
    
		
    </body>
    // <div class="main">
    //   <h1 class = "l2">Login Page</h1>
    //   <input type="text" placeholder="Email" value={email} onChange={e => setEmail(e.target.value)}  class="l3"/>
    //   <input type="password" placeholder="Password" value={password} onChange={e => setPassword(e.target.value)} class="l4" />
    //   <button onClick={logIn} class="l5">Login</button>
    // </div>
  );
};

export default LoginPage;
