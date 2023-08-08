import React, { useState } from 'react';
import { auth } from './firebase';
// import { useNavigate } from 'react-router-dom';
import { signInWithEmailAndPassword } from 'firebase/auth';
import "./login.css"

const LoginPage = ({ setLoggedInUser }) => {
//   const navigate = useNavigate();
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const logIn = (e)=>{
    e.preventDefault();
    signInWithEmailAndPassword(auth, email, password).then( (userCredential)=>{
        console.log(userCredential);
    }).catch((error)=>{
        console.log(error);
    })
  }

  return (
    <div class="l1">
      <h1 class = "l2">Login Page</h1>
      <input type="text" placeholder="Email" value={email} onChange={e => setEmail(e.target.value)}  class="l3"/>
      <input type="password" placeholder="Password" value={password} onChange={e => setPassword(e.target.value)} class="l4" />
      <button onClick={logIn} class="l5">Login</button>
    </div>
  );
};

export default LoginPage;
