import React from 'react'
import "./topnavbar.css"
import AvatarIcon from "../images/avatar_icon.png"

const Topnavbar = () => {
  return (
    <div class="container">
        <div class="dateWrapper">
            <div class="date">13/04/2022</div>
            <div class="hour">10:30:43</div>
        </div>
        <div class="icon">
          <img src={AvatarIcon} alt="avatar" />
        </div>
        <div class="buttonsWrapper">
            <button class="bt btPerfil font-bebas-neue">Perfil</button>
            <button class="bt btSair font-bebas-neue">Sair</button>
        </div>
    </div>
  )
}

export default Topnavbar