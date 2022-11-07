import {Button, Grid} from "@material-ui/core";

const CheckItem = ({ onDelete, id, date, title }:any) => {
    return (
        <Grid className="CheckItem">
            <Grid className="info">
                <span>날짜 : {date} </span>
                <Grid className="title">{title}</Grid>
                <Button
                    onClick={() => {
                        console.log(id);
                        if (window.confirm(`${id}번 째 보고를 삭제할까요?`)) {
                            onDelete(id);
                        }
                    }}>
                    삭제
                </Button>
            </Grid>
        </Grid>
    );
};

export default CheckItem;

