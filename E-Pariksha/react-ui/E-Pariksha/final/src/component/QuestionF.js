import React, { useState } from 'react'

export default function QuestionF({ finalR, currId, totalLength, handleNextQuestion, handlePreviousQuestion, data: { question, id, options, answers } }) {

    var b = totalLength
    let bl = new Array(b);
    const [arr, setArr] = useState(bl)
    let result = 0;
    let a = answers[0];


    const onChangeValue = (event) => {
        result = event.target.value;

        for (let i = 0; i < bl.length; i++) {
            if (id - 1 === i) {
                if (result.trim() === a.trim()) {
                    arr[i] = 1;
                }
                else
                    arr[i] = 0;
            }
        }
        setArr(arr)
    }

    //calculating result    
    const countOccurrences = (arr, val) => arr.reduce((a, v) => (v === val ? a + 1 : a), 0);
    // final value contains total live score of exam
    var final = (countOccurrences(arr, 1));

    //Forwarding result value to Exam.js
    finalR(final);


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
