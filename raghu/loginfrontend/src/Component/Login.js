import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { loginUser } from "../strore";
import TextField  from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';

import { Box } from "@mui/material";

const Login = () => {

    const [userName, setuserName] = useState('');
    const [password, setpassword] = useState('');
    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await loginUser(userName, password);
            // const success= await response.data;
            console.log("response >> ", response);
            if (response.toLowerCase() === "successfully logged in".toLowerCase()) {
                navigate('/dashboard');
            } else {
                console.error('Login failed:', response.error); // Handle error response from API
            }
        } catch (error) {
            console.error('Login error:', error);
            // Handle error, e.g., show error message to the user
        }
    };


    return (
         <div className="login" >
           
            <h2>Sign In</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <TextField label="userName" variant="standard" onChange={(e) => setuserName(e.target.value)} />
                </div>
                <div>
                    <TextField label="Password" type="password" variant="standard" onChange={(e) => setpassword(e.target.value)}  />
                </div>
                <Button type="Submit" variant="outlined" sx={{ marginTop: '3%' }}>login</Button>
            </form>
            
        </div>
    );
};


export default Login;