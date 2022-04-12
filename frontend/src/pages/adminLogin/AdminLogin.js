import React from "react";
import Input from "../../components/Input";
import "./adminLogin.css";

const AdminLogin = () => {
  return (
    <div class="grid grid-cols-2 grid-rows-1 h-screen bg-blue-600">
      <div class="flex items-center justify-center h-full">
        <h1 class="text-3xl font-bold underline">Hello world!</h1>
      </div>
      <div class="flex items-center justify-center h-full ">
        <div class="relative w-8/12 h-3/5 rounded-md drop-shadow-2xl bg-white flex items-center py-16 flex-col px-20">
          <div class="flex flex-col gap-6 w-full ">
            <Input icon={"email"}></Input>
            <Input icon={"senha"}></Input>
          </div>
          <a href="#" class="self-start mt-px text-orange-600">
            Esqueceu sua senha?
          </a>
          <a href="#">
            <div class="w-44 h-12 font-bebas-neue text-3xl text-white bg-orange-600 flex items-center justify-center rounded-md mt-16">
              Entrar
            </div>
          </a>
          <div class="text-sm text-center absolute bottom-2">
            Precisa de ajuda? {" "}
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
