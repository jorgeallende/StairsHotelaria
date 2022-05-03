import React from "react";
import "./reserva.css";
import BtnNovaReserva from "../../components/BtnNovaReserva";
import Table from "@mui/material/Table";
import TableBody from "@mui/material/TableBody";
import TableCell from "@mui/material/TableCell";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TableRow from "@mui/material/TableRow";
import Paper from '@mui/material/Paper';

const Reservas = () => {
  function createData(name, cpf, tel, email, inDate) {
    return { name, cpf, tel, email, inDate };
  }

  const rows = [
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
    createData("Matheus Almeida", "312.413.543-23", "(86) 91135-5415", "matheusalmeida@stairs.com", "21/04/2022"),
  ];

  return (
    <div className="reservaContainer">
      <div className="header">
        <h1 className="font-bebas-neue">Check-ins</h1>
        <BtnNovaReserva />
      </div>

      <div className="reservas_tb">
        <TableContainer component={Paper}>
          <Table sx={{ minWidth: 650 }} size="small" aria-label="a dense table">
            <TableHead>
              <TableRow>
                <TableCell><b>Nome do titular</b></TableCell>
                <TableCell align="right"><b>CPF</b></TableCell>
                <TableCell align="right"><b>Telefone</b></TableCell>
                <TableCell align="right"><b>Email</b></TableCell>
                <TableCell align="right"><b>Data de entrada</b></TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {rows.map((row) => (
                <TableRow
                  key={row.name}
                  sx={{ "&:last-child td, &:last-child th": { border: 0 } }}
                >
                  <TableCell component="th" scope="row">
                    {row.name}
                  </TableCell>
                  <TableCell align="right">{row.cpf}</TableCell>
                  <TableCell align="right">{row.tel}</TableCell>
                  <TableCell align="right">{row.email}</TableCell>
                  <TableCell align="right">{row.inDate}</TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </TableContainer>
      </div>
    </div>
  );
};

export default Reservas;
