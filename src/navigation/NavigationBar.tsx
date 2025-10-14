import { Link } from "react-router-dom";

export const NavigationBar = () => {
  // We use the <Link> component for internal navigation
  // and the to prop to specify the route.
  return (
    <nav style={{ display: 'flex', gap: '20px', padding: '10px', borderBottom: '1px solid #ccc' }}>
      <Link to="/">Home</Link>
      <Link to="/profile">Profile</Link>
    </nav>
  );
};