package com.portal.assement.concret;

import java.util.HashMap;

public class Question {

    private String questionName;
    private HashMap<Integer,String> answerList;
    private int correctAnswer;

    public Question(String questionName, HashMap<Integer, String> answerList, int correctAnswer) {
        this.questionName = questionName;
        this.answerList = answerList;
        this.correctAnswer = correctAnswer;
    }
    public Question(){
        
    }
    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public HashMap<Integer, String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(HashMap<Integer, String> answerList) {
        this.answerList = answerList;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
}
