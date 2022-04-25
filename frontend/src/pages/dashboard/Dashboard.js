import React from "react";
import Navbar from "../../components/Navbar";
import Topnavbar from "../../components/Topnavbar";
import { useState } from "react"
import DashboardContent from "./DashboardContent"

const Dashboard = () => {

  const [active, setActive] = useState("dashboard");

  const changeActive = (module) => {
    setActive(module);
    console.log(active);
  }

  return (
    <>
      {/* ------- */}

      {active === "dashboard" ? <DashboardContent /> :
       active === "agenda" ? <h1>Agenda</h1> : "nada2"}

    </>
  );
};

export default Dashboard;
