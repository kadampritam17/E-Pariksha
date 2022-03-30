import React, { useState, useEffect } from 'react'
//import QuestionService from './QuestionService'

const Question_Rest_Url = "http://localhost:8081/admin/question";

export default function Question() {

    // second method
    const [questions, setQuestions] = useState([]);
    // const [score, setScore] = useState(0);
    // const [option, setOption] = useState('');

    useEffect(() => {
        fetch(Question_Rest_Url)
            .then((res) => res.json())
            .then((data) => {
                setQuestions(data)
            });
    }, []);

    // function OptionHandler(){
    //     if (questions.answer === option )
    //     {
    //         console.log(option)
    //         score = score +1 ;
    //     }
    //     setScore(score)
    // }
// Option generator

const Button = ({answer}) => (
<tr>
                        <td><input type="radio" name="a" ></input> <a className="text-primary fw-bold">{answer}</a></td>
                    </tr>
)








    //First method UseEffect

    // const [questions, setquestions] = useState([])

    // useEffect(() => {
    //     getQuestions()

    // }, [])


    // const getQuestions = () => {

    //     QuestionService.getQuestions().then((res) => {
    //         setquestions(res.data)
    //         console.log(res.data);
    //     })
    // }

    //Rendering
    return questions.length > 0 ? (
        <div>

            <h5 className="card-title">Question No. <span>| {questions[1].questionId} </span></h5>
            <hr />
            <table className="table table-borderless">
                <thead>
                    <td><a href="//" className="text-primary fw-bold">{questions[1].question}</a></td>
                </thead>
                <br></br>
                <tbody>
                 <Button answer={questions[1].option1} />
                 <Button answer={questions[1].option2} />
                 <Button answer={questions[1].option3} />
                 <Button answer={questions[1].option4} />
                </tbody>
            </table>
            {/* second method */}
            {/* {
                questions.map(question =>
                    <>
                        <h5 className="card-title">Question No. <span>{question.questionId}</span></h5>
                        <hr />
                        <table className="table table-borderless">
                            <tbody>
                                <tr key={question.questionId}>
                                    <thead>
                                        <td><a href="/" className="text-primary fw-bold"> {question.question}</a></td>
                                    </thead>
                                    <br></br>
                                </tr>
                                <tr>
                                    <td><input type="radio" name="a"></input><a className="text-primary fw-bold"> {question.option1}</a></td>
                                </tr>
                                <tr>
                                    <td><input type="radio" name="a"></input><a className="text-primary fw-bold"> {question.option2}</a></td>
                                </tr>
                                <tr>
                                    <td><input type="radio" name="a"></input><a className="text-primary fw-bold"> {question.option3}</a></td>
                                </tr>
                                <tr>
                                    <td><input type="radio" name="a"></input><a className="text-primary fw-bold"> {question.option4}</a></td>
                                </tr>
                            </tbody>
                        </table>
                    </>
                )
            } */}

            {/* Previous hardcore HTML render */}

            {/* <h5 className="card-title">Question No. <span>| 1</span></h5>
            <hr />
            <table className="table table-borderless">
                 <thead>
                    <td><a href="/" className="text-primary fw-bold">HTML stands for.</a></td>
                </thead> 
                <br></br>
                <tbody>*/}
            {/* <tr>
                        <td><input type="radio" name="a"></input> <a  className="text-primary fw-bold">HighText Machine Language</a></td>
                    </tr>
                    <tr>
                        <td><input type="radio" name="a"></input> <a  className="text-primary fw-bold">HyperText and links Markup Language</a></td>
                    </tr>
                    <tr>
                        <td><input type="radio" name="a"></input> <a  className="text-primary fw-bold">HyperText Markup Language</a></td>
                    </tr>
                    <tr>
                        <td><input type="radio" name="a"></input> <a  className="text-primary fw-bold">None of these</a></td>
                    </tr> */}

            {/* </tbody>
            </table> */}
        </div>
    ) : (
        <h1> Hey Bro .... We are loading</h1>
    );
}
