import React from "react";
import Input from "../../components/Input";
import { useState } from "react";
//Css
import "./adminLogin.css";
//Imagen
import StairsIcon from "../../images/stairs_icon.png";

const AdminLogin = () => {
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");

  const submitValues = () => {
    console.log(email);
    console.log(senha);
  };

  const changeSenha = (value) => {
    setSenha(value);
  };

  const changeEmail = (value) => {
    setEmail(value);
  };

  return (
    <div class="grid grid-cols-2 grid-rows-1 h-screen bg-blue-600">

      {/* LEFT SIDE */}

      <div class="flex items-center justify-center h-full flex-col">
        <div class="w-1/3">
          <img src={StairsIcon} alt="icon" id="logoImg"/>
        </div>
        <div class="h1 font-bebas-neue">
          <span class="span">S</span>tair<span class="span">S</span>
        </div>
        <h3 class="h3">Sistema de Gerenciamento Hoteleiro</h3>
      </div>

      {/* RIGHT SIDE */}

      <div class="flex items-center justify-center h-full ">
        <div id="loginBox" class="relative w-8/12 h-3/5 rounded-md bg-white flex items-center py-16 flex-col px-20">
          <div class="flex flex-col gap-7 w-full h-auto">
            <Input
              icon={"email"}
              placeholder={"Email"}
              value={email}
              callback={changeEmail}
            ></Input>
            <Input
              icon={"senha"}
              placeholder={"Senha"}
              value={senha}
              callback={changeSenha}
              password={true}
            ></Input>
          </div>
          <a href="#" class="self-start mt-px text-orange-600">
            Esqueceu sua senha?
          </a>

          <div class="mt-16">
            <a href="#" onClick={() => submitValues()}>
              <div class="w-44 h-12 font-bebas-neue text-3xl text-white bg-orange-600 flex items-center justify-center rounded-md">
                Entrar
              </div>
            </a>
          </div>
          <div class="text-sm text-center absolute bottom-2 px-3 py-3">
            Precisa de ajuda?{" "}
            <span class="text-orange-600 cursor-pointer">
              Entre em contato com o nosso suporte
            </span>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AdminLogin;
