import React from "react";
import { forceUpdate } from "react";
import "./input.css";
import EmailIcon from "@mui/icons-material/Email";
import LockIcon from "@mui/icons-material/Lock";

const Input = (props) => {
  return (
    <>
      <div class="inputContainer">
        <div class="iconBox">
          {/* { children } */}
          {props.icon == "email" ? (
            <EmailIcon color="disabled" />
          ) : props.icon == "senha" ? (
            <LockIcon color="disabled" />
          ) : (
            ""
          )}
        </div>
        <div class="inputText">
          {props.password ? (
            <input
              type="password"
              placeholder={props.placeholder}
              value={props.value}
              onChange={(e) => {
                props.callback(e.target.value);
              }}
            />
          ) : (
            <input
              placeholder={props.placeholder}
              value={props.value}
              onChange={(e) => {
                props.callback(e.target.value);
              }}
            />
          )}
        </div>
      </div>
    </>
  );
};

export default Input;
