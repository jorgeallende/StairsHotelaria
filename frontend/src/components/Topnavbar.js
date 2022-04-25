import React from 'react'
import "./topnavbar.css"
import AvatarIcon from "../images/avatar_icon.png"
import { useEffect, useState } from 'react'

const Topnavbar = () => {

  const [clockState, setClockState] = useState();
  const [dateState, setDateState] = useState();

  useEffect(() => {
    setInterval(()=>{
      const date = new Date();
      setClockState(date.toLocaleTimeString());
      setDateState(date.toLocaleDateString())
    }, 1000)
  }, []);

  return (
    <div class="container">
        <div class="dateWrapper">
            <div class="date">{dateState}</div>
            <div class="hour">{clockState}</div>
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