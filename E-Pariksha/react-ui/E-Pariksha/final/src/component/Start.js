import React from 'react';
import { Link } from 'react-router-dom';

export default function Start() {
    return (
        <div>
            <header id="header" className="header fixed-top d-flex align-items-center">
                <div className="d-flex align-items-center justify-content-between">
                    <a href="index.html" className="logo d-flex align-items-center">
                        <img src="assets/img/EPariksha.png" alt="" />
                        <span className="d-none d-lg-block">E-Pariksha</span>
                    </a>
                </div>
            </header>
            <center>
                <div className="">
                    <div className="card" style={{ 'marginTop': '100px', width: '100rem', height: '45rem' }}>
                        {/* <div className="info-title"><span>Some Rules of this Quiz</span></div> */}
                        <div className="card-body">
                            <div style={{ 'textAlign': 'justify', width: '90rem' }}>
                                {/* <div>Centralised Course End Examination (CCEE) Online PG Diploma September 2021 batch</div> */}
                                <div className="text-center"><h1 className="card-title" style={{ 'fontSize': '25px' }}><strong>INSTRUCTIONS TO STUDENTS</strong></h1></div>
                                <hr></hr>

                                <div><h5><strong>Students should read the following instructions before starting the Web-based examination</strong></h5></div>
                                <div> 1. The clock will be set at the server. The countdown timer at the top right corner of screen will display the remaining time available for you to complete the examination. When the timer reaches zero, the examination will end by itself. You need not terminate
                                    the examination or submit your paper.</div>
                                <div>2. The Question Palette displayed on the right side of screen will show each question.</div>
                                <div>3. Students must keep the laptop sufficiently charged so that it can last up to 3 hours.</div>
                                <div>4. To answer a question, do the following:
                                    <ul>
                                        <li> Click on the question number in the Question Palette at the right of your screen to go to that numbered question directly. Note that using this option does NOT save your answer to the current question.
                                        </li>
                                        <li> Click on Save & Next to save your answer for the current question and then go to the next question.
                                        </li>
                                        <li> You can view all the questions by clicking on the Question Paper button. This feature is provided, so that if you want you can just see the entire question paper at a glance.
                                        </li>
                                    </ul>
                                </div>
                                <div>5. Procedure for answering a multiple choice (MCQ) type question:
                                    <ul>
                                        <li> Choose one answer from the 4 options (A,B,C,D) given below the question, click on the bubble placed before the chosen option.</li>
                                        <li> To deselect your chosen answer, click on the bubble of the chosen option again.</li>
                                        <li>To change your chosen answer, click on the bubble of another option.</li>
                                        <li>To save your answer, you MUST click on the Save & Next</li>
                                    </ul>
                                </div>
                                <div>6. In case of any problem regarding the link not received or link not working, students should contact
                                    their respective Course Coordinator.</div>
                                <div>7. Note that ONLY Questions for which answers are saved will be considered for evaluation.
                                </div>
                                <div>8. Students will not be allowed to login after 30 minutes from the start of the exam.
                                </div>
                                <div>9. Marking scheme of Exam is as follows:
                                    a. +1 (plus one) mark for each correct answer.
                                    b. 0 (zero) mark for each wrong answer.
                                </div>
                            </div>
                        </div>
                        <br></br>
                        <br></br>
                        <br></br>
                        <div className="text-center">
                            <Link to="/Exam">
                                <button className='btn btn-primary btn-lg m-5' >
                                    Start
                                </button>
                            </Link>
                        </div>
                    </div>
                </div>
            </center>
        </div>
    )
}

