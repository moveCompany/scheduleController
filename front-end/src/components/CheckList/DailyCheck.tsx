import { useState, useRef } from "react";
import CheckListEditor from "./CheckListEditor";
import DailyCheckList from "./DailyCheckList";

interface Item {
    id : any;
    date : any;
    title : any;
}
interface DailyCheckProps {
    value : any;
}

const DailyCheck = (props : DailyCheckProps) => {
    /*props 구조분해*/
    const { value } = props;
    const [data, setData] = useState<Item[]>([]);

    //전체 data.length임 지금은, 날짜별로 구분해야함
    const [count, setCount] = useState(data.length);

    const onCreate = (date: string, title: string) => {
        const newItem = {
            id: count + 1,
            date: value,
            title
        };
        setCount(count + 1);
        setData([newItem, ...data]);
    };

    const onDelete = (targetId: number) => {
        const newDailyCheckList = data.filter((it) => it.id !== targetId);
        setData(newDailyCheckList);
    };
    return (
        <div className="App">
            <CheckListEditor onCreate={onCreate} />
            <DailyCheckList onDelete={onDelete} dailyCheckList={data} />
        </div>
    );
};

export default DailyCheck;

