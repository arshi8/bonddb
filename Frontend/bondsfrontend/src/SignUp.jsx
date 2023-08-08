import React, { useState } from 'react';
import { auth } from './firebase';
// import { useNavigate } from 'react-router-dom';
import { createUserWithEmailAndPassword } from 'firebase/auth';

const SignUpPage = ({ setLoggedInUser }) => {
//   const navigate = useNavigate();
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const signUp = (e)=>{
    e.preventDefault();
    createUserWithEmailAndPassword(auth, email, password).then( (userCredential)=>{
        console.log(userCredential);
    }).catch((error)=>{
        console.log(error);
    })
  }

  return (
    <div className='l1'>
      <h1 className='l2'>create Account</h1>
      <input className='emailField'type="text" placeholder="Email" value={email} onChange={e => setEmail(e.target.value)} />
      <input className='passwordField' type="password" placeholder="Password" value={password} onChange={e => setPassword(e.target.value)} />
      <button className='LoginButton' onClick={signUp}>signUp</button>
    </div>
  );
};

export default SignUpPage;
