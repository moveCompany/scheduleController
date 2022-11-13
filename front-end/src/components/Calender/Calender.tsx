import React, {useState, useTransition} from 'react';
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';
import moment from "moment";
import DailyCheck from "../CheckList/DailyCheck";
const Calender= () => {
    const [day, setDay] = useState(new Date());

    return (
    <div>
        <Calendar
            formatDay={(locale, date) => moment(date).format("DD")}
            onChange={setDay} value={day} />
        <div className="text-gray-500 mt-4">
            {moment(day).format("YYYY년 MM월 DD일")}
        </div>
        <div>{<DailyCheck value={moment(day).format("YYYY-MM-DD")} />}</div>
    </div>
  )
}
export default Calender;