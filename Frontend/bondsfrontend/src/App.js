// import logo from './logo.svg';
import './App.css';
import Dashboard from './pages/Dashboard';
import Navbar from './components/Navbar';
import { Route, Routes } from 'react-router-dom';
import LoginPage from './LoginPage';
import AuthDetails from './AuthDetails';
import { useState } from 'react';


function App() {
  const currentPath = window.location.pathname;
  const [authUser,setAuthUser] = useState(null);
  let content;

  // Check the current path and render the appropriate component
  if (currentPath === '/') {
    content = <Dashboard authUser={authUser} />;
  } else if (currentPath === '/login') {
    content = <LoginPage />;
  }

  return (
    <div>
      {content}
      <AuthDetails authUser={authUser} setAuthUser={setAuthUser} />
    </div>
  );
}

export default App;
