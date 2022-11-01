import {Button, Grid} from '@material-ui/core';
import React from 'react';
import Calender from '../components/Calender/Calender';
import {Link, useNavigate} from 'react-router-dom';

const CalenderPage = () => {
  return (
    <Grid>
      <Calender/>
        <Link to={'/routines'}>간편등록</Link>
        <Link to={'/board'}>게시판</Link>
    </Grid>
  )
};
export default CalenderPage;