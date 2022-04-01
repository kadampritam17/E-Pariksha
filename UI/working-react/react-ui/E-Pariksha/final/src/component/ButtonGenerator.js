import React,{useEffect, useState} from 'react'
import Axios from 'axios'
const API_URL = "http://localhost:8081/admin/question";

export default function ButtonGenerator(props) {

    const [questions, setQuestions] = useState([]);

    useEffect(() => {
        Axios.get(API_URL)
            .then(res => res.data)
            .then(data => {
                const questions = data.map((question) => ({
                    ...question}))
                setQuestions(questions)
            });
    }, [])


    const renderQuestion = (event) =>{
       const i = event.target.value
       props.handler(i-1);
    }

    var i;
    const buttons = () => {
        const row = [];
        for ( i = 1; i <= questions.length ; i++) 
        {
            row.push(<button className="btn btn-primary m-2" style={{ width: '45px' }} key={i} onClick={renderQuestion} value={i}>{i}</button>);
        }
        return row;
    };

    return (
        <div>
        <div>
            {
                buttons()
            }
        </div>
        </div>
    );
}