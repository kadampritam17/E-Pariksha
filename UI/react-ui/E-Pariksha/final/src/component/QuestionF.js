import React from 'react'


export default function QuestionF({ handleAnswer, handleNextQuestion, handlePreviousQuestion, data: { question, answer, options, id } }) {

    //Rendering
    return (
        <div>

            <h5 className="card-title">Question No. <span>| {id} </span></h5>
            <hr />
            <table className="table table-borderless">
                <thead>
                    <td><a href="//" className="text-primary fw-bold">{question}</a></td> 
                </thead>
                <br></br>
                <tbody>
                    {options.map((answer) => { 

                        return (
                            <tr>
                                <td><input type="radio" name="a" onClick={() => handleAnswer(answer)} ></input> <a className="text-primary fw-bold">{answer}</a></td>
                            </tr>)
                    })}

                </tbody>
            </table>
            <div >
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
