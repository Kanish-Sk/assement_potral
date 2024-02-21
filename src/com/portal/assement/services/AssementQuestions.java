package com.portal.assement.services;
import com.portal.assement.concret.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AssementQuestions {

    Question ques = new Question();
    Scanner obj = new Scanner(System.in);
    static ArrayList<Question> quesList = new ArrayList<>();
    static
    {
        HashMap<Integer, String> answerList = new HashMap<>();
        answerList.put(1, "Answer 1");
        answerList.put(2, "Answer 2");
        answerList.put(3, "Answer 3");
        answerList.put(4, "Answer 4");
        int correctAnswer = 2; 
        Question sampleQuestion = new Question("Sample Question??", answerList, correctAnswer);
        quesList.add(sampleQuestion);

        HashMap<Integer, String> answerList2 = new HashMap<>();
        answerList.put(1, "Answer 1");
        answerList.put(2, "Answer 2");
        answerList.put(3, "Answer 3");
        answerList.put(4, "Answer 4");
        int correctAnswer2 = 4; 
        Question sampleQuestion2 = new Question("Sample Question", answerList2, correctAnswer2);
        quesList.add(sampleQuestion2);
    }

    public void Assessment(){
        int score = 0;
        System.out.println("Welcome to Java Assessment");
        for(int i=0;i<quesList.size();i++){
            System.out.println((i + 1)+". "+quesList.get(i).getQuestionName());
            System.out.println("The Options: ");
            for(Map.Entry<Integer,String> element : quesList.get(i).getAnswerList().entrySet()){

                System.out.println(element.getKey()+". "+element.getValue());
            }
            System.out.println("Enter the correct answer: ");
            int answer = obj.nextInt();
            if(answer == quesList.get(i).getCorrectAnswer()) {
                score++;
            }
        }
        System.out.println("You have secured "+(score/10)*100+ "% in the Java assesment");
    }
}
