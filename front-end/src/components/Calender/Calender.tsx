import React, {useState, useTransition} from 'react';
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';
import moment from "moment";
const Calender= () => {
    const [dayState, setDay] = useState(new Date());

    return (
    <div>
        <Calendar
            formatDay={(locale, date) => moment(date).format("DD")}
            onChange={setDay} value={dayState} />
        <div className="text-gray-500 mt-4">
            {moment(dayState).format("YYYY년 MM월 DD일")}
        </div>

    </div>
  )
}
export default Calender;