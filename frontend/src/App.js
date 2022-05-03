import "./App.css";
import React from "react";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

import ClientLogin from "./pages/clientLogin/ClientLogin";
import AdminLogin from "./pages/adminLogin/AdminLogin";
import Dashboard from "./pages/dashboard/Dashboard";
import Navbar from "../src/components/Navbar";
import Topnavbar from "../src/components/Topnavbar";
import Agenda from "./pages/agenda/Agenda";
import Reservas from "./pages/reserva/Reservas";
import NewReserva from "./pages/new-reserva/NewReserva";

export default function App() {
  return (
    <Router>
      <Switch>
        {/* Componentes sem navbars */}
        <Route path="/" exact>
          <AdminLogin />
        </Route>
        {/* <Route path="/" exact>
          <ClientLogin />
        </Route> */}

        {/* Componentes com navbar e topnavbar */}
        <div>
          <Navbar />
          <Topnavbar />
          <Route path="/dashboard" exact>
            <Dashboard />
          </Route>
          <Route path="/agenda" exact>
            <Agenda />
          </Route>
          <Route path="/reservas" exact>
            <Reservas />
          </Route>
          <Route path="/new-reserva" exact>
            <NewReserva />
          </Route>
        </div>
      </Switch>
    </Router>
  );
}
