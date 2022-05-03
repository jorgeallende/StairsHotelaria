import { TextField } from "@mui/material";
import { DesktopDatePicker, LocalizationProvider } from "@mui/x-date-pickers";
import { AdapterDateFns } from "@mui/x-date-pickers/AdapterDateFns";
import InputLabel from "@mui/material/InputLabel";
import FormControl from "@mui/material/FormControl";
import MenuItem from "@mui/material/MenuItem";
import Select from "@mui/material/Select";
import React from "react";
import "./newReserva.css";

const NewReserva = () => {
  const [value, setValue] = React.useState(new Date());
  const [roomType, setRoomType] = React.useState();

  const handleChange = (newValue) => {
    setValue(newValue);
  };

  return (
    <div class="nRContainer">
      <h1 class="font-bebas-neue">Nova reserva</h1>
      <LocalizationProvider dateAdapter={AdapterDateFns}>
        <div class="form">
          <div class="formPersonal">
            <h2 class="font-bebas-neue">Dados pessoais</h2>
            <TextField
              id="standard-basic"
              label="Nome Completo"
              fullWidth
              variant="outlined"
              margin="dense"
            />
            <TextField
              id="standard-basic"
              label="CPF"
              fullWidth
              variant="outlined"
              margin="dense"
            />
            <TextField
              id="standard-basic"
              label="Data de nascimento"
              fullWidth
              variant="outlined"
              margin="dense"
            />
            <TextField
              id="standard-basic"
              label="Telefone"
              fullWidth
              variant="outlined"
              margin="dense"
            />
            <TextField
              id="standard-basic"
              label="Email"
              fullWidth
              variant="outlined"
              margin="dense"
            />
          </div>

          <div class="formReserva">
            <h2 class="font-bebas-neue h2reserva">Dados da Reserva</h2>
            <FormControl sx={{mt:1 , minWidth: 258 }}>
              <div class="datePicker">
                <InputLabel id="demo-simple-select-standard-label">
                  Tipo de Quarto
                </InputLabel>
                <Select
                  labelId="demo-simple-select-standard-label"
                  id="demo-simple-select-standard"
                  value={roomType}
                  onChange={handleChange}
                  label="Tipo de quarto"
                  fullWidth
                >
                  <MenuItem value={10}>Normal</MenuItem>
                  <MenuItem value={20}>Duplo</MenuItem>
                  <MenuItem value={30}>Premium</MenuItem>
                </Select>
              </div>
            </FormControl>

            <div class="datePicker">
              <DesktopDatePicker
                id="datePicker"
                label="Data da Reserva"
                inputFormat="dd/MM/yyyy"
                value={value}
                onChange={handleChange}
                renderInput={(params) => <TextField {...params} />}
                margin="dense"
                fullWidth
                disabled
              />
            </div>

            <div class="datePicker">
              <DesktopDatePicker
                id="datePicker"
                label="Data de Entrada"
                inputFormat="dd/MM/yyyy"
                value={value}
                onChange={handleChange}
                renderInput={(params) => <TextField {...params} />}
                margin="dense"
                fullWidth
              />
            </div>

            <div class="datePicker">
              <DesktopDatePicker
                label="Data de Saída"
                inputFormat="dd/MM/yyyy"
                value={value}
                onChange={handleChange}
                renderInput={(params) => <TextField {...params} />}
                fullWidth
              />
            </div>
          </div>
        </div>
      </LocalizationProvider>
    </div>
  );
};

export default NewReserva;
