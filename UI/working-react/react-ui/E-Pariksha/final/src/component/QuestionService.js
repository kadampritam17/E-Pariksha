import Axios from 'axios';
import React, { useState, useEffect } from 'react';
import QuestionF from './QuestionF';


const API_URL = "http://localhost:8081/admin/question";

function QuestionService(props) {

    let temp = props.currIdx;
    
    const [questions, setQuestions] = useState([]);
    const [currentIndex, setCurrentIndex] = useState(0);
    
    console.log(temp,currentIndex)
    

    useEffect(() => {
        Axios.get(API_URL)
            .then(res => res.data)
            .then(data => {
                const questions = data.map((question) => ({
                    ...question,
                    id: [question.questionId],
                    options: [question.option1, question.option2, question.option3, question.option4],
                    answers : [question.answer]
                }))
                setQuestions(questions)
                // console.log(questions.length)
                setCurrentIndex(temp)
            });
    },[props])



    const handleNextQuestion = () => 
    {
        setCurrentIndex(currentIndex + 1);
    }

    const handlePreviousQuestion = () => 
    {
        if (currentIndex <= 0) {setCurrentIndex(0)}
        else {setCurrentIndex(currentIndex - 1);}
    }

    return (questions.length > 0 ? (
        <div className="container">
            {currentIndex >= questions.length ? (
                alert('You have reached to last question')) : (<QuestionF 
                    // handleAnswer={handleAnswer}
                    handleNextQuestion={handleNextQuestion}
                    handlePreviousQuestion={handlePreviousQuestion}
                    data={questions[currentIndex]}
                    totalLength={questions.length}
                    currId={temp}
                   />)}
        </div>
    ) : <div className="container">Loading...</div>
    );
}
export default QuestionService;
