import { Grid } from '@material-ui/core';
import React from 'react';
import Calender from '../components/Calender/Calender';
import CalenderDetail from '../components/Calender/CalenderDetail';

const CalenderPage = () => {
  return (
    <Grid>
      <Calender/>
      <CalenderDetail/>
    </Grid>
  )
};
export default CalenderPage;