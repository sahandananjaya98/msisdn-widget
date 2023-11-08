import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import { MemoryRouter, Routes, Route } from 'react-router-dom';
import Home from './home';

function MainApp() {
  return (
    <div className="App">
      <MemoryRouter>
        <Routes>
          <Route path="/MockApi/getDetails/:key" element={<Home />} />
        </Routes>
      </MemoryRouter>
    </div>
  );
}

export default MainApp;
