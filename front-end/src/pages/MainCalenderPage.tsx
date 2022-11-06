import {Button, Grid} from '@material-ui/core';
import React from 'react';
import Calender from '../components/Calender/Calender';
import {Link, useNavigate, useNavigation} from 'react-router-dom';

const MainCalenderPage = () => {
    const navigation=useNavigate()
    function goBoardPage() {
        navigation("/board");
    }
    function goRoutinesPage() {
        navigation("/routines");
    }
    function goLogin() {
        navigation("/login");
    }
  return (
    <Grid>
        메인 달력 화면입니다.
        <Calender/>
        <div>
            <Button onClick={goLogin}>
                로그인화면 버튼
            </Button>
            <Link to={'/login'}>로그인</Link>
        </div>
        <div>
            <Button onClick={goRoutinesPage}>
                간편등록 이동 버튼
            </Button>
          <Link to={'/routines'}>간편등록</Link>
        </div>
        <div>
            <Button onClick={goBoardPage}>
                게시판 이동 버튼
            </Button>
          <Link to={'/board'}>게시판 이동</Link>
        </div>

    </Grid>
  )
};
export default MainCalenderPage;