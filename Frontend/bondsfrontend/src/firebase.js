// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import {getAuth} from "firebase/auth";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyDFb_4J1MjXR8UuWGgOlrxMBo4TrjZqk10",
  authDomain: "bond-login.firebaseapp.com",
  projectId: "bond-login",
  storageBucket: "bond-login.appspot.com",
  messagingSenderId: "445900297837",
  appId: "1:445900297837:web:fe4aeef9051370e81e5164"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);

// Initialize Firebase Authentication and get a reference to the service
export const auth = getAuth(app);
