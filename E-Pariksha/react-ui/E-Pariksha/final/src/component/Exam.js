import React, { useState } from 'react'
import Timer from './Timer'
import { useNavigate } from 'react-router-dom';
import QuestionService from './QuestionService'
import ButtonGenerator from './ButtonGenerator';

export default function Exam() {

    const [qid, setQid] = useState(0);

    //stores the final result coming from QuestionF component
    const [result,setResult] = useState(0);

   //For Navigation
    let navigate = useNavigate();
    let onTimesup = () => {
        navigate("/result");
    }
    
    //Button Handler
    const functionForButton = (i) => {
        setQid(i);
    }

    //Navigation to result page with data.
    function Result() {

        navigate('/result', {state:result} )
    }

    //Rendering    
    return (
        <div>
            <header id="header" className="header fixed-top d-flex align-items-center">
                <div className="d-flex align-items-center justify-content-between">
                    <h4 style={{ color: 'white' }}>Web Programming Technology</h4>
                </div>
                <div className="header-nav ms-auto pe-5" >
                    <h4 style={{ color: 'white' }}>Time Left :  <Timer
                        onTimesup={onTimesup}
                        duration={3600}
                    /></h4>
                </div>
            </header>
            <main id="main" className="main" style={{ 'margin-right': '0px', 'margin-left': '20px' }}>
                <section className="section dashboard">
                    <div className="row">
                        {/* Left side card */}
                        <div className="col-lg-8">
                            <div className="row">
                                <div className="col-12">
                                    <div className="card top-selling overflow-auto">
                                        <div className="card-body pb-0 overflow-auto" style={{ 'height': '720px' }} >
                                            <QuestionService currIdx={qid}
                                            resFun={setResult}
                                            ></QuestionService>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        {/* Right side card */}
                        <div className="col-lg-4">
                            <div className="row">
                                <div className="col-12">
                                    <div className="card top-selling " >
                                        <div className="card-body pb-0" style={{ 'height': '720px' }}>
                                            <br />
                                            <h4 className="card-title" style={{ 'background-color': '#e1e1f3' }}>Student Name: Chandrakant Padme</h4>
                                            <h4 className="card-title" style={{ 'background-color': '#e1e1f3' }}>PRN No : 210945920064</h4>
                                            <hr />
                                            <h5 className="card-title" style={{ 'background-color': '#e1e1f3' }}>Questions </h5>
                                            <table className="table table-borderless">
                                            </table>
                                            <div style={{ 'overflow': 'auto', 'height': '350px' }}>
                                                <ButtonGenerator handler={functionForButton}></ButtonGenerator>
                                            </div>
                                            <hr />
                                            <button className="btn btn-success" style={{ 'position': 'absolute', 'bottom': '35px', 'color': 'white', 'text-decoration': 'none' }} onClick={Result}>Submit Exam</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </main>
        </div>
    )
}
