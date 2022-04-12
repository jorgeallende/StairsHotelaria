import React from 'react'
import "./input.css"
import EmailIcon from '@mui/icons-material/Email';
import LockIcon from '@mui/icons-material/Lock';

const Input = (props) => {
    console.log(props.icon)
  return (
    <>
        <div class="inputContainer">
            <div class="iconBox">
                {
                   props.icon == "email" ? <EmailIcon color="disabled"/> : 
                   props.icon == "senha" ? <LockIcon color="disabled"/> : ""
                }
            </div>
            <div class="inputText">
                <input/>
            </div>
        </div>
    </>
  )
}

export default Input