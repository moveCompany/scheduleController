import CheckItem from "./CheckItem";
import {Grid} from "@material-ui/core";

const DailyCheckList = ({ onDelete, dailyCheckList }: any) => {
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

