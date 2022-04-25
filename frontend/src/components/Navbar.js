import React, { useState } from "react";
import { Redirect, NavLink } from "react-router-dom";
import "./navbar.css";

//icons
import StairsLogo from "../images/stairs_icon.png";
import HomeIcon from "@mui/icons-material/Home";
import CalendarMonthIcon from "@mui/icons-material/CalendarMonth";
import GroupsIcon from "@mui/icons-material/Groups";

const Navbar = (props) => {
  const fontSize = "40px";
  const [active, setActive] = useState("");

  return (
    <div class="containerNavbar">
      <img class="imgLogo" src={StairsLogo} alt="logo" />
      <div class="divider"></div>
      <ul class="menuItem">
        
        <NavLink
          className="navbar-item"
          activeClassName="is-active"
          to="/dashboard"
        >
          <HomeIcon style={{ fontSize: fontSize }} />
        </NavLink>

        <NavLink
          className="navbar-item"
          activeClassName="navbar-item is-active"
          to="/agenda"
        >
          <CalendarMonthIcon style={{ fontSize: fontSize }} />
        </NavLink>

        <NavLink
          className="navbar-item"
          activeClassName="is-active"
          to="/reservas"
        >
          <GroupsIcon style={{ fontSize: fontSize }} />
        </NavLink>
        <li></li>
      </ul>
    </div>
  );
};

export default Navbar;
