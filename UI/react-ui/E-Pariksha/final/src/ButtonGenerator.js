import React,{useEffect, useState} from 'react'
import Axios from 'axios'
import QuestionService from './QuestionService';
const API_URL = "http://localhost:8081/admin/question";

export default function ButtonGenerator() {

    const [questions, setQuestions] = useState([]);

    useEffect(() => {
        Axios.get(API_URL)
            .then(res => res.data)
            .then(data => {
                const questions = data.map((question) => ({
                    ...question,
                    id: [question.questionId],
                    options: [question.option1, question.option2, question.option3, question.option4]
                }))
                setQuestions(questions)
            });
    }, [])




    const buttons = () => {
        const row = [];
        // const totalQue = ([5,4,3,2,1]);
        for (var i = 1; i <= questions.length ; i++) { 
            // row.push(<p key={i}>{i}</p>);
            row.push(<button className="btn btn-primary m-2" style={{ width: '45px' }} key={i}>{i}</button>);
        }
        return row;
    };

    return (
        <div>
            {
                buttons()
            }
        </div>
    );
}