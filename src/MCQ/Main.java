package MCQ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //in the object below has a function to select file and run MCQ automatically

        //AutoReadQuestionsFiles autoRead = new AutoReadQuestionsFiles();
        //autoRead.startTest();

        //but I choose a program that manually selects files to run. That's below

        javaQuest test = new javaQuest();
        HtmlQuest test2 = new HtmlQuest();

        System.out.println("MCQ");
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Choose your Multiple Choice Question Set. The Options are :");
        System.out.println("1. HTML & CSS test");
        System.out.println("2. Java Test");
        System.out.print(" : ");

        int selectQuest = input.nextByte();
        System.out.println();
        System.out.println("START");
        if (selectQuest == 1){
            test2.setName(name);
            test2.GetQuestions();
        }else if (selectQuest == 2){
            test.setName(name);
            test.GetQuestions();
        }



    }
}
