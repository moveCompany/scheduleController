import { useState, useRef } from "react";
import CheckListEditor from "./CheckListEditor";
import DailyCheckList from "./DailyCheckList";

interface Item {
    id : any;
    date : any;
    title : any;
}


const DailyCheck = () => {
    const [data, setData] = useState<Item[]>([]);
    const dataId = useRef(0);

    const onCreate = (date: string, title: string) => {
        const newItem = {
            id: dataId.current,
            date,
            title
        };
        dataId.current += 1;
        setData([newItem, ...data]);
    };

    const onDelete = (targetId: number) => {
        const newDailyCheckList = data.filter(it => it.id !== targetId);
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

