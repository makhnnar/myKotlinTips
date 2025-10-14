import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import { NavigationBar } from './navigation/NavigationBar';
import { Home } from './home/Home';
import { Profile } from './profile/Profile';
import { PostDetail } from './posts/Post';

function App() {
  return (
    // 1. BrowserRouter must wrap everything
    <BrowserRouter>
      <h1>My React Router App</h1>

      {/* 2. NavigationBar is placed outside <Routes> so it's always visible */}
      <NavigationBar />

      {/* 3. Routes defines all the possible paths and the components to render */}
      <Routes>
        {/* Route 1: Home page (Root route) */}
        <Route path="/" element={<Home />} />

        {/* Route 2: Profile page */}
        <Route path="/profile" element={<Profile />} />

        {/* Route 3: Post Detail (Dynamic route with a parameter) */}
        {/* The ':id' creates a dynamic segment that can be accessed via useParams() */}
        <Route path="/post/:id" element={<PostDetail />} />

        {/* Optional: A route for 404 Not Found pages */}
        <Route path="*" element={<h2>404 - Page Not Found</h2>} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
