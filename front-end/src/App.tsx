import React from 'react';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import MainCalenderPage from "./pages/MainCalenderPage";
import LoginPage from "./pages/LoginPage";
import RoutinesPage from "./pages/RoutinesPage";
import BoardPage from "./pages/BoardPage";

function App() {
  return (
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<MainCalenderPage/>}/>
            <Route path="/routines" element={<RoutinesPage/>}/>
            <Route path="/board" element={<BoardPage/>}/>
            <Route path="/login" element={<LoginPage/>}/>
        </Routes>
    </BrowserRouter>

  )
}

export default App;
