// import logo from './logo.svg';
import './App.css';
import Dashboard from './pages/Dashboard';
import Navbar from './components/Navbar';
import LoginPage from './LoginPage';
import SignUpPage from './SignUp';
import AuthDetails from './AuthDetails';
import { BrowserRouter } from 'react-router-dom';
import { Route } from 'react-router-dom';
import { Routes } from 'react-router-dom';
import { useState } from 'react';
// function App() {
//   return (
//     <>
//     {/* <Navbar></Navbar> */}
//     <Dashboard></Dashboard>
//     </>
//   );
// }

function App() {

  const [authUser,setAuthUser] = useState(null);
  return (
   <>
   <Routes>
        <Route path = '/' element={<Dashboard authUser={authUser}/>}/>
        <Route path = '/login' element={<LoginPage/>}/>
        <Route path = '/signup' element={<SignUpPage/>}/>
   </Routes>
   < AuthDetails authUser={authUser} setAuthUser={setAuthUser}/>
   
   </>
  );
}

export default App;
