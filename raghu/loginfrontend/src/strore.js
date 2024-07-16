// api.js
import axios from 'axios';

const API_URL = 'http://localhost:8086';

export const loginUser = async (userName, password) => {
     const promise = axios.post(`${API_URL}/user/login`, {
        userName,
        password,
     });
    
    const success = await promise
    const successMessage = await success.data
    console.log("successMessage in store>>", successMessage);
    return successMessage;
};
