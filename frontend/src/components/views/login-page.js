import Axios from 'axios';
import React, {useState} from 'react'
import { loginUser} from '../../action/user-action';

function LoginPage(props) {
    const [Email, setEmail] = useState("");
    const [Password, setPassword] = useState("");

    //typing 하면 onChange 를 발생시켜 state를 바꿔주어 value를 바꾼다.
    const onEmailHandler = (event) => {
        setEmail(event.currentTarget.value);
    };
    const onPasswordHandler = (event) => {
        setPassword(event.currentTarget.value);
    };
    const onSubmitHandler = (event) => {
        // page refresh를 막아준다
        event.preventDefault();

        // 서버에 보내기
        let body = {
            email : Email,
            password : Password
        }

        dispatch(loginUser(body))
        // 로그인되면 /(index페이지)로 이동
            .then(response => {
                if (response.payload.loginSuccess) {
                    props.history.push('/')
                } else {
                    alert('Error')
                }
            })

        Axios.post('/api/users/login', body)
        .then(response => {

        })
    };

    return (
        <div style ={{
            display : 'flex', justifyContent : 'center', alignItems: 'center',
            width : '100%', height : '100vh'
        }}>
            <form style ={{display : 'flex', flexDirection:'column'}}
                  onSubmit={onSubmitHandler}>
                <label>Email</label>
                <input type = "email" value = {Email} onChange={onEmailHandler}/>
                <label>Password</label>
                <input type = "password" value = {Password} onChange={onPasswordHandler}/>
                <br/>
                <button type = 'submit'>
                    Login
                </button>
            </form>
        </div>
    )
}
export default LoginPage