import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import { NavigationBar } from './navigation/NavigationBar';
import { Home } from './home/Home';
import { Profile } from './profile/Profile';
import { PostDetail } from './posts/Post';
const App = () => {
  return <div className='App'>
    <BrowserRouter>
      <div className='App'>
        <NavigationBar />
      </div>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/profile" element={<Profile />} />
        <Route path="/post/:id" element={<PostDetail />} />
        <Route path="*" element={<h2>404 - Page Not Found</h2>} />
      </Routes>
    </BrowserRouter>
  </div>;
}

export default App;
