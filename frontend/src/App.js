import "./App.css";
import React from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import { render } from "react-dom";

import ClientLogin from "./pages/clientLogin/ClientLogin";
import AdminLogin from "./pages/adminLogin/AdminLogin";

export default function App() {
  return (
    <Router>
      <Switch>
        <Route path="/admin">
          <AdminLogin />
        </Route>
        <Route path="/">
          <ClientLogin />
        </Route>
      </Switch>
    </Router>
  );
}