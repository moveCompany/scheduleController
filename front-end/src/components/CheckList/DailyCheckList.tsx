import CheckItem from "./CheckItem";
import {Grid} from "@material-ui/core";
interface DailyCheckListProps {
    onDelete : any;
    dailyCheckList : any;
}



const DailyCheckList = (props: DailyCheckListProps) => {
    const { onDelete, dailyCheckList } = props;
    return (
        <Grid>
            <Grid>
                <h1> 일정 </h1>
            </Grid>
            {dailyCheckList.map((it: any) => {
                return <CheckItem key={it.id} {...it} onDelete={onDelete} />;
            })}
        </Grid>
    );
};

export default DailyCheckList;

