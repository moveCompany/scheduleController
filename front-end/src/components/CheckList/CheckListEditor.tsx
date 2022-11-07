import { useState, useRef } from "react";

interface CheckListEditorProps {
    // onCreate : (any,any) => void
}

const CheckListEditor = ({ onCreate }:any) => {
    //const dateInput = useRef();
    const titleInput = useRef<any>(null);

    const [state, setState] = useState({
        date: "",
        title: ""
    });
    const handleChangeState = (e: any) => {
        setState({
            ...state,
            [e.target.name]: e.target.value
        });
    };
    const handleSubmit = () => {
        if (state.title.length < 1) {
            titleInput.current.focus();
            return;
        }
        onCreate(state.date, state.title);
        alert("insert");
        setState({
            date: "",
            title: ""
        });
    };

    return (
        <div className="CheckListEditor">
            <h5>editor list</h5>
            <div>
                <input
                    ref={titleInput}
                    value={state.title}
                    onChange={handleChangeState}
                    name="title"
                />
            </div>
            <div>
                <button onClick={handleSubmit}>Save</button>
            </div>
        </div>
    );
};
export default CheckListEditor;

