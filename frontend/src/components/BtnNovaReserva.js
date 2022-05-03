import React from "react";
import { useState } from "react";
import AddIcon from "@mui/icons-material/Add";
import "./btnNovaReserva.css";
import Modal from "@mui/material/Modal";
import Box from "@mui/material/Box";
import { Button, Link } from "@mui/material";

const BtnNovaReserva = () => {
  const [open, setOpen] = useState();
  const handleOpen = () => setOpen(true);
  const handleClose = () => setOpen(false);

  const style = {
    position: "absolute",
    top: "50%",
    left: "50%",
    transform: "translate(-50%, -50%)",
    width: 500,
    bgcolor: "background.paper",
    boxShadow: 24,
    p: 4,
  };

  return (
    <div className="btnNew font-bebas-neue" onClick={handleOpen}>
      <Modal
        open={open}
        onClose={handleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          Selecione o tipo:
          <div className="buttonWrapper">
            <Link href="/reserva-list">
              <Button variant="contained">Reserva existente</Button>
            </Link>
            <Link href="/new-reserva">
              <Button variant="contained">Criar reserva</Button>
            </Link>
          </div>
        </Box>
      </Modal>
      <div className="icon">
        <AddIcon />
      </div>
      <span>Adicionar nova reserva</span>
    </div>
  );
};

export default BtnNovaReserva;
