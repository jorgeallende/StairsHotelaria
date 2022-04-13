import React from "react";
import "./navbar.css";

//icons
import StairsLogo from "../images/stairs_icon.png";
import HomeIcon from "@mui/icons-material/Home";
import CalendarMonthIcon from "@mui/icons-material/CalendarMonth";
import GroupsIcon from "@mui/icons-material/Groups";

const Navbar = () => {

  const fontSize = "40px";

  return (
    <div class="containerNavbar">
      <img class="imgLogo" src={StairsLogo} alt="logo" />
      <div class="divider"></div>
      <ul class="menuItem">
        <li>
          <HomeIcon style={{fontSize: fontSize}} />
        </li>
        <li>
          <CalendarMonthIcon style={{fontSize: fontSize}} />
        </li>
        <li>
          <GroupsIcon style={{fontSize: fontSize}} />
        </li>
        <li></li>
      </ul>
    </div>
  );
};

export default Navbar;
