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
// function App() {
//   return (
//     <>
//     {/* <Navbar></Navbar> */}
//     <Dashboard></Dashboard>
//     </>
//   );
// }

function App() {
  return (
   <>
   <Routes>
        <Route path = '/login' element={<LoginPage/>}/>
        <Route path = '/signup' element={<SignUpPage/>}/>
        <Route path = '/dashboard' element={<Dashboard/>}/>
   </Routes>
   < AuthDetails/>
   
   </>
  );
}

export default App;
