  
package edu.yu.intro.objects.quizgenerator;

import java.util.*;
import edu.yu.intro.objects.quizgenerator.AdditionQuestion;

public class QuizGenerator {

    public static void main(String[] args) {
        AdditionQuestion[] questions = new AdditionQuestion[10];  
        int[] answers = new int[10]; 
           
        System.out.println("*******************************");
        System.out.println("Welcome to the addition quiz!");
        System.out.println("*******************************");
        createQuiz(questions);
        administerQuiz(questions, answers);
        showGrade(answers, questions);
            
    }
    
    
    
    public static void createQuiz(AdditionQuestion[] questions) {
        for ( int i = 0; i < 10; i++ ) {
            questions[i] = new AdditionQuestion();  
            
        }
    }
    
    
    
    public static void administerQuiz(AdditionQuestion[] questions, int[] answers) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  %s   ", questionNum, questions[i].getQuestion());
            answers[i] = in.nextInt();
        }
    }
    
    

    public static void gradeQuiz(AdditionQuestion[] questions, int[] answers) {

        System.out.println();
        System.out.println("Here are the correct answers:");
        int numberOfCorrect = 0;
        
        
        for (int i = 0; i < 10; i++) {
            int questionNumber = i + 1;
            System.out.printf("   Question %2d:  %s  Correct answer is %d  ", questionNumber, questions[i].getQuestion(), questions[i].getCorrectAnswer());
            if ( answers[i] == questions[i].getCorrectAnswer() ) {
                System.out.println("You were CORRECT.");
                numberOfCorrect++;
            }
            else {
                System.out.println("You said " + answers[i] + ", which is INCORRECT.");
            }
            
        
        }
    }


    public static void showGrade(int[] answers, AdditionQuestion[] questions) {

        int numberCorrect = 0;
        
        for (int i = 0; i < 10; i++) {
            if ( answers[i] == questions[i].getCorrectAnswer() ) {
                
                numberCorrect++;
            }

        }
        int grade;
        grade = numberCorrect * 10;
        System.out.println();
        System.out.printf("   You got %d questions correct.  %n",numberCorrect);
        System.out.printf("   Your grade on the quiz is %d%n  ",grade);
        

    }  


}