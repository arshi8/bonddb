import React ,{useEffect,useState}from "react";
import { auth } from "./firebase";
import { onAuthStateChanged, signOut } from "firebase/auth";
import "./login.css"
const AuthDetails = ({authUser,setAuthUser})=>{
    // const [authUser,setAuthUser] = useState(null);
    useEffect(()=>{
        const listen = onAuthStateChanged(auth,(user)=>{
            if(user){
                setAuthUser(user)
            }else{
                setAuthUser(null)
            }
        });
        return ()=>{
            listen();
        }
    },[])
    const userSignOut = ()=>{
        signOut(auth).then(()=>{
            console.log('sign out successful')
        }).catch(error=>console.log(error))
    }
    return(
        <div>
            { authUser ? <><p>{`Signed In as ${authUser.email }`}</p><button onClick={userSignOut}>Sign Out</button></> : <p> Please Log in</p>}
        </div>
    )
}

export default AuthDetails;