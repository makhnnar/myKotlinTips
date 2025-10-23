import { Link } from "react-router-dom";

import "./navigationBar.css";

export const NavigationBar = () => {
  return <div className="navToolBar">
      <h1>Pedro's Blog</h1>
      <Link to="/">Home</Link>
      <Link to="/profile">Profile</Link>
  </div>;
};