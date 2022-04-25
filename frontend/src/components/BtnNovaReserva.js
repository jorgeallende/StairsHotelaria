import React from "react";
import AddIcon from "@mui/icons-material/Add";
import "./btnNovaReserva.css";

const BtnNovaReserva = () => {
  return (
    <div class="btnNew font-bebas-neue">
      <AddIcon />
      <span>Adicionar nova reserva</span>
    </div>
  );
};

export default BtnNovaReserva;
