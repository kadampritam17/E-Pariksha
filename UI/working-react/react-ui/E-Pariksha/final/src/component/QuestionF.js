import React, { useState } from 'react'

export default function QuestionF({ currId, totalLength, handleNextQuestion, handlePreviousQuestion, data: { question, id, options, answers } }) {

    const [score, setScore] = useState(0)
    // const [result,setResult] = useState('')
    
    let result = '';
    let a = answers[0];
    let b = totalLength
    // console.log(b)
    console.log(a)
    // let bl = new Array(b);



    const onChangeValue = (event) => {
        result = event.target.value;
        // console.log(currId, id)
        console.log(result)
        if (result.trim() === a.trim()) {
            setScore(score + 1)
        }
        console.log('Score is ' + score)
        
    }


    //Rendering
    return (
        <div>
            <h5 className="card-title">Question No. <span>| {id} </span></h5>
            <hr />
            <table className="table table-borderless">
                <thead>
                    <td className="text-primary fw-bold">{question}</td>
                </thead>
                <br></br>
                <tbody >
                    {options.map((option) => {
                        return (
                            <tr >
                                <td className="text-primary fw-bold" ><input type="radio" name={id} value={option} onChange={onChangeValue} ></input> {option}</td>
                            </tr>)
                    })}
                </tbody>
            </table>
            <div>
                {(
                    <button className="btn btn-primary " style={{ 'position': 'absolute', 'bottom': '35px' }} onClick={handlePreviousQuestion}>Previous Question</button>
                )}
                <span style={{ 'margin-right': '15%' }}></span>
                {(
                    <button className="btn btn-primary " style={{ 'position': 'absolute', 'bottom': '35px' }} onClick={handleNextQuestion}>Next Question</button>
                )}
            </div>
        </div>
    )
}
