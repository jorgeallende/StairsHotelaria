import React from "react";
import Navbar from "../../components/Navbar";
import Topnavbar from "../../components/Topnavbar";
import "./dashboard.css";

const Dashboard = () => {
  return (
    <>
      <Topnavbar />
      <Navbar />
      <div class="containerDashboard">
        <h1 class="font-bebas-neue">Dashboard</h1>
        <h3>Gráfico de frequência</h3>
        <div class="graphContainer"></div>
      </div>
    </>
  );
};

export default Dashboard;
